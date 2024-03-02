package org.howard.edu.lsp.assignment4;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

/**
 * IntegerSet represents a set of integers and provides various operations
 * such as union, intersection, difference, and more.
 */
public class IntegerSet {
    // Store the set elements in an ArrayList
    private List<Integer> set = new ArrayList<>();

    // Default Constructor
    public IntegerSet() {
    }

    /**
     * Constructor initializes the set with the provided ArrayList of integers.
     * @param set ArrayList of integers to initialize the set
     */
    public IntegerSet(ArrayList<Integer> set) {
        this.set = set;
    }

    /**
     * Clears the internal representation of the set.
     */
    public void clear() {
        set.clear();
    }

    /**
     * Returns the number of elements in the set.
     * @return the length of the set.
     */
    public int length() {
        return set.size();
    }

    /**
     * Checks if the 2 sets are equal, false otherwise;
     * @param o an object to compare with this IntegerSet
     * @return true if two sets are equal with same values in ANY order
     */
    public boolean equals(Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || this.getClass() != o.getClass()) {
          return false;
      }
      IntegerSet otherSet = (IntegerSet) o;
      set.sort(null);
      otherSet.set.sort(null);
      return this.set.equals(otherSet.set);
    }

    /**
     * Checks if the set contains the specified value.
     * @param value the value to check for existence in the set
     * @return true if the set contains the value, false otherwise
     */
    public boolean contains(int value) {
        return set.contains(value);
    }

    /**
     * Returns the largest element in the set.
     * @return the largest element in the set
     * @throws IntegerSetException if the set is empty
     */
    public int largest() throws Exception {
        if (this.set.isEmpty()) {
            throw new IntegerSetException("IntegerSetException -> Set is Empty");
        }
        return (Collections.max(this.set));
    }

    /**
     * Returns the smallest element in the set.
     * @return the smallest element in the set
     * @throws IntegerSetException if the set is empty
     */
    public int smallest() throws Exception {
        if (this.set.isEmpty()) {
            throw new IntegerSetException("IntegerSetException -> Set is Empty");
        }
        return Collections.min(this.set);
    }

    /**
     * Adds the specified integer to the set if it is not already present.
     * @param i the integer to add to the set
     */
    public void add(int i) {
        if (!set.contains(i)) {
            set.add(i);
        }
    }

    /**
     * Removes the specified integer from the set if it exists.
     * @param item the integer to remove from the set
     */
    public void remove(int item) {
        if (set.contains(item)) {
            set.remove(Integer.valueOf(item));
        }
    }

    /**
     * Performs the union operation with the specified IntegerSet: i.e., s1 U s2.
     * @param intSetb the IntegerSet to perform union with
     */
    public void union(IntegerSet intSetb) {
        for (int i = 0; i <intSetb.set.size(); i++ ) {
            if (!this.set.contains(intSetb.set.get(i))) {
                this.set.add(intSetb.set.get(i));
            }
        }
    }

    /**
     * Performs the intersection operation with the specified IntegerSet: i.e., s1 intersect s2.
     * @param intSetb the IntegerSet to perform intersection with
     */
    public void intersect(IntegerSet intSetb) {
        ArrayList<Integer> newSet = new ArrayList<>();
        for (int i = 0; i <intSetb.set.size(); i++ ) {
            if (this.set.contains(intSetb.set.get(i))) {
                newSet.add(intSetb.set.get(i));
            }
        }
        this.set = newSet;
    }


    /**
     * Performs the difference operation with the specified IntegerSet.i.e., s1 –s2
     * @param intSetb the IntegerSet to perform difference with
     */
    public void diff(IntegerSet intSetb) { // set difference, i.e. s1 - s2
//        set1 - set 2 = values present in set1 but not in set2
        for (int i = 0; i <intSetb.set.size(); i++ ) {
            if (this.set.contains(intSetb.set.get(i))) {
                this.remove(intSetb.set.get(i));
            }
        }
    }

    /**
     * Calculates the complement of the set with respect to the specified IntegerSet.
     * @param intSetb the IntegerSet to calculate complement with
     */
    public void complement(IntegerSet intSetb) {
        IntegerSet obj = new IntegerSet();
        obj.union(intSetb);
        for (int i = 0; i < this.set.size(); i++) {
            obj.remove(this.set.get(i));
        }
        this.set = obj.set;
    }

    /**
     * Checks if the set is empty.
     * @return true if the set is empty, false otherwise
     */
    boolean isEmpty() {
        return set.isEmpty();
    }

    /**
     * Returns a string representation of the set.
     * @return a string representation of the set
     */
    public String toString() {
        return this.set.toString();
    }

    /**
     * Custom exception class for throwing IntegerSetException.
     */
    public static class IntegerSetException extends Exception {
        public IntegerSetException(String message) {
            super(message);
        }
    }
}




