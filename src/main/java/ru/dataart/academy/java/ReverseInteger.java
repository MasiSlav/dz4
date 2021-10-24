package ru.dataart.academy.java;

import java.io.IOException;

public class ReverseInteger {
    /**
     * @param inputNumber - any integer value
     * @return - inputNumber in reversed order
     * Example: 1234 -> 4321
     * -23 -> -32
     * 120 -> 21
     * -2,147,483,648 -> exception and error message
     * If result (number in reversed order) is out of int range [-2,147,483,648,  2,147,483,647] throw custom
     * unchecked exception. In main method (Main class) if exception happened output message with problem to user.
     */
    public int reverse(int inputNumber) throws RuntimeException {
        boolean negative = false;
        if (inputNumber == Integer.MAX_VALUE || inputNumber == Integer.MIN_VALUE)
            throw new ReverseIntegerException("Exception acquired");
        int divided;
        int reversed = 0;
        if (inputNumber < 0) {
            negative = true;
            inputNumber *= -1;
        }
        int divCount=0;
        while (inputNumber > 0) {
            divided = inputNumber % 10;
            reversed = reversed * 10 + divided;
            divCount+=1;
            if ((reversed%100000000>2) && divCount>8)
                throw new ReverseIntegerException("Exception acquired");
            inputNumber /= 10;
        }
        if (negative)
            reversed *= -1;
        inputNumber = reversed;
        return inputNumber;


    }
}
