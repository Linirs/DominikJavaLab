public class Main {
    public static void main(String[] args) {
        Human czlek = new Human(1992, new Car("ferrari", "192"));
        Car fiat1 = new Car("Fiat", "fiat1");
        Car fiat2 = new Car("Fiat", "fiat1");
        Animal dog = new Animal("canis");
        dog.feed();
        dog.takeForAWalk();
        for (int i = 0; i < 13; i++) {
            dog.takeForAWalk();
        }

    }
}