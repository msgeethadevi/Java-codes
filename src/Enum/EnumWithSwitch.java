package Enum;


enum Level{

        HIGH,
        MEDIUM,
        LOW
    }
public class EnumWithSwitch {
    public static void main(String[] args) {
        Level myVar = Level.LOW;

        switch (myVar){
            case LOW:
                System.out.println("Low priority");
                break;
            case MEDIUM:
                System.out.println("Medium priority");
                break;
            case HIGH:
                System.out.println("High priority");
                break;
            default:
                System.out.println("Invalid Bug");


        }
    }

}
