import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        ArrayList<Integer> al1 = new ArrayList<>(20);
        ArrayList<Integer> al2 = new ArrayList<>(List.of(20,30,40,50,60,70));

        al1.add(10);
            System.out.println(al1);
        al1.add(1,5);
            System.out.println(al1);
        al1.addAll(1,al2);
            System.out.println(al1);
        al1.set(6,100);
            System.out.println(al1);
        al1.indexOf(5);
            System.out.println(al1);

//            Here we are learning about iterator
//            ----------------------------------
//               for(Integer x:al1)
//                System.out.println(x);
//             ----------------------------------
//
//        for(ListIterator<Integer> it = al1.listIterator(); it.hasNext();)
//         {
//             System.out.println(it.next());
//         }
//        -----------------------------------------------
         al1.forEach(n-> System.out.println(n));





    }
}