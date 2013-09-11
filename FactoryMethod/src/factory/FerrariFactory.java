package factory;

import product.CarInterface;
import product.Ferrari;

public class FerrariFactory implements CarFactory {

    @Override
    public CarInterface makeCar(int maxSpeed) {

        return new Ferrari(maxSpeed);
    }

}
