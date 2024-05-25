class cylinder
{
    public double radius;
    public double height;

    public double lidArea()
    {
        return Math.PI*radius*radius;
    }
    public double totalSurfaceArea()
    {
        return 2*lidArea()+circumference()*height;
    }
    public double circumference()
    {
        return 2*Math.PI*radius;
    }
      public double volume()
      {
          return lidArea()*height;
      }
}
public class Main {
    public static void main(String[] args)
    {
        cylinder c = new cylinder();
        c.radius = 7;
        c.height = 10;

        System.out.println("lidArea: "+c.lidArea());
        System.out.println("totalSurfaceArea: "+c.totalSurfaceArea());
        System.out.println("Circumference: "+c.circumference());
        System.out.println("volume: "+c.volume());

    }
}