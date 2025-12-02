public class User {
    String nickname;
    int level;
    int hp;

    //уменшает hp
    void takeDamage(int amount) {
        System.out.println(hp - amount);
    }
    
    //увеличивает hp
    void heal(int amount) {
        System.out.println(hp + amount);
    }
    
    //выводит статус
    void printStatus() {
        System.out.println("Name "+nickname+"\nLevel "+level+"\nHP "+ hp);
    }
}
