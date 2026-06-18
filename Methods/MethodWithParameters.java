package Methods;

public class MethodWithParameters {
    static void printSum(int x,int y){
        System.out.println("Sum : "+ (x+y));
    }
    static void main() {
//        printSum(5,7);
//        printMultiplication(4,9);
       int result1 = add(13,12);
       int result2 = add(4,87,45);
        System.out.println("Result1 : "+result1);
        System.out.println("Result2 : "+result2);

    }
//    static void printMultiplication(int a,int b){
//        int ans = a*b;
//        System.out.println("Result : "+ans);
//        return;
//    }
    static int add(int p,int q){
        int sum = p+q;
        return sum;

    }
    static int add(int p,int q, int r){
        int ans = p+q+r;
        return ans;

    }
}
