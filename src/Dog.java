public class Dog {
    String breed;
    boolean hasOwner;
    int age;

    public Dog(String dogBreed, boolean dogOwned, int dogYears) {
        System.out.println("Constructor invoked!");
        breed = dogBreed;
        hasOwner = dogOwned;
        age = dogYears;
    }

    public static void main(String[] args) {
        System.out.println("Main method started");
        Dog fido = new Dog("poodle", false, 4);
        Dog nunzio = new Dog("shiba inu", true, 12);
        Dog yangu = new Dog("Jimmy", true, 11);
        boolean isjimmyYoungest = yangu.age < fido.age;
        boolean isFidoOlder = fido.age > nunzio.age;
        int totalDogYears = nunzio.age + fido.age;
        System.out.println("Three dogs created: a " + fido.breed + " and a " + nunzio.breed +" and a " + yangu.breed);
        System.out.println("The statement that fido is an older dog is: " + isFidoOlder);
        System.out.println("The statement that Jimmy is a younger dog is: " + isjimmyYoungest);
        System.out.println("The total age of the dogs is: " + totalDogYears);
        System.out.println("Main method finished");
    }
}
