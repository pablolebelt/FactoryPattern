import java.util.ArrayList;

import factory.AudiFactory;
import factory.CarFactory;
import factory.FerrariFactory;
import factory.MaluchFactory;

public class FactoryPattern {

    public static void main(String[] args) {

        ArrayList<CarFactory> factory = new ArrayList<CarFactory>();
        factory.add(new MaluchFactory());
        factory.add(new AudiFactory());
        factory.add(new FerrariFactory());

        for (CarFactory cF : factory) {
            int currentSpeed = (int) (Math.random() * 150) + 50;
            cF.makeCar(currentSpeed).drive();
            System.out.println("yeah");
        }

    }

}
