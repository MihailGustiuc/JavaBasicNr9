public class Main {

    public static void main(String[] args) {
        Animal elephant = new Elephant();
        elephant.eat();
        elephant.sleep();
        elephant.makeSound();
        elephant.move();
        elephant.getInfo();
        Animal.printWarning();

        Herbivorous elephant1 = new Elephant();
        elephant1.graze();
        elephant1.runAway();

    }
}