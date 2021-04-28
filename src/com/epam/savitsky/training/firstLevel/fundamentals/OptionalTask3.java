package com.epam.savitsky.training.firstLevel.fundamentals;

public class OptionalTask3 {
    public static void main(String[] args) {
        int[] array = {123,9634,5692,34,78930064,33456724,3334534,5565438,33456,4,3434};
        int[] arrayLong = new int[array.length];
        int number;
        int middleLong;
        int sumLong = 0;

        for (int i = 0; i < array.length; i++) {
            number = array[i];
            int index = 0;
            while (number > 0) {
                number /= 10;
                index++;
            }
            arrayLong[i] = index;
        }
        for (int i = 0; i < arrayLong.length; i++) {
            sumLong += arrayLong[i];
        }
        middleLong = sumLong/arrayLong.length;
        for (int i = 0; i < array.length; i++) {
            if (arrayLong[i] < middleLong){
                System.out.println("Number is less length than the average length :" + array[i]);
                System.out.println("Length of number :" + arrayLong[i]);
            }
        }
    }
}
