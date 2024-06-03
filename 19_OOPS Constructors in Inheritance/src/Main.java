class Parent
{
//    this is parent class constructor
    public Parent()
    {
        System.out.println("Parent constructor");
    }
}

class Child extends Parent
{
//    this is child class constructor
    public Child()
    {
        System.out.println("Child Constructor");
    }
    class GrandChild extends Child
    {
        public GrandChild()
        {
            System.out.println("Grand Child nConstructor");
        }
    }

}
public class Main {
    public static void main(String[] args)
    {
//here we are calling constructor of different classes
Child c = new Child();
    }
}