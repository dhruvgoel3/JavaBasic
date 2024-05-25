import java.sql.SQLOutput;

class rectangle
{
    private double length;
    private double breadth;

    public double getLength()
    {
        return length;
    }
    public double getBreadth()
    {
        return breadth;
    }
    public void setLength(double l)
    {
        length = l;
    }
    public void setBreadth(double b)
    {
        breadth = b;
    }

    public double area()
    {
        return length*breadth;
    }
    public double perimeter()
    {
        return 2*(area());
    }

}

public class Main {
    public static void main(String[] args)
    {
        rectangle r = new rectangle();

            r.setLength(10);
            r.setBreadth(20);
        System.out.println(r.area());
        System.out.println(r.perimeter());

        System.out.println(r.getLength());
        System.out.println(r.getBreadth());


    }
}

//GETTER AND SETTER METHODS ARE CALLED PROPERTY METHODS