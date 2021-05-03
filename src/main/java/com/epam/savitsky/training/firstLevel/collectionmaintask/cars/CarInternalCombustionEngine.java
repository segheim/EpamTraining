package com.epam.savitsky.training.firstLevel.collectionmaintask.cars;

import java.util.Objects;

public class CarInternalCombustionEngine extends Car {
    private double fuelConsumption;

    public CarInternalCombustionEngine(){
    }

    public CarInternalCombustionEngine(int carId, int carWeight, int carSpeed, int carCost, double fuelConsumption) {
        super(carId, carWeight, carSpeed, carCost);
        this.fuelConsumption = fuelConsumption;
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
        CarInternalCombustionEngine that = (CarInternalCombustionEngine) o;
        return Double.compare(that.fuelConsumption, fuelConsumption) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), fuelConsumption);
    }

    @Override
    public String toString() {
        return "CarInternalCombustionEngine{" +
                "fuelConsumption=" + fuelConsumption +
                '}';
    }
}
