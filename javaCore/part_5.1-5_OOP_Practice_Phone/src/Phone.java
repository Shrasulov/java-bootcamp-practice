public class Phone {
    private String model;
    private String brand;
    private double price;
    private String color;
    private int storage; // память в ГБ
    private int ram;     // ОЗУ
    private int id;

    // --- Конструкторы ---
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

    // --- Методы ---
    public void showInfo() {
        System.out.println("Phone info:");
        System.out.println("ID: " + id);
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("Color: " + color);
        System.out.println("Storage: " + storage + "GB");
        System.out.println("RAM: " + ram + "GB");
    }

    // --- Геттеры и сеттеры ---
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
