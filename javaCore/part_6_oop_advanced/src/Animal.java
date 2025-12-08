public abstract class Animal {
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
    
    public abstract void makeSound();
}
