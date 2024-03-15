package org.howard.edu.lsp.midterm.question1;

/**
 * The SecurityOps class provides methods for encrypting text.
 */
public class SecurityOps {
	
	/**
     * Encrypts a given text by extracting only letters and digits and rearranging them.
     *
     * @param text the text to be encrypted
     * @return the encrypted text
     */
	public static String encrypt(String text) {
		
		
		String letters_only = "";
	    String final_excrypted_text = "";

	 // Remove non-alphanumeric characters
	    for (int i = 0; i < text.length(); i++)  {
	        if (Character.isLetter(text.charAt(i)) || Character.isDigit(text.charAt(i))) {
	            letters_only = letters_only + text.charAt(i);
	        }
	    }

	 // Add characters at even index from 0
	    for (int j = 0; j < letters_only.length(); j++) {
	        if (j % 2 == 0) { // Check if the index is even
	            final_excrypted_text = final_excrypted_text + letters_only.charAt(j);
	        }
	    }

	 // Add characters at odd index from 0
	    for (int k = 0; k < letters_only.length(); k++) {
	    if (k % 2 != 0) { // Check if the index is odd
	        final_excrypted_text = final_excrypted_text + letters_only.charAt(k);
	        }
	    }
	    return final_excrypted_text;
	}
    
}
