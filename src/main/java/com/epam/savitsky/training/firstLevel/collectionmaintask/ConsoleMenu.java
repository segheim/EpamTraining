package com.epam.savitsky.training.firstLevel.collectionmaintask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleMenu{
    

    public ConsoleMenu() throws IOException {

        CarGenerator carGenerator = new CarGenerator();
        CarCompany carCompany = new CarCompany(carGenerator.getCatalogOfCars());

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("1 - Find out cost of car company.");
        System.out.println("2 - Show sorted car's list by weight.");
        System.out.println("3 - Find out cars at speed range.");
        System.out.print("Enter digit 1-3: ");
        String digitMenu = reader.readLine();
        
        switch(Integer.parseInt(digitMenu)){
            case 1:
                System.out.println("Cost of car company: " + carCompany.getCostOfCarCompany());
                break;
            case 2:
                System.out.println("Sorted car's list by weight: " + carCompany.getSortedListCarByWeight());
                break;
            case 3:
                System.out.println("Please enter range of speeds!");
                BufferedReader readMinSpeed = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Min speed: ");
                int minSpeed = Integer.parseInt(readMinSpeed.readLine());
                BufferedReader readMaxSpeed = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Max speed: ");
                int maxSpeed = Integer.parseInt(readMaxSpeed.readLine());
                System.out.println("List cars with speed " + minSpeed + " " + maxSpeed +
                        carCompany.getListCarsOfSpeedRange(minSpeed, maxSpeed));
        }
    }
}
