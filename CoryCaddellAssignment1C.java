//CoryCaddellAssignment1C.java

import java.util.*;
import java.io.*;

public class CoryCaddellAssignment1C {
	
	/** Program stores and display total population per state. */
	public static void main(String[] args) throws FileNotFoundException {
		
		String dataPerLine;	// contents of each line of data from file
		String[] mapEntry;	// split content of data to array
		String key;			// map structure key.  second to last element of mapEntry array.
		Integer value;		// map structure value. last element of mapEntry array
		Map<String, Integer> CoryCaddellMap = new TreeMap<>();	// data structure containing state and population data
		
		// Read data from file
		File file = new File("Assignment1CData.txt");
		if (!file.exists())
		{
			System.out.print("File does not exist.");
			System.exit(0);
		}

		Scanner input = new Scanner(file);
		while(input.hasNext()) {
			dataPerLine = input.nextLine();
			mapEntry = dataPerLine.split("[,	]");
			
			// Second to last element is key
			key = mapEntry[mapEntry.length - 2].trim();
			// Last element is value
			value = Integer.valueOf(mapEntry[mapEntry.length - 1]);
			
		// Get total population per state
			if (CoryCaddellMap.containsKey(key))
			{
				// Increase existing value
				CoryCaddellMap.put(key, CoryCaddellMap.get(key) + value);
			}
			else {
				// Add entry to data structure
				CoryCaddellMap.put(key, value);
			}
		}
		input.close();
		
		// Display population sum per state to screen in table format
		System.out.printf("%-30s%s\n", "State", "Total Population");
		CoryCaddellMap.forEach((k, v) -> System.out.printf("%-30s%,d\n", k, v));
	}

}
