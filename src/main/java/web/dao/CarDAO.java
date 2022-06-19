package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAO {
    private List<Car> carList = new ArrayList<>();

    {
        carList.add(new Car("Volga", 100, 100));
        carList.add(new Car("Niva", 200, 101));
        carList.add(new Car("Jiguli", 300, 102));
        carList.add(new Car("Gazel", 400, 103));
        carList.add(new Car("Belaz", 3000, 80));
    }

    public List<Car> getCars(int carsQuantity) {
        if (carsQuantity >= carList.size() || carsQuantity <= 0) {
            return carList;
        }

        return carList.subList(0, carsQuantity);
    }

}
