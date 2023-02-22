public interface Animal {
     String species = "African Elephant";
     int legs = 4;
     int horns = 2;


    void eat();
    void sleep();
    void makeSound();
    void move();

    default void getInfo() {
        System.out.println("This is an " + species + " and has " + legs + " legs and " + horns +" horns.");
    }

    static void printWarning() {
        System.out.println("Warning: This animal may be dangerous!");
    }
}