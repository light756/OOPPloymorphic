package plan.attack.OOPPloymorphicTest1;

public class Bicycle extends Vehicle{
    public Bicycle() {
    }

    public Bicycle(String brand, int speed) {
        super(brand, speed);
    }

    @Override
    public void run(){
        System.out.println("自行车前进------,速度为"+getSpeed()+"km/h");
    }
    public void ring(){
        System.out.println("自行车鸣笛------");
    }
}
