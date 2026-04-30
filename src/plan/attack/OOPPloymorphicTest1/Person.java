package plan.attack.OOPPloymorphicTest1;

public class Person {
    String name;
    public Person() {
    }
    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //行动——驾驶
    public void drive(Vehicle vehicle) {
        vehicle.run();
        if(vehicle instanceof Car) {
            Car car = (Car) vehicle;
            System.out.println("剩余油量：" + car.getFuel());
            car.run();
            car.honk();
        }
        else if(vehicle instanceof Bicycle) {
            Bicycle bicycle = (Bicycle) vehicle;
            bicycle.run();
            bicycle.ring();
        }
        else {
            System.out.println("请勿使用此车辆");
        }
    }
}
