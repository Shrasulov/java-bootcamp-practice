public class Main {
    //Поля и методы класса
    public static void main(String[] arges) {
        // Класс машина
        Car bmw = new Car();
        bmw.brand = "gf";
        bmw.year = 1234;
        bmw.printInfo();

        // Задача 1: Класс “Телефон”
        Phone apple = new Phone();
        apple.brand = "appl";
        apple.model = "x";
        apple.price = 15999;

        apple.info();
        apple.call("12432345");


        //⭐ Задача 2: Класс “Книга”
        Book b1 = new Book();
        b1.title = "hichi";
        b1.author = "nmeki";
        b1.year = 2025;

        b1.printInfo();
        b1.isNew();


        //⭐ Задача 3: Класс “Игрок”
        User user1 = new User();
        user1.nickname = "king";
        user1.hp = 103;
        user1.printStatus();
        user1.takeDamage(77);
        user1.printStatus();
        user1.heal(50);
        user1.printStatus();


    }
}