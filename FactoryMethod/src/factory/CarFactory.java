package factory;

import product.CarInterface;

public interface CarFactory {

    public CarInterface makeCar(int maxSpeed);

}
