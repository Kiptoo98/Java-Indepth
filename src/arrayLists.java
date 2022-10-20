import java.util.ArrayList;
public class arrayLists {
    public static void main(String[] args) {
        ArrayList <String> myFavPlayers = new ArrayList<String>();
        String myFavPlayer1 = "Cristiano Ronaldo";
        String myFavPlayer2 = "Lionel Messi";
        String myFavPlayer3 = "Ja Morant";

        myFavPlayers.add(myFavPlayer1);
        myFavPlayers.add(myFavPlayer2);
        myFavPlayers.add(myFavPlayer3);
        myFavPlayers.add(3,"Neymar");

        //printing out size of an array list
        System.out.println("The size of this array is :" + myFavPlayers.size());
        //Accessing an Index
        System.out.println(myFavPlayers.get(2));
        //Changing a value
        myFavPlayers.set(2,"Karim Benzema");
        //Removing an Item
        myFavPlayers.remove(0); /*or*/  //myFavPlayers.remove("Cristiano Ronaldo");
        //Getting an Item's Index
        myFavPlayers.indexOf("Neymar");
        System.out.println("Naymar\'s index is :"+myFavPlayers.indexOf("Neymar"));


        //An arraylist with different values
        ArrayList assortment = new ArrayList<>();
        assortment.add("Hello"); // String
        assortment.add(12); // Integer
        System.out.println(assortment);
    }
}
