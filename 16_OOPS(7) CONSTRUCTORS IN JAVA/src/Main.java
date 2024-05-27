class rectangle
{
    private double length;
    private double breadth;

    public rectangle()
    {
        length = 1;
        breadth = 1;
    }
    public rectangle(double l , double b)
    {
        length = l;
        breadth = b;
    }

    public rectangle(double s)
    {
        length=breadth=s;
    }
}


public class Main {
    public static void main(String[] args)
    {
        rectangle r = new rectangle(10 , 5);
    }
}