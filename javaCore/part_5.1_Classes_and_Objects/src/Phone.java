public class Phone {
    String brand; 
    public String model;
    public int price;


    void call(String number) {
        System.out.println("Звоню на номер: " + number);
    }
    
    void info() {
        System.out.println("brand= "+brand+"model= "+model+"praice= "+price);
    }

}
