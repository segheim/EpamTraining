package com.epam.savitsky.training.firstLevel.collectionmaintask.cars;

import java.util.Objects;

public class CarElectro extends Car{
    private int batteryСapacity;

    public CarElectro(){
    }

    public CarElectro(int carId, int carWeight, int carSpeed, int carCost, int hatchbackDoors) {
        super(carId, carWeight, carSpeed, carCost);
        this.batteryСapacity = batteryСapacity;
    }

    public int getBatteryСapacity() {
        return batteryСapacity;
    }

    public void setBatteryСapacity(int batteryСapacity) {
        this.batteryСapacity = batteryСapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CarElectro that = (CarElectro) o;
        return batteryСapacity == that.batteryСapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), batteryСapacity);
    }

    @Override
    public String toString() {
        return "CarElectro{" +
                "batteryСapacity=" + batteryСapacity +
                '}';
    }
}
