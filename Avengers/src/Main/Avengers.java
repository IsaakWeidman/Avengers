package Main;

import java.io.*;
import java.util.*;

public class Avengers {
	public static void main(String[] args) {
		
		//Holds the script line by line
		List<String> script;
		List<String> lines;
		List<String> words;
		
		//Read in the script using the read in method
		script = readFile(new File("AvengersScript.txt"));
		
		//Print the script to the screen
		for(String s : script) {
			System.out.println(s);
		}
		
		System.out.println("===========================================================================================");
		
		lines = removeWhiteSpace(script);
		
		for(String s : lines) {
			System.out.println(s);
		}
		
		System.out.println("===========================================================================================");
		
		words = splitList(lines, "\\s\\,");
		
		for(String s : words) {
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
		
		//Remove empty lines and any unnecessary white space. (tabs before/after text, and spaces more than one lone)
		//TODO remove extra whitespace from important lines
		List<String> newList = new ArrayList<>();
		
		//Adds the item from the old list to the new list so long as it is not equal to ""
		for(String s : list) {
			if(!s.isEmpty())
				newList.add(s);
		}
		
		return newList;
	}//end removeWhiteSpace
	
	//===================================================================================================================
	
	public static List<String> splitList(List<String> source, String pattern) {
		
		List<String> words = new ArrayList<>();
		
		Scanner scan;
		
		for(String s : source) {
			scan = new Scanner(s).useDelimiter(pattern);
			
			words.add(scan.next());
		}
		
		return words;
	}
}//end Main.Avengers.java
