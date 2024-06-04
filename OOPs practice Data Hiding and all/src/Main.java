class rectangle
{
    private double length;
    private double breadth;

    private double getLength() {return length;}
    private double getBreadth() {return breadth;}

    public void setLength(double l) {length = l;}
    public void setBreadth(double b) {breadth = b;}

    public double area() {return length*breadth;}
    public double perimeter() {return 2*(area());}
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

        r.setLength(10.5);
        r.setBreadth(5.5);


        System.out.println("Area is "+r.area());
        System.out.println("Perimeter is "+r.perimeter());
        System.out.println("Is it a Square ? "+r.isSquare());
//
//        System.out.println("Length "+r.getLength());
//        System.out.println("Breadth "+r.getBreadth());

    }
}