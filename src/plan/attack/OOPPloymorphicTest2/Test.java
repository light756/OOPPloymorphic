package plan.attack.OOPPloymorphicTest2;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog("旺财");
        Cat cat = new Cat("招财猫");
        System.out.println(dog.name);
        System.out.println(cat.name);
        dog.attack();
        cat.attack();
    }
}
