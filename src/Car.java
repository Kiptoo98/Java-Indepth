public class Car {
    String color;

    //constructor method is same as class name
    public Car(String carColor) {
        color = carColor;
    }

    public void startRadio(double stationNum, String stationName) {
        System.out.println("Turning on the radio to " + stationNum + ", " + stationName + "!");
        System.out.println("Enjoy!");
    }

    public static void main(String[] args){
        Car myCar = new Car("red");
        myCar.startRadio(103.7, "Meditation Station");
        System.out.println(myCar);
    }
    public String toString(){
        return ("This is a "+ color + " car");
    }
}
