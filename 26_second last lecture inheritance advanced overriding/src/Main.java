class Super
{
    public void Display()
    {
        System.out.println("Super Display");
    }
}
class Sub extends Super
{
    public void Display()
    {
        System.out.println("Sub Display");
    }
}
public class Main {
    public static void main(String[] args) {
Sub s = new Sub();
s.Display();
    }
}

//-----Access modifiers-----
//---------------------------
//private>protected>public
//---------------------------
//Private is more strict
// public is least strict


//we can not the strict one in sub class