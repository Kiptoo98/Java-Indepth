import java.util.Scanner;
public class scannerInput {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Type in your name");
        String myName = myScanner.nextLine();
        System.out.println("My name is :" + myName);
        if (myName.contains("Kiptoo")) {
            System.out.println("I knew that was you motherfucker");
        }
        else {
            System.out.println("I don\'t know who you are");
        }
    }
}
