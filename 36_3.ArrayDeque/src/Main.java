import java.util.*;
public class Main {
    public static void main(String[] args)
    {
      ArrayDeque<Integer> dq = new ArrayDeque<>();
      dq.offerLast(10);
      dq.offerLast(20);
      dq.offerLast(30);
      dq.offerLast(40);
//      output= 10,20,30,40  -- due to offerLast method


//
      dq.offerFirst(1);
      dq.offerFirst(2);
      dq.offerFirst(3);
      dq.offerFirst(4);
//      output= 4,3,2,1 -- due to pfferFirst method


        dq.forEach((x)-> System.out.println(x));

    }
}
