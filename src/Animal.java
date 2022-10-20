class Animal {
    public void animalSound(){
        System.out.println("An animal has its own unique sound");
    }
}
class Cat extends Animal{
    public void animalSound() {
        System.out.println("A cat meows");
    }
}
class Lion extends Animal{
    public void animalSound(){
        System.out.println("A lion roars");
    }
}
class Main {
    public static void main(String[] args) {
        Animal myCat = new Cat();
        Animal myLion = new Lion();
        Animal myAnimal = new Animal();
        myAnimal.animalSound();
        myCat.animalSound();
        myLion.animalSound();
    }
}

