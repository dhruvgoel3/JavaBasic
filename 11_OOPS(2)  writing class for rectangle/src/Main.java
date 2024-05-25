class rectangle
{
    public double length;
    public double breadth;

    public double area()
    {
        return length*breadth;
    }
    public double perimeter()
    {
        return 2*(length+breadth);
    }
    public boolean isSquare()
    {
        if(length==breadth)
        return true;
        else
            return false;
    }
}

public class Main {
    public static void main(String[] args) {
 rectangle r = new rectangle();
 r.length = 10.5;
 r.breadth = 5.5;
        System.out.println("Aera: "+r.area());
        System.out.println("Perimeter "+r.perimeter());
        System.out.println("Is it a Square "+r.isSquare());
    }
}