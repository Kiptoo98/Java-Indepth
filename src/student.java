public class student {
    String fname;
    int admNo;
    String stream;
    char gender;
    boolean paidFees;

    static void student(String name, int admission, String studStream, char sex, boolean fees){
        String fname = name;
        int admNo = admission;
        String stream = studStream;
        char gender = sex;
        boolean paidFees = fees;

        System.out.println("You are: " + fname);
        System.out.println("Your admission number is: " + admNo);
        System.out.println("Your stream is: " + stream);
        System.out.println("Gender: " + gender);
        System.out.println("Fees paid?: " + paidFees);
    }

    static void myStudent(){
        System.out.println("I am checking if I can be called");
    }

    static void studentColor(String color){
        System.out.println("My favorite color is: " + color);
    }

    static String car(String carModel){
       return carModel;
    }

    public student(String firstName){
        fname = firstName;
    }


    public static void main(String[] args) {
        student("Ezra", 3000, "East", 'M', true);
        myStudent();
        studentColor("black");
        System.out.println(car("Bimmer"));
        student Manu = new student("Manu");
        System.out.println("My name is " + Manu);
    }
    public String toString(){
        return ("My new name is: " + fname);
    }
}
