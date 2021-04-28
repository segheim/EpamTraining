package com.epam.savitsky.training.firstLevel.fundamentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainTask2 {
    public static String reverseString(String str) {
        char[] array = str.toCharArray();
        String reverseResult = "";
        for (int i = array.length - 1; i >= 0; i--) {
            reverseResult = reverseResult + array[i];
        }
        return reverseResult;
    }
    public static void main(String[] args) throws IOException {
        System.out.println("Enter your name: ");
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String line = read.readLine();
        String reverseLine = reverseString(line);
        System.out.println("reverse line: " + reverseLine);
    }
}
