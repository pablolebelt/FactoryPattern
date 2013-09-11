package factory;

import product.Audi;
import product.CarInterface;

public class AudiFactory implements CarFactory {

    @Override
    public CarInterface makeCar(int maxSpeed) {
        
        return new Audi(maxSpeed);
    }

}
