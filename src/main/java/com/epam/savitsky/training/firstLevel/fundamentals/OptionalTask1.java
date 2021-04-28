package com.epam.savitsky.training.firstLevel.fundamentals;

public class OptionalTask1 {
    public static void main(String[] args) {
        int[] arrayInt = {531, 82, 4, 6549, 544, 23};
        String[] array = new String[6];
        for (int i = 0; i < arrayInt.length; i++ ){
            array[i] = Integer.toString(arrayInt[i]);
            System.out.println(array[i]);
        }
        int max = array[0].length();
        int min = max;
        String minNumber = null;
        String maxNumber = null;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > max){
                max = array[i].length();
                maxNumber = array[i];

            }
            if (array[i].length() < min){
                min = array[i].length();
                minNumber = array[i];
            }

        }
        System.out.println("Min number: " + minNumber);
        System.out.println("Min length of number: " + min);
        System.out.println("Max number: " + maxNumber);
        System.out.println("Max length of number: " + max);
    }
}