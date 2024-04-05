package org.howard.edu.lsp.assignment5;
/**
 * This class serves as a driver program to test the functionality of the IntegerSet class.
 * It contains a series of tests for various methods of the IntegerSet class.
 */
public class Driver {

    public static void main(String[] args) throws Exception {

        // Test for the add method without value present
        System.out.println("\n------------------Testing add Method without value present----------------------");
        IntegerSet set1 = new IntegerSet();
        System.out.println("Initial value of Set1: " + set1.toString());
        set1.add(1);
        set1.add(2);
        set1.add(3);
        System.out.println("Value of Set1 after adding elements: " + set1.toString());

        // Test for the add method with value already present
        System.out.println("\n------------------Testing add Method with value already present----------------------");
        System.out.println("Initial value of Set1: " + set1.toString());
        set1.add(2); // Adding value 2 again, which is already present
        System.out.println("Value of Set1 after adding element 2 again: " + set1.toString());


        // Test for the length method
        System.out.println("\n------------------Testing length method----------------------");
        System.out.println("Length of Set1: " + set1.length());


        // Test for the clear method
        System.out.println("\n------------------Testing clear method----------------------");
        System.out.println("Initial value of Set1: " + set1.toString());
        set1.clear();
        System.out.println("Value of Set1 after clearing: " + set1.toString());


        // Test for the equals method
        System.out.println("\n------------------Testing equals method----------------------");
        set1.add(1);
        set1.add(2);
        set1.add(3);
        IntegerSet set2 = new IntegerSet();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        System.out.println("Initial value of Set1: " + set1.toString());
        System.out.println("Initial value of Set2: " + set2.toString());
        System.out.println("Are Set1 and Set2 equal? " + set1.equals(set2));

        // Test for the contains method
        System.out.println("\n------------------Testing contains method:----------------------");
        System.out.println("Does Set1 contain 3? " + set1.contains(3));
        System.out.println("Does Set1 contain 5? " + set1.contains(5));


        // Test for the largest method
        System.out.println("\n------------------Testing largest method:----------------------");
        System.out.println("Largest value in Set1: " + set1.largest());

        // Test for the smallest method
        System.out.println("\n------------------Testing smallest method:----------------------");
        System.out.println("Smallest value in Set1: " + set1.smallest());

        // Test for the remove method with value present
        System.out.println("\n------------------Testing remove method with value present----------------------");
        System.out.println("Initial value of Set1: " + set1.toString());
        set1.remove(2);
        System.out.println("Value of Set1 after removing element 2: " + set1.toString());

        // Test for the remove method with value not present
        System.out.println("\n------------------Testing remove method with value not present----------------------");
        System.out.println("Initial value of Set1: " + set1.toString());
        set1.remove(10); // Attempting to remove a value not present in the set
        System.out.println("Value of Set1 after attempting to remove element 10: " + set1.toString());

        // Test for the union method
        System.out.println("\n------------------Testing union method:----------------------");
        set2.add(3);
        set2.add(4);
        set2.add(5);
        System.out.println("Initial value of Set1: " + set1.toString());
        System.out.println("Initial value of Set2: " + set2.toString());
        set1.union(set2);
        System.out.println("Result of union of Set1 and Set2: " + set1.toString());

        // Test for the intersect method
        System.out.println("\n------------------Testing intersect method:----------------------");
        set1.clear();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        System.out.println("Initial value of Set1: " + set1.toString());
        System.out.println("Initial value of Set2: " + set2.toString());
        set1.intersect(set2);
        System.out.println("Result of intersection of Set1 and Set2: " + set1.toString());

        // Test for the diff method
        System.out.println("\n------------------Testing diff method:----------------------");
        set1.clear();
        set1.add(1);
        set1.add(2);
        set1.add(4);
        set1.add(6);
        System.out.println("Initial value of Set1: " + set1.toString());
        System.out.println("Initial value of Set2: " + set2.toString());
        set1.diff(set2);
        System.out.println("Result of difference between Set1 and Set2: " + set1.toString());

        // Test for the complement method
        System.out.println("\n------------------Testing complement method:----------------------");
        System.out.println("Initial value of Set1: " + set1.toString());
        System.out.println("Initial value of Set2: " + set2.toString());
        set1.complement(set2);
        System.out.println("Result of complement of Set1 with respect to Set2: " + set1.toString());

        // Test for the isEmpty method
        System.out.println("\n------------------Testing isEmpty method----------------------");
        System.out.println("Initial value of Set1: " + set1.toString());
        set1.clear();
        System.out.println("Value of Set1 after clearing: " + set1.toString());
        System.out.println("Is Set1 empty? " + set1.isEmpty());

    }
}

