package service;

import dao.CarDAO;
import dao.CarDAOImpl;
import model.Car;

import java.util.List;

public class CarServiceImpl implements CarService{
    private CarDAO carDao = new CarDAOImpl();

    @Override
    public List<Car> getAllCars() {
        return carDao.getAllCars();
    }
}
