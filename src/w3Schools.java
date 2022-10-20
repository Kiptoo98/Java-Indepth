public class w3Schools {
    public static void main(String[] args) {
        String myName = "Brian Kiptoo";
        System.out.println("My name in caps is "+ myName.toUpperCase());
        System.out.println("My name in lowercase is "+ myName.toLowerCase());
        //locating index of a character
        System.out.println("Index of p in my name is index " +myName.indexOf("p"));
        //special character
        System.out.println("My name \"Bett\" is a special one ");
        System.out.println("Everything\'s gon\' be a\'ight");
        System.out.println("The character \\ is called backslash.");

        //Ternary operator
        int time = 5;
        String result = (time <18 ) ? "Good day" : "Good evening";
        System.out.println(result);
    }
}
