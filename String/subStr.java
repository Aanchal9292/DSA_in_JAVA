package String;

public class subStr {
    static void main() {
//        String str = "physics";
////        System.out.println(str.substring(0,2));
////        System.out.println(str.substring(0,0));
////        System.out.println(str.substring(3));
//        for(int i=2;i<4;i++){
//            System.out.print(str.substring(i));
//        }
        String s = "abcd";
        for(int i=0;i<=s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                System.out.print(s.substring(i,j)+" ");
            }

        }
    }
}
