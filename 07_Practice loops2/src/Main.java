import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r;
        int n = sc.nextInt();
        while(n>0)
        {
            r=n%10;
            n=n/10;
            System.out.println(r);
        }


        

    }
}