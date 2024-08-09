import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        LinkedList<Integer> al1 = new LinkedList<>();
        LinkedList<Integer> al2 = new LinkedList<>(List.of(50,60,70,80,90));

        al1.add(10);
        al1.add(0,5);
        //al1.addAll(al2);
        al1.addAll(1,al2);
        al1.add(5,70);
        al1.set(6,100);

        al1.addFirst(3);
        al1.addLast(200);

        al1.forEach(n-> System.out.println(n));

    }
}