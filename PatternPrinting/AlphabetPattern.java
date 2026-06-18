package PatternPrinting;

public class AlphabetPattern {
    static void main() {
        int n=  5;
//        for(int  i=1 ; i<=n ; i++){
//            for(int j=1 ; j<=i ; j++){
////                System.out.print((char)(j+96)+" ");   // for small letter
//                int a =j;
////                int a =i;
//                int b = ('A'-1);
//                int ans = a+b;
//                char finalAns = (char)ans;
//                System.out.print(finalAns + " ");
//            }
//            System.out.println();
//        }
//        for(int row=1;row<=n;row++){
//            for(int col=1 ; col<=row ; col++){
//                int a=n-col;
//                int b = 'A';
//                int ans = a+b;
//                char finalAns = (char)ans;
//                System.out.print(finalAns+" ");
//            }
//            System.out.println();
//        }

        for(int row=1;row<=n;row++){
            for(int col=1; col<=n-row ; col++){
                System.out.print("  ");
            }
            for(int col=1 ; col<=row ; col++){
                int a=col;
                int b = 'A'-1;
                int ans = a+b;
                char finalAns = (char)ans;
                System.out.print(finalAns+" ");
            }
            char toPrint = (char)(row + 'A' -2);
            for(int col=1; col<=row-1 ; col++){

                System.out.print(toPrint+" ");
                toPrint--;
            }
            System.out.println();
        }
    }
}
