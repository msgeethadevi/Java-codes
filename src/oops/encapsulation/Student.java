package oops.encapsulation;

public class Student {

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name =name;

    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;
    private int rollNo;
    private int age;
}

