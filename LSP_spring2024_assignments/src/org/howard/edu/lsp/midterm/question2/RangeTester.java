package org.howard.edu.lsp.midterm.question2;

public class RangeTester {

    public static void main(String[] args) {
        // Creating IntegerRange objects for testing
        IntegerRange range1 = new IntegerRange(5, 10);
        IntegerRange range2 = new IntegerRange(8, 15);
        IntegerRange range3 = new IntegerRange(20, 30);
        IntegerRange range4 = new IntegerRange(20, 30);

        // Testing contains method
        System.out.println("Does range1 contain 7? " + range1.contains(7)); // Should print true
        System.out.println("Does range1 contain 12? " + range1.contains(12)); // Should print false

        // Testing overlaps method
        System.out.println("Do range1 and range2 overlap? " + range1.overlaps(range2)); // Should print true
        System.out.println("Do range1 and range3 overlap? " + range1.overlaps(range3)); // Should print false

        // Testing size method
        System.out.println("Size of range1: " + range1.size()); // Should print 6 (10 - 5 + 1)

        // Testing equals method
        System.out.println("Are range1 and range2 equal? " + range1.equals(range2)); // Should print false
        System.out.println("Are range3 and range4 equal? " + range3.equals(range4)); // Should print true
    }
}
