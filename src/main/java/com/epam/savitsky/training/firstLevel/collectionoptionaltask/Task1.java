package com.epam.savitsky.training.firstLevel.collectionoptionaltask;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class Task1 {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader("F://something.txt"));
        Deque<String> poem = new ArrayDeque<>();
        String stroka;

        while ((stroka = bufferedReader.readLine()) != null) {
            poem.push(stroka);
            System.out.println(stroka);
        }
        bufferedReader.close();

        BufferedWriter writer = new BufferedWriter(new FileWriter("F://out.txt"));
        writer.write(String.valueOf(poem));
        writer.close();
    }
}
