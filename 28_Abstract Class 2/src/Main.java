abstract class Shape
{
    abstract public double parameter();
    abstract public double area();
}
class circle extends Shape
{
    public int radius;

   public double parameter()
    {
        return 2*Math.PI*radius;
    }
    public double area()
    {
        return Math.PI*radius*radius;
    }
}
class Rectangle extends Shape
{
    public int length;
    public int breadth;

    public double parameter()
    {
        return 2*(length+breadth);
    }
    public double area()
    {
        return length*breadth;
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.length = 10;
        r.breadth = 10;

        Shape s = r;
        System.out.println(s.area());

    }
}

