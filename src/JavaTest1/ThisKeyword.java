package JavaTest1;
//Write a program to show the proper use of "this" keyword on instance variable of a class using a method.
public class ThisKeyword {

    int i;
    void use(int i){
        this.i=i;
    }
    void display(){
        System.out.println(i);
    }
}
class UseOfThis{
    public static void main(String[] args) {
       ThisKeyword tk=new ThisKeyword();
       tk.use(5);
       tk.display();

    }
}