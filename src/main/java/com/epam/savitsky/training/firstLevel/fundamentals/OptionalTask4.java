package com.epam.savitsky.training.firstLevel.fundamentals;

public class OptionalTask4 {
    public static void main(String[] args) {
        int[] arrayInt = {373837, 8742, 47643, 94621669, 5474, 2473};
        int minCount = 0;
        int minIndex = 0;
        int count = 0;

        for (int i = 0; i < arrayInt.length; i++) {
            int[] arrayDig = new int[10];
            int index;
            for (int k = 0; k < arrayDig.length; k++) {
                arrayDig[k] = 0;
            }
            int number = arrayInt[i];
                while (number > 0){
                index = number%10;
                arrayDig[index]++;
                number /= 10;
            }
            for (int j = 0; j < arrayDig.length; j++) {
                if (arrayDig[j] > 0) {
                    count++;
                }
            }
            if (i == 0) {
                minCount = count;
                minIndex = i;
            }
            if (minCount > count) {
                minCount = count;
                minIndex = i;
            }
                count = 0;
        }
        System.out.println("Min number of non-repeating digits: " + minCount);
        System.out.println("First number with min non-repeating digits: " + arrayInt[minIndex]);
    }
}
