package InHeritance;

public class SingleLevelInheritance {
    void eat() {
        System.out.println("I am eating...!!! ");

    }
    void run() {
        System.out.println("I am Running...!!! ");
    }
}
class Dog extends SingleLevelInheritance {
    public static void main(String[] args) {
        SingleLevelInheritance d1 = new SingleLevelInheritance();
        d1.eat();
        d1.run();


    }
}
