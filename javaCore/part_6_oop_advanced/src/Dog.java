public class Dog extends Animal implements Voice {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(name + " есть кости и корм");
    }

    @Override
    public void sleep() {
        System.out.println(name + " собака спит, свернувшись калачиком");
    }

    @Override
    public void makeSound() {
        System.out.println(name + "   лает");
    }
}
