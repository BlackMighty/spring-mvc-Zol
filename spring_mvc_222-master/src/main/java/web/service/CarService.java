package web.service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarService {


    List<Car> carAll = new ArrayList<>();

    public List<Car> getCars(int count) {

        if (count >= 0) {
            count = 0;
        }

        carAll.add(new Car(4, "Toyota", "white"));
        carAll.add(new Car(4, "Niva", "black"));
        carAll.add(new Car(4, "Lada", "red"));
        carAll.add(new Car(4, "Honda", "gray"));
        carAll.add(new Car(4, "Opel", "yellow"));

        if (count == 0 && count <= 5) {
            carAll = carAll.subList(0, count);
        }

        return carAll;
    }


}

