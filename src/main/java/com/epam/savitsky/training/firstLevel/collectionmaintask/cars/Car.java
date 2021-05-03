package com.epam.savitsky.training.firstLevel.collectionmaintask.cars;

import java.util.Objects;

public class Car {
    private int carId;
    private int carWeight;
    private int carSpeed;
    private int carCost;

    public Car(){}

    public Car(int carId, int carWeight, int carSpeed, int carCost){
        this.carId = carId;
        this.carWeight = carWeight;
        this.carSpeed = carSpeed;
        this.carCost = carCost;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public int getCarWeight() {
        return carWeight;
    }

    public void setCarWeight(int carWeight) {
        this.carWeight = carWeight;
    }

    public int getCarSpeed() {
        return carSpeed;
    }

    public void setCarSpeed(int carSpeed) {
        this.carSpeed = carSpeed;
    }

    public int getCarCost() {
        return carCost;
    }

    public void setCarCost(int carCost) {
        this.carCost = carCost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return carId == car.carId && carWeight == car.carWeight && carSpeed == car.carSpeed && carCost == car.carCost;
    }

    @Override
    public int hashCode() {
        return Objects.hash(carId, carWeight, carSpeed, carCost);
    }

    @Override
    public String toString() {
        return "Car{" +
                "carId=" + carId +
                ", carWeight=" + carWeight +
                ", carSpeed=" + carSpeed +
                ", carCost=" + carCost +
                '}';
    }
}
