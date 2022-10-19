package oops.encapsulation;

public class EncapsulationTest {
    public static void main(String[] args) {



        Student s1= new Student();
        s1.setName("Geetha");
        s1.setRollNo(1025);
        s1.setAge(27);


        System.out.println("Name:" + s1.getName() +"\n" + "RollNo :" +
                s1.getRollNo() + "\n" + "Age: " + s1.getAge());

    }
}
