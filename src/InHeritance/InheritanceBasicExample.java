package InHeritance;

public class InheritanceBasicExample {

    int a(int x,int y){
        return x+y;

    }
}

class B extends InheritanceBasicExample {
    void b(){
        System.out.println("This is method B");
    }
}

class C extends B{
    void c(){
        System.out.println("This is method C");
    }

    public static void main(String[] args) {

        C inherited = new C();

        System.out.println(inherited.a(3,5));
        inherited.b();
        inherited.c();
    }
}
