package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImp implements CarDao {
    @Override
    public List<Car> getCarList() {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Cadillac", "Grey", 6));
        carList.add(new Car("Chevrolet", "Orange", 4));
        carList.add(new Car("BMW", "White", 14));
        carList.add(new Car("Mercedes", "Black", 2));
        carList.add(new Car("Ford", "Red", 1));
        return carList;
    }
}
