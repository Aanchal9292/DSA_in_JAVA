package Methods;

public class MethodForTable {
    // declaration/definition
    static void print2KaTable(){
        for(int i=0 ; i<=10 ; i++){
            int ans = 2*i;
            System.out.println("->"+ans);
        }
    }
    static void main() {
        System.out.println("hi");
//      method call
        print2KaTable();
        System.out.println("Bye");


    }
}
