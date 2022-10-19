package Enum;

public class EnumExample {
    enum TrafficSignal {
        RED, YELLOW, GREEN
    }

    public static void main(String[] args) {
        TrafficSignal ts1 = TrafficSignal.YELLOW;
        TrafficSignal ts2 = TrafficSignal.GREEN;
        TrafficSignal ts3 = TrafficSignal.RED;
        System.out.println("the signal is " + ts1);

        for (TrafficSignal colour : TrafficSignal.values()) {    //for each loop or enhanced for loop
            System.out.println(colour);
        }


    }

}

