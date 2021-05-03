package com.epam.savitsky.training.firstLevel.collectionmaintask.cars;

import java.util.Objects;

public class CarHybrid extends Car{
    private int batteryСapacity;
    private double fuelConsumption;

    public CarHybrid(){
    }

    public CarHybrid(int carId, int carWeight, int carSpeed, int carCost, int batteryСapacity, double fuelConsumption){
        super(carId, carWeight, carSpeed, carCost);
        this.batteryСapacity = batteryСapacity;
        this.fuelConsumption = fuelConsumption;
    }

    public int getBatteryСapacity() {
        return batteryСapacity;
    }

    public void setBatteryСapacity(int batteryСapacity) {
        this.batteryСapacity = batteryСapacity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CarHybrid carHybrid = (CarHybrid) o;
        return batteryСapacity == carHybrid.batteryСapacity && Double.compare(carHybrid.fuelConsumption, fuelConsumption) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), batteryСapacity, fuelConsumption);
    }

    @Override
    public String toString() {
        return "CarHybrid{" +
                "batteryСapacity=" + batteryСapacity +
                ", fuelConsumption=" + fuelConsumption +
                '}';
    }
}

