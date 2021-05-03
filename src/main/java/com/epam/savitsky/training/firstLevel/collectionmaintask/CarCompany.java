package com.epam.savitsky.training.firstLevel.collectionmaintask;

import com.epam.savitsky.training.firstLevel.collectionmaintask.cars.Car;

import java.util.*;

public class CarCompany{
    private List<? extends Car> cars;

    public CarCompany(List<? extends Car> cars){
        this.cars = cars;
    }

    public double getCostOfCarCompany() {
        int costOfCarCompany = 0;
        for (Car car : cars) {
            costOfCarCompany += car.getCarCost();
        }

        return costOfCarCompany;
    }

    public List<? extends Car> getSortedListCarByWeight() {
        Collections.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                if (o1.getCarWeight() > o2.getCarWeight()) {
                    return 1;
                } else if (o1.getCarWeight() < o2.getCarWeight()) {
                    return -1;
                }
                return 0;
            }
        });

        return cars;
    }

    public List<? extends Car> getListCarsOfSpeedRange(int minSpeed, int maxSpeed) {
        Iterator<Car> iteratorCar = (Iterator<Car>) cars.iterator();
        while(iteratorCar.hasNext()){
            Car nextCar = iteratorCar.next();
            if (nextCar.getCarSpeed() < minSpeed) {
                iteratorCar.remove();
            }
            if (nextCar.getCarSpeed() > maxSpeed){
                iteratorCar.remove();
            }
        }

        return cars;
    }
}
