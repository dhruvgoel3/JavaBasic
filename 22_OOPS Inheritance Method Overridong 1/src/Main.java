class Super
{
    public void Display()
    {
        System.out.println("Super Class Display");
    }
}
class Sub extends Super{


        public void Display()
        {
            System.out.println("Sub Class Display");
        }
    }


public class Main {
    public static void main(String[] args)
    {
//Super sup = new Super();
//sup.Display();
//
//Sub s = new Sub();
//s.Display(10);

        Super sup = new Sub();
        sup.Display();


    }
}