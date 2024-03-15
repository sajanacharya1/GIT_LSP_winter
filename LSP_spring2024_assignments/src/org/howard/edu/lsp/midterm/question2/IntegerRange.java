package org.howard.edu.lsp.midterm.question2;

public class IntegerRange implements Range {

    private int lowerBound;
    private int upperBound;


    public IntegerRange() {
        // Default constructor sets lower and upper bounds to 0
        this.lowerBound = 0;
        this.upperBound = 0;
    }

    public IntegerRange(int lowerBound, int upperBound) {
        // Constructor with specified lower and upper bounds
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    public void setUpperBound(int upperBound) {
        // Setter for upper bound
        this.upperBound = upperBound;
    }

    public void setLowerBound(int lowerBound) {
        // Setter for lower bound
        this.lowerBound = lowerBound;
    }

    @Override
    public boolean contains(int value) {
        // Check if the value is within the range
        if (this.lowerBound <= value && value <= this.upperBound) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean overlaps(Range other) {
        // Check if this range overlaps with another range
        if (this.lowerBound <= ((IntegerRange) other).upperBound &&
                this.upperBound >= ((IntegerRange) other).lowerBound) {
            return true;
        } else {
            return false;
        }
    }


        @Override
        public int size() {
            // Calculate the size of the range
            return this.upperBound - this.lowerBound + 1;
        }

        public boolean equals(Range other) {
            if (!(other instanceof IntegerRange)) {
                return false;
            }
            IntegerRange otherRange = (IntegerRange) other;
            if ( this.lowerBound == otherRange.lowerBound && this.upperBound == otherRange.upperBound) {
            	return true;
            }
            else {
            	return false;
            }
        }
}
