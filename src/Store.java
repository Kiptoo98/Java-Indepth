public class Store {
    // new method: constructor!
    String productType;
    int inventoryCount;
    double inventoryPrice;
    public Store(String product, int count, double price) {
        System.out.println("I am inside the constructor method.");
        productType = product;
        inventoryCount = count;
        inventoryPrice = price;
    }
    //advertise method
    public void advertise(){
        System.out.println("We are selling "+productType + " any other thing you would love");
        System.out.println("At this price "+ inventoryPrice);
    }

    public void greetCustomer(String customer){
        System.out.println("Welcome to our store " +customer + "!");
    }

    // main method is where we create instances!
    public static void main(String[] args) {
        System.out.println("Start of the main method.");

        // create the instance below
        Store lemonadeStand = new Store("lemonade", 25, 5.55);
        Store cookieShop = new Store("cookies", 12, 3.99);

        // print the instance below
        System.out.println(lemonadeStand.productType);
        System.out.println(cookieShop.inventoryPrice);

        //calling the advertise method
        lemonadeStand.advertise();
        cookieShop.advertise();

        //calling greetCustomer method
        lemonadeStand.greetCustomer("I am happy to see you");
    }
}

