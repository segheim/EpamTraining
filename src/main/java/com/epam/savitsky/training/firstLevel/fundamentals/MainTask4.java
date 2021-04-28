package com.epam.savitsky.training.firstLevel.fundamentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainTask4 {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter number one: ");
        BufferedReader readOne = new BufferedReader(new InputStreamReader(System.in));
        int numberOne = Integer.parseInt(readOne.readLine());
            System.out.println("Enter number two: ");
            BufferedReader readTwo = new BufferedReader(new InputStreamReader(System.in));
            int numberTwo = Integer.parseInt(readTwo.readLine());
                System.out.println("Enter number three: ");
                BufferedReader readThree = new BufferedReader(new InputStreamReader(System.in));
                int numberThree = Integer.parseInt(readThree.readLine());
        int sum = numberOne + numberTwo +numberThree;
        System.out.println("Sum of numbers: " + sum);


    }
}
