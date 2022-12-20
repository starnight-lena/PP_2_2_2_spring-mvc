package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {
    private static int CAR_COUNT;
    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car(++CAR_COUNT, "Ford", 4, "Red"));
        cars.add(new Car(++CAR_COUNT, "Ferrari", 345, "Yellow"));
        cars.add(new Car(++CAR_COUNT, "Niva", 12, "White"));
        cars.add(new Car(++CAR_COUNT, "Lada", 6, "Blue"));
        cars.add(new Car(++CAR_COUNT, "Citroen", 12345, "Brown"));
        cars.add(new Car(++CAR_COUNT, "Infiniti", 32, "Black"));
    }
    public List<Car> allCars() {
        return cars;
    }

    public List<Car> getCars(int count) {
        if (count < 5)  return cars.stream().limit(count).collect(Collectors.toList());
        else return allCars();
    }
}
