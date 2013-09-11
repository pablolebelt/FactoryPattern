package product;

public class Ferrari implements CarInterface {

    private int speed;
    
    
    public Ferrari(int speed) {
        super();
        this.speed = speed;
    }

    @Override
    public void drive() {
        System.out.println("A Ferrari zapierdala z predkoscia "+this.speed);
        
    }

}
