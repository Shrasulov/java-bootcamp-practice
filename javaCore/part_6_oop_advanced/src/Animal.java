public class Animal {
    String name;

    public Animal(String name) {
        System.out.println();
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " ест");
    }
    
    public void sleep() {
        System.out.println(name + " спит");
    }
    
    public void makeSound() {
        System.out.println(name + " издает звук");
    }
}
