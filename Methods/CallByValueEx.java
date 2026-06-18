package Methods;

public class CallByValueEx {
//    static void Solve(int num){
//        System.out.println("Inside solve : "+num);
//        num = num*10;
//        System.out.println("Inside solve : "+num);
//    }
    static void main() {
//        int num = 5;
//        System.out.println("Inside main : "+num);
//        Solve(num);
//        System.out.println("Inside main : "+num);
        printMultiples();

    }
    static void printMultiples(){
        int value = 20;
        for(int i = 1; i<=10 ; i++){
            System.out.println(2*i);
        }
        System.out.println(value);
    }
}
