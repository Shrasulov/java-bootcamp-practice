public class Phone {
    public String model;
    private String brand;
    public double praice;
    private String color;
    private int storage;    //память в гб
    public int ram; //ОЗУ
    private int id;

    // --- конструктори ---

    public Phone(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }
    
    public Phone(String model, String brand, int storage, int ram) {
        this.model = model;
        this.brand = brand;
        this.storage = storage;
        this.ram = ram;
    }
    
    // --- методы ---

    public void showInfo() {
        System.out.println("id = " + id + " brand = " + brand + "    model = " + model + "   praice = " + praice
                + "    color = " + color + "   storage = " + storage + "  ram = " + ram);
    }
    
    // --- геттеры и сеттеры
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPraice(int praice) {
        this.praice = praice;
    }

    public double getPraice() {
        return praice;
    }

}
