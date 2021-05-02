package dao;

import model.Car;
import java.util.List;

public interface CarDAO {
    //с методом, который будет возвращать
    // указанное число машин из созданного списка.
    List<Car> getAllCars();
}
