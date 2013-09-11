package product;

public class Audi implements CarInterface {

    private int speed;

    public Audi(int speed) {
        this.speed = speed;
    }

    @Override
    public void drive() {

        System.out.println("Audi jedzie z predkoscia " + this.speed);

    }

}
