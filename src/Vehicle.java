class Vehicle {
    protected String brand = "Ford";
    public void honk() {
        System.out.println("Tuut, tuut!");
    }
}

class SportsCar extends Vehicle {
    private String modelName = "Mustang";
    public static void main(String[] args) {
        SportsCar myFastCar = new SportsCar();
        myFastCar.honk();
        System.out.println(myFastCar.brand + " " + myFastCar.modelName);
    }
}
