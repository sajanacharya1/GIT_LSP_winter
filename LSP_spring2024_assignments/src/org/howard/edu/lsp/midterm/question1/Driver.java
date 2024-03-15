package org.howard.edu.lsp.midterm.question1;
/**
 * The Driver class contains the main method to test the SecurityOps class.
 */
public class Driver {
	/**
     * The main method to test the encrypt method of the SecurityOps class.
     *
     * @param args the command-line arguments (not used)
     */
	    public static void main(String[] args) {
	    	
	    	// Test case 1
	        String string1 = "I love CSCI363";
	        System.out.println("Original is: " + string1 + ", encrypted iss: " + SecurityOps.encrypt(string1));

	        // Test case 2
	        String string2= "a1b2c3d4e5f6g";
	        System.out.println("Original is: " + string2 + ", encrypted iss: " + SecurityOps.encrypt(string2));
	    }
	}