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
		// While file has next line, read line of text and store in input variable
		Scanner input = new Scanner(file);
		while(input.hasNext()) {
			String dataPerLine = input.nextLine();
			String[] mapEntry = dataPerLine.split("[, ]");
			String key = mapEntry[mapEntry.length -1];
			Integer value = Integer.valueOf(mapEntry[mapEntry.length - 2]);
			CoryCaddellStructure.put(key, value);
		}
		input.close();
		// Split out words from input variable, and store in a Map data structure
			// Ignore text before comma, comma, and white spaces
			// First word after comma will be key in Map
			// Number following key will be value in Map
				// Convert number to an integer
	// Sum total population per state
		// If key is already present in Map, increase value by current population value
	// Display population sum per state to screen in table format
	}

}
