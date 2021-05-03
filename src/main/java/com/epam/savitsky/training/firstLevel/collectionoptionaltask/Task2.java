package com.epam.savitsky.training.firstLevel.collectionoptionaltask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Stack;

public class Task2 {
    public static void main(String[] args) throws IOException {
        System.out.print("Enter number: ");
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        Long number = Long.parseLong(read.readLine());
        long digit;

        List<Long> stack = new Stack<>();

        while (number > 0){
            digit = number % 10;
            stack.add(digit);
            number /= 10;
        }

        for (Long s: stack){
            s.toString();
            System.out.print(s);
        }
    }
}
