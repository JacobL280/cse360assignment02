/**
 *  The adding machine class will add and subtract integers from a variable and keep
 *  track of the total. It will also print upon request.
 *
 *  @author Jacob Licko
 *  @version 1.0
 *  date: 10/2/2020
 */
package cse360assignment02;

public class AddingMachine {
    private int total;
    private String currentValue = "0";

    /**
     * This private helper method keeps the log of the operations performed
     *
     * @param timEliot " + val" or " - val" and appends them onto the currentValue of operations
     */
    private void log(String timEliot) {
        currentValue = currentValue + timEliot;
    }

    // Constructor for the adding machine
    public AddingMachine () {
        total = 0;  // not needed - included for clarity
    }

    /**
     *  This method returns the current total
     *  @return int
     */
    public int getTotal () {
        return total;
    }

    /**
     *  This method will add an integer to the current total
     *  @param value the parameter to add to the total
     */
    public void add (int value) {
        String sum = " + " + value;
        total = total + value;
        log(sum);
    }

    /**
     *  This method will subtract an integer from the current total
     *  @param value the parameter to subtract from the total
     */
    public void subtract (int value) {
        String diff = " - " + value;
        total = total - value;
        log(diff);
    }

    /**
     *  This method will keep track of the operations performed on the total and print them
     *
     */
    public String toString () {
        return currentValue;
    }

    // This method will clear the memory and set the total to zero
    public void clear() {
        total = 0;
        currentValue = "0";
    }
}