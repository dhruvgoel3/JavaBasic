//In this we have have used(this) Keyword , the main use of this keyword is to identify the main property When one name name is used more than once then
// to identify the word this keyword is used.........
//USING OF { THIS KEYWORD }
//       |
//       |
//       |
class rectangle
{
    int length;
    int breadth;

    rectangle(int length , int breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }
    void display()
    {
        System.out.println(this.length);
        System.out.println(this.breadth);
    }
}
//----------------------------------------------------------------------------------------------------------------------------------------------------

public class Main {
    public static void main(String[] args) {


    }
}