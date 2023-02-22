public interface Animal {
     String species = "African Animal";
     int age = 25;


    void eat();
    void sleep();
    void makeSound();
    void move();

    default void getInfo() {
        System.out.println("This is an " + species + " and it's " + age + " years old.");
    }

    static void printWarning() {
        System.out.println("Warning: This animal may be dangerous!");
    }

}