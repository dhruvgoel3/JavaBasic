class car
{
public void start() {System.out.println("Car is Starting");}
public void accelerate() {System.out.println("Car is accelerated");}
public void changeGear() {System.out.println("Gear is changed");}
}
class LuxaryCar extends car
{
public void changeGear() {System.out.println("Automatic Gear");}
    public void openSunroof(){System.out.println("sunroof is opened");}
}

public class Main {
    public static void main(String[] args) {
        car c = new LuxaryCar();
        c.start();
        c.accelerate();
        c.changeGear();
//        c.openSunroof();

    }
}