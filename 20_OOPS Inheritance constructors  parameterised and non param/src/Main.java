//PARAMETERISED CONSTRUCTORS IN INHERITANCE
//IN THIS LECTURE WE WILL LEARN HOW TO CALL PARAMETERISED AND NON PARAMETERISED CONSTRUCTORS IN J

//----------------------------------------------------------------------------------------------
class Parent
{
    Parent() {System.out.println("Nom-Param of Parent");}
    Parent(int x) {System.out.println("Param of Parent "+x);}
}
class Child extends Parent
{
    Child() {System.out.println("Non-param of Child");}
    Child(int y) {System.out.println("Param of Child "+y);}

    Child(int x , int y)
    {
        super(x);
        System.out.println("2 param of child"+y);
    }
}
//here in the above class we are calling the parent class by using the keyword super
//-----------------------------------------------------------------------------------------------

class rectangle
{
    int length;
    int breadth;
    rectangle()
    {
        length=breadth=1;
    }
    rectangle(int l , int b)
    {
        length = l;
        breadth = b;
    }
}

class cuboid extends rectangle
{
    int height;

    cuboid()
    {
        height = 1;
    }
    cuboid(int h)
    {
        height = h;
    }
    cuboid(int l , int b , int h)
    {
        super(l,b);
        height = h;
    }
    int volume()
    {
        return length*breadth*height;
    }
}



public class Main {
    public static void main(String[] args) {
        Child c = new Child(10,20);
//  ----------------------------------------------------------------------------------

     cuboid cu = new cuboid(10,10,20);
        System.out.println(cu.volume());
    }
}
