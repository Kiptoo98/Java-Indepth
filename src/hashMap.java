import java.util.HashMap;
public class hashMap {
    public static void main(String[] args) {
        HashMap <String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("Kenya", "Nairobi");
        capitalCities.put("Uganda", "Kampala");
        capitalCities.put("Tanzania", "Dar Es Salaam");
        capitalCities.put("England", "London");
        capitalCities.put("USA", "Washington");

        //System.out.println(capitalCities);
        for (String i : capitalCities.keySet()){
            System.out.println("Country: " +i +" Capital City: " +capitalCities.get(i));
        }

        HashMap <String, Integer> Students = new HashMap<String, Integer>();
        Students.put("Manu Mdogo", 123);
        Students.put("Manu Mkubwa", 124);
        Students.put("General Grey", 125);
        Students.put("Bryan Kip", 126);

        for (String i : Students.keySet()){
            System.out.println("Student Name: " +i + " Admission No. " +Students.get(i));
        }
    }
}
