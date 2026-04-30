package plan.attack.OOPPloymorphicTest2;

public abstract class Animal {
    //关于抽象方法的实验——抽象父类animal
    String name;
    public Animal() {
    }
    public Animal(String name) {
        this.name = name;
    }

    public void drink() {
        System.out.println("喝水");
    }
    //我需要抽象方法
    public abstract void attack();
}
