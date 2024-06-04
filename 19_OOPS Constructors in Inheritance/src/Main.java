import org.w3c.dom.ls.LSOutput;

class Parent
{
    public Parent()
    {
        System.out.println("Parent constructor");
    }
}
class Child extends Parent
{
    public Child()
    {
        System.out.println("Child Constructor");
    }
}
class GrandChild extends Child
{
    public GrandChild()
    {
        System.out.println("GrandChild Constructor");
    }
}
public class Main {
    public static void main(String[] args)
    {
GrandChild c = new GrandChild();

    }
}