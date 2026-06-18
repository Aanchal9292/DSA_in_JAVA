package PatternPrinting;

import java.util.Scanner;
public class Pattern {
    static void main() {
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        System.out.print("Enter the number : ");
//
//        int m = sc.nextInt();
        // solid rectangular pattern
//        for(int row =1 ; row<=n;row++){
//            for(int col = 1; col<=m ; col++){
//                System.out.print("* ");
//            }
//            // move to next row
//            System.out.println();
//        }

        // right angled triangle
//        for(int row =1 ; row<=n;row++){
//            for(int col = 1; col<=row ; col++){
//                System.out.print("* ");
//            }
//            // move to next row
//            System.out.println();
//        }

        // reverse right triangle
//        for(int row =1 ; row<=n;row++){
//            for(int col = 1; col<=n+1-row ; col++){
//                System.out.print("* ");
//            }
//            // move to next row
//            System.out.println();
//        }
        // or
        for(int row=1;row<=n;row++){
            for(int col=row;col<=n;col++){
                System.out.print("* ");
            }
            System.out.println();
        }


        // star rhombus
//        for(int row =1 ; row<=n;row++){
//            for(int col = 1; col<=n-row ; col++){
//                System.out.print(" ");
//
//            }
//            for(int col=1;col<=n;col++){
//                System.out.print("* ");
//            }
//            // move to next row
//            System.out.println();
//        }
        // pyramid
//        for(int row=1;row<=n;row++){
//            for(int col=1;col<=n-row;col++){
//                System.out.print("  ");
//            }
//            for(int col=1;col<=((2*row)-1); col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        // inverted pyramid
//        for(int row=1;row<=n;row++){
//            for(int col=1;col<=row-1;col++){
//                System.out.print("  ");
//            }
//            for(int col=1;col<=2*n-(2*row)+1; col++){   // 2n-row--space -> 2n-row-row+1
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

    }
}
