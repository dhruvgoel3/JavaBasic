class MyObject
{

}
class MyObject2 extends MyObject {
    public String toString()
    {
        return "My Object";
    }
    public int hashCode()
//            hash code is mainly used to generate unique code
    {
       return 100;
    }
    public boolean equals(Object o)
    {
        return this.hashCode() == o.hashCode();
    }

}

public class Main {
    public static void main(String[] args) {
       MyObject2 o1 = new MyObject2();
        MyObject o2 = new MyObject();

        System.out.println(o1.equals(o2));
    }
}