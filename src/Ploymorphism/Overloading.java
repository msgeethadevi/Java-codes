package Ploymorphism;

// Static keyword is used for better memory management
    /*
    Static methods can be accessed from inside a class without object
    Static method can be accessed outside a class by using the class name
    Static method belongs to the class and not to any particular object */

// Addition example

public class Overloading {
    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    static float add(float a, float b, float c, float d) {
        return a + b + c + d;
    }

    /*public static void main(String[] args) {
        System.out.println("Add 2 nos "+ add(1,3));
        System.out.println("Add 3 nos "+ add(1,3,4));
        System.out.println("Add 4 nos "+ add(1,5,9,3));
        System.out.println("Add float nos "+ add(1,2,5,9));
    }*/

}
class OverLoadingExample {
    public static void main(String[] args) {
        System.out.println(Overloading.add(7f,4f,8f,0f));
    }
}








