package com.epam.savitsky.training.firstLevel.fundamentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainTask1 {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter your name: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        System.out.println("\nHello my friend, " + name + "!");

    }

}