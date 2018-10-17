import java.io.*;
import java.util.*;

public class Avengers {
	public static void main(String[] args) {
		
		//Holds the script line by line
		List<String> script;
		
		//Read in the script using the read in method
		script = readFile(new File("AvengersScript.txt"));
		
		//Print the script to the screen
		for(String s : script) {
			System.out.println(s);
		}
		
		script = removeWhiteSpace(script);
		
		for(String s : script) {
			System.out.println(s);
		}
		
	}//end main()

	//===================================================================================================================
	
	//Reads in a specified file into an array list and returns the result
	public static List<String> readFile(File file) {
		
		List<String> result = new ArrayList<>();
		
		try {
			
			String line;
			
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			//Adds line to the result list. if line == null, then the file is completely read in.
			while ((line = br.readLine()) != null) {
				result.add(line);
			}
			
		} catch (IOException e) {
			System.out.printf("File \'%s\' was not found.", file.getName());
		}
		
		return result;
	}//end readFile()
	
	//===================================================================================================================
	
	//Removes all empty lines in an arrayList
	public static List<String> removeWhiteSpace(List<String> list) {
		
		List<String> newList = new ArrayList<>();
		
		//Adds the item from the old list to the new list so long as it is not equal to ""
		for(String s : list) {
			if(!s.equals(""))
				newList.add(s);
		}
		
		return newList;
	}//end removeWhiteSpace
	
	//===================================================================================================================
}//end Avengers.java
