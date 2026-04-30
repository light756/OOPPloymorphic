package plan.attack.OOPPloymorphicTest1;

public class Car extends Vehicle{
    //燃油容量
    int fuel; // 燃油容量
    public Car() {
    }

    public Car(int fuel) {
        this.fuel = fuel;
    }

    public Car(String brand, int speed, int fuel) {
        super(brand, speed);
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
    @Override
    public void run() {
        System.out.println("汽车疾驰------速度为："+getSpeed()+"km/h");
    }
    public void honk() {
        System.out.println("汽车鸣笛------");
    }
}
