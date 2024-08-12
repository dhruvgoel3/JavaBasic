import java.util.*;
public class Main {
    public static void main(String[] args)
    {
     PriorityQueue<Integer> p = new PriorityQueue<>();

     p.add(20);
     p.add(10);
     p.add(30);
     p.add(5);
     p.add(15);
     p.add(3);

// Peek method is used to see the head element and 3 is head element due to the lowest value
        System.out.println(p.peek());


        p.forEach((x)-> System.out.println(x));
//        output is 3,10,5,20,15,30
        p.poll();
//        By using poll we have deleted the lowesr value which has highest priority
        System.out.println("After deletion");
        p.forEach((x)-> System.out.println(x));
//

    }
}