public class Main {
    public static void main(String[] args) {
//        q u e s t i o n  1

//                METHOD 1 = simple method
        System.out.println("*****");
        System.out.println("*****");
        System.out.println("*****");
        System.out.println("*****");


//                  METHOD 2 =  using for loop
//
//        int n = 4;
//        int m = 5;
//        for(int i=1; i<=n; i++) {
//            for(int j=1; j<=m; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        q u e s t i o n 2

        int a = 4;
        int b = 5;
        for(int i=1; i<=a; i++) {
            for(int j=1; j<=b; j++) {
                if(i==1 || j==1 || i==a || j==b) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }


        
    }
}