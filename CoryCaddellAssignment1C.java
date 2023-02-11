//CoryCaddellAssignment1C.java

import java.util.*;
import java.io.*;

public class CoryCaddellAssignment1C {
	
	/** Program stores and display total population per state. */
	public static void main(String[] args) throws FileNotFoundException {
		
		Map<String, Integer> CoryCaddellStructure = new TreeMap<>(); 
		
	// Read data from file
		// Check to see if file exists
		File file = new File("Assignment1CData.txt");
		if (!file.exists())
		{
			System.out.print("File does not exist.");
			System.exit(0);
		}
		// While file has next line
		Scanner input = new Scanner(file);
		while(input.hasNext()) {
			// Read line of text
			String dataPerLine = input.nextLine();
			// Split out words from input variable
			String[] mapEntry = dataPerLine.split("[, 	]");
			// Second to last element will be key in Map
			String key = mapEntry[mapEntry.length - 2];
			// Last element will be value in Map
			Integer value = Integer.valueOf(mapEntry[mapEntry.length - 1]);
			
	// Get total population per state
			// If key is already present in Map
			if (CoryCaddellStructure.containsKey(key))
			{
				// Increase value by current population value
				CoryCaddellStructure.put(key, CoryCaddellStructure.get(key) + value);
			}
			else {
				// Add entry to data structure
				CoryCaddellStructure.put(key, value);
			}
		}
		input.close();
		
	// Display population sum per state to screen in table format
		System.out.printf("%-20s%s\n", "State", "Total Population");
		CoryCaddellStructure.forEach((key, value) -> System.out.printf("%-20s%,d\n", key, value));
	}

}
