package plan.attack.OOPPloymorphicTest1;

public class Vehicle {
    //继承——多态——父子类型转换综合实验
    public String brand;
    public int speed;
    public Vehicle() {
    }
    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    //车辆通用方法
    public void run() {
        System.out.println("车辆开始运行...");
    }
}
