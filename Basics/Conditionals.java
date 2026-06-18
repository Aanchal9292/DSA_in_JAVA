package Basics;

public class Conditionals {
    static void main() {
//        boolean hasSubscription = true;
//        int solvedProblems = 220;
//
//        if (hasSubscription) {
//
//            if (solvedProblems >= 200) {
//                System.out.println("Unlock Advanced Sheet");
//            } else {
//                System.out.println("Practice More Problems");
//            }
//
//        } else {
//            System.out.println("Upgrade to Premium");
//        }
//        int streakDays = 35;
//
//        String status = (streakDays >= 30) ? "Consistent" : "Irregular";
//
//        System.out.println(status);

        int dayNumber = 3;

        switch (dayNumber) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            default:
                System.out.println("Invalid day");
        }
    }
}
