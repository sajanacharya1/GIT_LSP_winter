package org.howard.edu.lsp.assignment5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class IntegerSetTest {
    
    private IntegerSet integerSet;
    
    @BeforeEach
    void setUp() {
        integerSet = new IntegerSet();
    }

    @Test
    @DisplayName("Test case for clear method")
    public void testClear() {
        integerSet.add(1);
        integerSet.add(2);
        integerSet.add(3);
        integerSet.clear();
        assertTrue(integerSet.isEmpty());
    }

    @Test
    @DisplayName("Test case for length")
    public void testLengthEven() {
        integerSet.add(1);
        integerSet.add(2);
        assertEquals(2, integerSet.length());
        integerSet.add(3);
        integerSet.add(4);
        assertEquals(4, integerSet.length());
    }


    @Test
    @DisplayName("Test case for equals")
    public void testEquals() {
        IntegerSet set1 = new IntegerSet(new ArrayList<>(List.of(1, 2, 3)));
        IntegerSet set2 = new IntegerSet(new ArrayList<>(List.of(3, 2, 1)));
        assertTrue(set1.equals(set2));
    }
    
    @Test
    @DisplayName("Test case for equals when the set is not equal")
    public void testEqualsFalse() {
        IntegerSet set1 = new IntegerSet(new ArrayList<>(List.of(1, 2, 3)));
        IntegerSet set2 = new IntegerSet(new ArrayList<>(List.of(4, 5, 6)));
        assertFalse(set1.equals(set2));
    }

    @Test
    @DisplayName("Test case for contains")
    public void testContains() {
        integerSet.add(1);
        integerSet.add(2);
        assertFalse(integerSet.contains(3));
        assertTrue(integerSet.contains(1));
    }

   
    @Test
    @DisplayName("Test case for largest")
    public void testLargest() {
        IntegerSet set1 = new IntegerSet(new ArrayList<>(List.of(1, 8, 10)));
        IntegerSet set2 = new IntegerSet(new ArrayList<>());
        assertThrows(IntegerSet.IntegerSetException.class, () -> {
            set2.largest();
        });
        
        assertDoesNotThrow(() -> {
            assertEquals(10, set1.largest());
        });
    }


    @Test
    @DisplayName("Test case for smallest")
    public void testSmallest() {
        integerSet.add(1);
        integerSet.add(8);
        integerSet.add(10);
        assertDoesNotThrow(() -> {
            assertEquals(1, integerSet.smallest());
        });
    }

    @Test
    @DisplayName("Test case for add")
    public void testAdd() {
        integerSet.add(5);
        integerSet.add(10);
        assertTrue(integerSet.contains(5));
        assertTrue(integerSet.contains(10));
        assertFalse(integerSet.contains(15));
    }

    @Test
    @DisplayName("Test case for remove")
    public void testRemove() {
        integerSet.add(5);
        integerSet.add(10);
        integerSet.remove(5);
        assertFalse(integerSet.contains(5));
    }

    @Test
    @DisplayName("Test case for union")
    public void testUnion() {
        IntegerSet set1 = new IntegerSet(new ArrayList<>(List.of(5, 6, 7)));
        IntegerSet set2 = new IntegerSet(new ArrayList<>(List.of(3, 4, 5)));
        IntegerSet set3 = new IntegerSet(new ArrayList<>(List.of(3, 4, 5,6,7)));
        set1.union(set2);
        assertTrue(set1.contains(4));
        assertTrue(set1.contains(5));
        assertFalse(set1.contains(10));
        assertEquals(set1, set3);
        
    }

    @Test
    @DisplayName("Test case for intersect")
    public void testIntersect() {
        IntegerSet set1 = new IntegerSet(new ArrayList<>(List.of(1, 8, 10)));
        IntegerSet set2 = new IntegerSet(new ArrayList<>(List.of(10,11, 12)));
        IntegerSet set3 = new IntegerSet(new ArrayList<>(List.of(10)));
        set1.intersect(set2);   
        assertFalse(set1.contains(1));
        assertFalse(set1.contains(8)); 
        assertTrue(set1.contains(10));
        assertEquals(set1, set3);
    }

    @Test
    @DisplayName("Test case for diff")
    public void testDiff() {
        IntegerSet set1 = new IntegerSet(new ArrayList<>(List.of(1, 2, 3)));
        IntegerSet set2 = new IntegerSet(new ArrayList<>(List.of(3, 4, 5)));
        IntegerSet set3 = new IntegerSet(new ArrayList<>(List.of(1, 2)));
        
        set1.diff(set2);
        assertEquals(set1, set3);

    }

    @Test
    @DisplayName("Test case for complement")
    public void testComplement() {
        IntegerSet set1 = new IntegerSet(new ArrayList<>(List.of(1, 2, 3)));
        IntegerSet set2 = new IntegerSet(new ArrayList<>(List.of(3, 4, 5)));
        IntegerSet set3 = new IntegerSet(new ArrayList<>(List.of(4, 5)));
        set1.complement(set2);
        assertEquals(set1, set3);
    }

    @Test
    @DisplayName("Test case for isEmpty")
    public void testIsEmpty() {
    	IntegerSet set1 = new IntegerSet(new ArrayList<>());
        assertTrue(set1.isEmpty());
        
        IntegerSet set2 = new IntegerSet(new ArrayList<>(List.of(1, 2, 3)));
        assertFalse(set2.isEmpty());
    }

    @Test
    @DisplayName("Test case for toString")
    public void testToString() {
        integerSet.add(5);
        integerSet.add(10);
        assertEquals("[5, 10]", integerSet.toString());
    }

    @Test
    @DisplayName("Test case for largest() when set is empty")
    public void testLargestEmptySet() {
    	IntegerSet set1 = new IntegerSet(new ArrayList<>());
        assertThrows(IntegerSet.IntegerSetException.class, () -> {
        	set1.largest();
            
        });
    }

    @Test
    @DisplayName("Test case for smallest() when set is empty")
    public void testSmallestEmptySet() {
    	IntegerSet set1 = new IntegerSet(new ArrayList<>());
        assertThrows(IntegerSet.IntegerSetException.class, () -> {
        	set1.smallest();
        });
    }
}
