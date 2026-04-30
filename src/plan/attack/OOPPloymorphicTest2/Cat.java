package plan.attack.OOPPloymorphicTest2;

public class Cat extends Animal{
    public Cat() {
    }

    public Cat(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("猫抓攻击");
    }
}
