package ru.dataart.academy.java;

public class Main {
    public static void main(String[] args) throws ReverseIntegerException {
        ReverseInteger reverseInteger = new ReverseInteger();
        int counter = 1;
        while (counter <= 3) {
            try {
                switch (counter) {
                    case 1:
                        System.out.println("Reverse integer works: " + reverseInteger.reverse(-456));break;
                    case 2:
                        System.out.println("Reverse integer works for big negative value: " + reverseInteger.reverse(-2147483648));break;
                    case 3:
                        System.out.println("Reverse integer works for big positive value: " + reverseInteger.reverse(-2147483647));
                }
            } catch (ReverseIntegerException e) {
                System.out.println(e.getMessage());
            }
            counter++;
        }
    }
}