class Super
{
    void meth1()
    {
        System.out.println("Super Method 1");
    }
    void meth2()
    {
        System.out.println("Super Method 2");
    }
    void meth3()
    {
        System.out.println("me 1");
    }
}
class Sub extends Super
{
    void meth2()
    {
        System.out.println("Sub Method 2");
    }
    void meth3()
    {
        System.out.println("Sub Method 3");
    }
}
public class Main {
    public static void main(String[] args)
    {
Super s = new Sub();
s.meth1();
s.meth2();
s.meth3();
    }
}