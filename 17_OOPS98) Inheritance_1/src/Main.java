class circle
{
    public double radius;
    public double area()
    {
        return Math.PI*radius * radius;
    }
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
    public double circumference() {
        return perimeter();
    }
}
class Cylinder extends circle
{
    public double height;
    public double volume()
    {
        return area()*height;
    }
}
public class Main {
    public static void main(String[] args) {

Cylinder c = new Cylinder();
c.radius = 7;
c.height = 14;
        System.out.println(c.volume());
        System.out.println(c.area());


    }
}