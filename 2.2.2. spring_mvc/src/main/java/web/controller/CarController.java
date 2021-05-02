package web.controller;

import model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;


@Controller
public class CarController {
    private CarServiceImpl carService = new CarServiceImpl();

    @GetMapping(value = "/cars")
    public void printWelcome(@RequestParam(value = "count", required = false) Integer count,
                             Model model) {

        List<Car> cars = new ArrayList<>();
        if (count == null) {
            count = carService.getAllCars().size();
        }
        if (count == 1) {
            cars.add(carService.getAllCars().get(count-1));
        }
        if (count == 2) {
            cars.add(carService.getAllCars().get(count-2));
            cars.add(carService.getAllCars().get(count-1));
        }
        if (count == 3) {
            cars.add(carService.getAllCars().get(count-3));
            cars.add(carService.getAllCars().get(count-2));
            cars.add(carService.getAllCars().get(count-1));
        }
        if (count == 4) {
            cars.add(carService.getAllCars().get(count-4));
            cars.add(carService.getAllCars().get(count-3));
            cars.add(carService.getAllCars().get(count-2));
            cars.add(carService.getAllCars().get(count-1));
        }
        if (count >= 5) {
            cars.add(carService.getAllCars().get(0));
            cars.add(carService.getAllCars().get(1));
            cars.add(carService.getAllCars().get(2));
            cars.add(carService.getAllCars().get(3));
            cars.add(carService.getAllCars().get(4));
        }
        if (count <= 0) {
            cars.add(null);
        }
        model.addAttribute("cars", cars);
    }
}