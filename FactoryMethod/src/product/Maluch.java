package product;

public class Maluch implements CarInterface {

    private int speed;

    public Maluch(int speed) {
        super();
        this.speed = speed;
    }

    @Override
    public void drive() {

        System.out.println("Maluch sie wlecze " + this.speed + " na godzine");

    }

}
