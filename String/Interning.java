package String;

public class Interning {
    static void main() {
        String s = "hello";  // -> heylo //2
        String x = "hello";
        x = "mello";
//        System.out.println(s);
        s = s.substring(0,2) + 'y' + s.substring(3);
        System.out.println(s);
    }

}
