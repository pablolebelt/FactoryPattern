package factory;

import product.CarInterface;
import product.Maluch;

public class MaluchFactory implements CarFactory {

    @Override
    public CarInterface makeCar(int maxSpeed) {

        return new Maluch(maxSpeed);
    }

}
