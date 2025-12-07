public class Main {

    public static void main(String[] arges) {
        Dog dog = new Dog("recs");
        //dog.name = "recs";
        dog.eat();
        dog.bark();
        dog.sleep();

        Cat cat = new Cat("murka");
        //cat.name = "murka";
        cat.eat();
        cat.meow();
        cat.sleep();
        
    }
}