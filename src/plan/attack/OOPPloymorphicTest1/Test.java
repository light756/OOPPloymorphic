package plan.attack.OOPPloymorphicTest1;

public class Test {
    public static void main(String[] args) {
        Vehicle v1 = new Bicycle("凤凰",10);
        Vehicle v2 = new Car("悍马",100,50);
        Person p = new Person("张三");
        p.drive(v1);
        p.drive(v2);
    }
}
