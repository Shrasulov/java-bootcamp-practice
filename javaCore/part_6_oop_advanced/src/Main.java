public class Main {

    public static void main(String[] arges) {
        Dog dog = new Dog("recs");
        //dog.name = "recs";
        dog.makeSound();
        dog.eat();
        dog.sleep();

        Cat cat = new Cat("murka");
        //cat.name = "murka";
        cat.makeSound();
        cat.eat();
        cat.sleep();

        Animal[] animals={
            new Dog("Рекс"),
            new Cat("Луиза")
        };

        for (Animal a : animals) {
            a.makeSound();
            a.eat();
            a.sleep();
        }
        
    }
}