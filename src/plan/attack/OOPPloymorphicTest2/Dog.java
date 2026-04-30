package plan.attack.OOPPloymorphicTest2;

public class Dog extends Animal{
    public Dog() {
    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("狗咬攻击");
    }
}
