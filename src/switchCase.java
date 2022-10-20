public class switchCase {
    public static void main(String[] args) {


            int day = 4;
            switch (day) {
            case 1:
            System.out.println("Monday");
            break;
            case 2:
            System.out.println("Tuesday");
            break;
            case 3:
            System.out.println("Wednesday");
            break;
            case 4:
            System.out.println("Thursday");
            break;
            case 5:
            System.out.println("Friday");
            break;
            case 6:
            System.out.println("Saturday");
            break;
            case 7:
            System.out.println("Sunday");
            break;
     }
     //case 2
        int today = 5;
            switch (today) {
                case 6: System.out.println("Today is Saturday");
                break;
                case 7: System.out.println("Today is Sunday");
                break;
                default:  System.out.println("Today is Friday");
            }
        String myName = "Kiptoo";
            switch (myName) {
                case "Kiprop": System.out.println("Name\'s Kiprop");
                break;
                case "chulat": System.out.println("Name\'s chulat");
                break;
                case "moigong": System.out.println("Name\'s moigong");
                break;
                case "fanu": System.out.println("Name\'s fanu");
                break;
                default: System.out.println("Name\'s Kiptoo");
            }
    }
}
