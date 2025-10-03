package org.example.task2;

public class Order {

    private long id;
    private String customer;

    // конструктор створює замовлення
    public Order(long id, String customer) {
        this.id = id;
        this.customer = customer;
    }

    // повертає id замовлення
    public long getId() {
        return this.id;
    }

    // повертає ім'я клієнта
    public String getCustomer() {
        return this.customer;
    }

    // формує текстовий рахунок для замовлення
    public String formOrderBill(Cart cart) {

        StringBuilder builder = new StringBuilder();
        builder.append("Order number ").append(id).append(" for customer ").append(customer);
        builder.append("\n------------------\n");

        double sum = 0.0;

        // додаємо всі товари з корзини у рахунок
        for (int i = 0; i < cart.getCurrentSize(); i++) {
            Item currentItem = cart.getItem(i);

            sum += currentItem.getPrice();

            builder.append("Item id: ");
            builder.append(currentItem.getId());
            builder.append(" name: ");
            builder.append(currentItem.getName());
            builder.append(" price: ");
            builder.append(currentItem.getPrice());
            builder.append("\n");
        }

        builder.append("------------------\n");
        builder.append("Total sum: ");
        builder.append(sum);


        return builder.toString();
    }
}
