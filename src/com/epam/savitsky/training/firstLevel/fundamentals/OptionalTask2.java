package com.epam.savitsky.training.firstLevel.fundamentals;

import java.util.Arrays;

public class OptionalTask2 {
    public static void main(String[] args) {
        int[] arrayInt = {531, 8532, 4, 654966, 54646, 23};
        String[] array = new String[6];
        boolean sorted = true;
        for (int i = 0; i < arrayInt.length; i++) {
            array[i] = Integer.toString(arrayInt[i]);
            System.out.println(array[i]);
        }
        while (sorted) {
            sorted = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i].length() < array[i - 1].length()) {
                    String temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    sorted = true;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println(Arrays.toString(array));
    }
}
