package edu.ul.android.favorite;

public class Validators {

    /**
     * Test if a string is a valid IP Address
     * @param s the input string to test
     * @return true if valid, else false
     */
    public Boolean isIpAddress(String s) {
        // TODO: put your code here
        return s.matches("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}");
    }

    /**
     * Test if a string is a valid Binary Value
     * @param s the input string to test
     * @return true if valid, else false
     */
    public Boolean isBinaryValue(String s) {
        // TODO: put your code here
        return s.matches("-?[01]+");
    }

    /**
     * Test if a string is a valid Hexadecimal Value
     * @param s the input string to test
     * @return true if valid, else false
     */
    public Boolean isHexadecimalValue(String s) {
        // TODO: put your code here
        return s.matches("-?[0-9a-fA-F]+");
    }
}
