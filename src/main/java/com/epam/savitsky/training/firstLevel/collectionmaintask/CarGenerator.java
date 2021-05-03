package com.epam.savitsky.training.firstLevel.collectionmaintask;

import com.epam.savitsky.training.firstLevel.collectionmaintask.cars.Car;
import com.epam.savitsky.training.firstLevel.collectionmaintask.cars.CarElectro;
import com.epam.savitsky.training.firstLevel.collectionmaintask.cars.CarHybrid;
import com.epam.savitsky.training.firstLevel.collectionmaintask.cars.CarInternalCombustionEngine;

import java.util.ArrayList;
import java.util.List;

public class CarGenerator {

    public List<? extends Car> getCatalogOfCars(){
        List<Car> catalogOfCars = new ArrayList<>();
        catalogOfCars.add(new Car(1, 1050,150, 4400));
        catalogOfCars.add(new Car(2, 2400, 180, 9200));
        catalogOfCars.add(new Car(3, 1980, 220, 7000));
        catalogOfCars.add(new Car(4, 1600,350, 10_800));
        catalogOfCars.add(new CarElectro(5, 1820,190, 5400, 17));
        catalogOfCars.add(new Car(6, 1380,200, 7300));
        catalogOfCars.add(new Car(7, 1770, 210, 6700));
        catalogOfCars.add(new CarInternalCombustionEngine(8, 1330, 210, 8560, 5.4));
        catalogOfCars.add(new Car(9, 2180,240, 8300));
        catalogOfCars.add(new Car(10, 1730,190, 4400));
        catalogOfCars.add(new CarElectro(11, 1910,220, 7460, 13));
        catalogOfCars.add(new Car(12, 1550,250, 9750));
        catalogOfCars.add(new CarHybrid(13, 2370, 230, 8570, 8570, 5.2));
        catalogOfCars.add(new Car(14, 1870,280, 7590));
        catalogOfCars.add(new Car(15, 1970,240, 8720));
        catalogOfCars.add(new CarInternalCombustionEngine(16, 1620,270, 7340, 8.7));
        catalogOfCars.add(new Car(17, 1860,310, 12_500));
        catalogOfCars.add(new Car(18, 2170,180, 5410));
        catalogOfCars.add(new Car(19, 2220,270, 13640));
        catalogOfCars.add(new Car(20, 1740,190, 5100));
        catalogOfCars.add(new CarHybrid(21, 1100, 160, 4950, 7, 6.4));

        return catalogOfCars;
    }
}
