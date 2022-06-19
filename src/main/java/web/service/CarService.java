package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.CarDAO;
import web.models.Car;

import java.util.List;

@Component
public class CarService {
    @Autowired
    private CarDAO carDAO;

    public List<Car> getCars(int carsQuantity) {
        return carDAO.getCars(carsQuantity);
    }
}
