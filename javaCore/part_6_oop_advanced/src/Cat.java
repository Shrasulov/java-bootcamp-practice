public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(name + " есть рибу и корм");
    }

    @Override
    public void sleep() {
        System.out.println(name + " кошка спит на солнце");
    }
    
    @Override
    public void makeSound() {
        System.out.println(name+" мяаукает");
    }
}
