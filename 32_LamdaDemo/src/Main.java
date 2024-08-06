// as we know all the methods inside interface are public and abstract

// if a interface have only one abstract method then the interface is called functional interface
@FunctionalInterface
interface MyLambda
{
    public void display();

}
class My implements MyLambda
{
    public void display()
    {
        System.out.println("Hello world");
    }
}

public class Main {
    public static void main(String[] args) {
        MyLambda m = () -> {System.out.println("Hello world");};
        m.display();
    }
}
