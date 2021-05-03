package com.epam.savitsky.training.firstLevel.collectionoptionaltask;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Task6 {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader("F://something.txt"));
        String line;
        List<String> poem = new ArrayList<>();

        while ((line = bufferedReader.readLine()) != null){
            poem.add(line);
        }
        System.out.println(poem);
        poem.sort((o1, o2) -> Integer.compare(o1.length(), o2.length()));
        System.out.println(poem);
    }
}