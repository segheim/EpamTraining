package com.epam.savitsky.training.firstLevel.collectionoptionaltask;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
       public static void main(String[] args) {

            List<Integer> integers = new ArrayList<>();
            integers.add(23);
            integers.add(-8);
            integers.add(-47);
            integers.add(-2);
            integers.add(29);
            integers.add(-34);
            integers.add(-83);
            integers.add(76);
            integers.add(34);
            integers.add(-53);
           integers.add(7);
           integers.add(-4);
           integers.add(33);
           integers.add(-3);
           integers.add(-6);
           integers.add(-44);
           integers.add(-53);
           integers.add(7);
           integers.add(-4);
           integers.add(33);

           System.out.println(integers);

            int count = 0;
           int ost = 0;
            while (count < integers.size() - ost){
                if (integers.get(count) < 0){
                    integers.add(integers.get(count));
                    integers.remove(count);
                    ost++;
                    count -=1;
                }
                count++;
            }
           System.out.println(integers);
       }
}
