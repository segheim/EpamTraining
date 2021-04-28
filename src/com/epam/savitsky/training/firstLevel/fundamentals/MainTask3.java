package com.epam.savitsky.training.firstLevel.fundamentals;

public class MainTask3 {
    public static void main(String[] args) {
        int max = Integer.MAX_VALUE;
        Integer numberOne = (int)(Math.random()*max);
        Integer numberTwo = (int)(Math.random()*max);
        Integer numberThree = (int)(Math.random()*max);
        System.out.println("Three random Numbers: " + numberOne + "  " + numberTwo + "  " + numberThree);
        System.out.println(numberOne+ "\n" + numberTwo + "\n" + numberThree);

    }
}
