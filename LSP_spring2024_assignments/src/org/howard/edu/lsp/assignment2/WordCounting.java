package org.howard.edu.lsp.assignment2;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.HashMap;

public class WordCounting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		HashMap<String, Integer> word_count_hashmap = new HashMap<String, Integer>();
	try {
//		String current_dir = System.getProperty("user.dir");
//		
//		String package_dir = WordCounting.class.getPackageName().replace(".", "\\"); 
//		
//		String full_dir = current_dir + "\\src" + "\\" + package_dir + "\\" + "words.txt";
		
//		File myfile = new File(WordCounting.class.getResource("words.txt").getFile());
//		File myfile = new File(WordCounting.class.getResourceAsStream("words.txt"));

		File myfile =  new File("src/words.txt");
		Scanner myReader = new Scanner(myfile);
		while (myReader.hasNextLine()) {
			String data = myReader.nextLine();
			
//			splitting with two delimiters a space and an apostrophe for words like we've and we'll
			String[] words = data.split("[\\s']");    
			for (String word:words) {
					
				if (word.length() > 3) {
					for (int i = 0; i < word.length(); i ++) {
						if (Character.isLetter(word.charAt(i))) {
								if (word_count_hashmap.containsKey(word.toLowerCase())) {
									word_count_hashmap.put(word.toLowerCase(), word_count_hashmap.get(word.toLowerCase()) + 1);
								}
								else {
									word_count_hashmap.put(word.toLowerCase(), 1);
								}
							
						break;
						}
					
					}	
					
				}			
			}
		}
		
		myReader.close();
	}
	catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	
	word_count_hashmap.entrySet().forEach(word->{
	    System.out.println(word.getKey() + " " + word.getValue());  
	});
	
	}

	private static Object getResource(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
