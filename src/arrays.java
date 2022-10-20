public class arrays {
    public static void main(String[] args) {
        String[] cars = {"Mercedes", "BMW", "Audi", "VW"};
        cars[2] = "Porsche";
        System.out.println("My German machine preference is: " + cars[2]);
        //Array length
        System.out.println("My German machine preferences are: " + cars.length);
        //Looping through arrays
        for (String i: cars) {
            System.out.println(i);
        }
        //Multidimensional arrays
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        int x = myNumbers[1][2];
        System.out.println(x);

        String [][] myFriends = { {"Chulat", "Manu", "Nafti", "Julius"}, {"Ronaldo", "Kipngetich"} };
        System.out.println("Randomly I pick :" + myFriends[1][1]);
    }
}
