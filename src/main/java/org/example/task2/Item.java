package org.example.task2;

public class Item {

    private long id; // унікальний ідентифікатор
    private String name; // назва товару
    private double price; // ціна товару

    // конструктор для створення товару
    public Item(long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // повертає id товару
    public long getId() {
        return this.id;
    }

    // повертає назву товару
    public String getName() {
        return this.name;
    }

    // повертає ціну товару
    public double getPrice() {
        return this.price;
    }


    @Override
    public String toString() {
        return "Item{" +
                "id=" + this.id +
                ", price=" + this.price +
                ", name='" + this.name + '\'' +
                '}' + "\n";
    }
}
