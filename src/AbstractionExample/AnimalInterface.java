package AbstractionExample;

 interface AnimalInterface {
    public void colour();
    public void size();
}
class Santhu implements AnimalInterface{
    public void colour() {
        System.out.println("Santhu is wheat colour");
    }
    public void size() {
        System.out.println("Santhu is thin");
    }
}

class Geetha implements AnimalInterface{
    public void colour() {
        System.out.println("Geetha is white colour");
    }
    public void size() {
        System.out.println("Geetha is medium");
    }
}

class pair{
    public static void main(String[] args) {
        Geetha g= new Geetha();
        g.colour();
        g.size();

        Santhu s = new Santhu();
        s.colour();
        s.size();

    }
}