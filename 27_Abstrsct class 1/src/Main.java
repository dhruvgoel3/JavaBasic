abstract class Super
{
    public Super() {System.out.println("Super Constructor");}

    public void meth1() {System.out.println("Super of meth1");}

    abstract public void meth2();
}
class Sub extends Super
{
public void meth2()
{
    System.out.println("Sub meth2");
}

}
public class Main {
    public static void main(String[] args)
    {
Super s;

    }
}