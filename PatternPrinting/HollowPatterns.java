package PatternPrinting;

import java.util.Scanner;
public class HollowPatterns {
    static void main() {
        System.out.print("Enter the rows : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        System.out.print("Enter the column : ");
//        int m = sc.nextInt();
//        for (int row = 1; row <= n; row++) {
//            for (int col = 1; col <= m; col++) {
//                if (row == 1 || row == n) {
//                    System.out.print("* ");
//                } else {
//                    if (col == 1 || col==m) {
//                        System.out.print("* ");
//                    }
//                    else {
//                        System.out.print("  ");
//                    }
//                }
//
//            }
//            System.out.println();
//
//        }
        // hollow right angled triangle
//        for(int row=1;row<=n;row++){
//            // variable columns
//
//                if(row==1 || row==2 || row==n){
//                    for(int col=1;col<=row;col++){
//                    System.out.print("* ");
//                    }
//                }
//
//                else{
//                    // middle rows
//                    System.out.print("* ");
//                    for(int col=1;col<=(row-2);col++){
//                        System.out.print("  ");
//                    }
//                    System.out.print("* ");
//                }
//
//            System.out.println();
//        }

        // hollow triangle
//        for(int row =1;row<=n;row++){
//            // for each row
//            // spaces part 1
//            for(int col=1;col<=(n-row);col++){
//                System.out.print("  ");
//            }
//            // part 2
//            if(row == 1 || row== n){
//                for(int col=1; col<=(2*row)-1; col++ ){
//                    System.out.print("* ");
//                }
//            }
//            else{
//                // middle  1*
//                System.out.print("* ");
//                // 2r-3 space
//                for(int col=1 ; col<= (2*row)-3 ; col++){
//                    System.out.print("  ");
//                }
//                1*
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        filled kite shape pattern
//        for(int row=1; row<=n ; row++){
//            for(int col=1; col<=n-row ; col++){
//                System.out.print("  ");
//            }
//            for(int col=1 ; col<=(2*row)-1 ; col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for(int row=1; row<=n ; row++){
//            if(row ==1){
//                continue;
//            }
//            for(int col=1 ; col<=row-1 ; col++){
//                System.out.print("  ");
//            }
//            for(int col=1 ; col<=2*n-2*row+1; col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        // hollow kite
        for(int row=1; row<=n ; row++){
            for(int col=1 ; col<=n-row ; col++){
                System.out.print("  ");
            }
            if(row==1){
                for (int col=1 ; col<=2*row-1 ; col++){
                    System.out.print("* ");
                }
            }
            else{
                System.out.print("* ");
                for(int col=1 ; col<= 2*row-3 ; col++){
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.out.println();
        }
        // part 2
        for(int row=1; row<=n-1 ; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("  ");
            }
            if (row == n - 1) {
                System.out.print("* ");
            } else {
                System.out.print("* ");
                for (int col = 1; col <= 2 * (n - row) - 3; col++) {
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
