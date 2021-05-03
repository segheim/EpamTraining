package com.epam.savitsky.training.firstLevel.collectionoptionaltask;

import java.io.*;
import java.util.*;

public class Task4 {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader("F://something.txt"));
        List<String> poem = new ArrayList<>();
        String stroka;

        while ((stroka = bufferedReader.readLine()) != null) {
            poem.add(stroka);
        }
        bufferedReader.close();

        Collections.sort(poem, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.toCharArray().length - o2.toCharArray().length;
            }
        });

        BufferedWriter writer = new BufferedWriter(new FileWriter("F://out.txt"));
        writer.write(String.valueOf(poem));
        writer.close();
    }
}