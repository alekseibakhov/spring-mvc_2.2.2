package dao;

import model.Car;
import java.util.ArrayList;
import java.util.List;

public class CarDAOImpl implements CarDAO{

    private static List<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car(1,"A", "blue"));
        cars.add(new Car(2,"B", "green"));
        cars.add(new Car(3,"C", "red"));
        cars.add(new Car(4,"D", "blue"));
        cars.add(new Car(5,"E", "black"));
    }
    @Override
    public List<Car> getAllCars() {
        return cars;
    }
}