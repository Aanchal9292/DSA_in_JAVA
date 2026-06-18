package PatternPrinting;

import java.util.Scanner;
public class ButterflyPattern {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  number : ");
        int n = sc.nextInt();
        for(int row=1 ; row<=n ;row++){
            for (int col=1 ; col<=row ; col++){
                System.out.print("* ");
            }
            for (int col=1 ; col<=(n-row)*2 ; col++){
                System.out.print("  ");
            }
            for (int col=1 ; col<=row ; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
//        for(int row=1 ; row<=n ; row++){
//            if(n==1){
//                for(int col=1 ;col<=n*2 ; col++){
//                    System.out.print("* ");
//                }
//            }
//            else{
//                for(int col=1;col<=n+1-row ; col++){
//                    System.out.print("* ");
//                }
//                for(int col=1 ; col<=(row*2)-2 ; col++){
//                    System.out.print("  ");
//                }
//                for(int col=1 ; col<=n+1-row ; col++){
//                    System.out.print("* ");
//                }
//            }
//            System.out.println();
//        }
//             another method
        for(int row=1 ; row<=n ;row++){
            for (int col=1 ; col<=n-row+1 ; col++){
                System.out.print("* ");
            }
            for (int col=1 ; col<=2*(row-1) ; col++){
                System.out.print("  ");
            }
            for (int col=1 ; col<=n-row+1 ; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
