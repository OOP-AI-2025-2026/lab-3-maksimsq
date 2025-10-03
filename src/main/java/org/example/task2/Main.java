package org.example.task2;

public class Main {
    public static void main(String[] args) {

        Cart cart = new Cart(new Item[10]);
        cart.add(new Item(1, "Samsung Galaxy S23", 27999));
        cart.add(new Item(2, "Lenovo IdeaPad 3", 19499));
        cart.add(new Item(3, "LG 55\" 4K Smart TV", 15999));
        cart.add(new Item(4, "Bosch Serie 6 Пральна машина", 14799));
        cart.add(new Item(5, "Samsung RB34 Холодильник", 22399));
        cart.add(new Item(6, "De'Longhi Magnifica S Кавоварка", 10599));
        cart.add(new Item(7, "Gorenje Електрична плита", 9999));
        cart.add(new Item(8, "Dyson V11 Пилосос", 16499));
        cart.add(new Item(9, "Samsung ME83K Мікрохвильова піч", 3199));
        cart.add(new Item(10, "Philips DryCare Фен", 1499));

        System.out.println(cart);

        cart.removeById(9);

        System.out.println(cart);

        Order order = new Order(1L, "John");
        String bill = order.formOrderBill(cart);
        System.out.println(bill);

        System.out.println("\n==============================\n");
        System.out.println("    Завдання 1. Клас Box");
        System.out.println("\n==============================\n");

        // коректна коробка
        Box validBox = new Box(5, 6, 7);
        System.out.println("Valid box parameters :");
        System.out.println("Surface area = " + validBox.getSurfaceArea()); // площа поверхні
        System.out.println("Volume = " + validBox.getVolume()); // об'єм
        System.out.println("Lateral surface area = " +  validBox.getLateralSurfaceArea()); // бічна площа

        System.out.println("\n==============================\n");

        // некоректна коробка (негативні параметри)
        Box invalidBox = new Box(-2, 0, 1);
        System.out.println("Invalid box parameters :");
        System.out.println("Surface area = " + invalidBox.getSurfaceArea());
        System.out.println("Volume = " + invalidBox.getVolume());
        System.out.println("Lateral surface area = " +  invalidBox.getLateralSurfaceArea());

        System.out.println("\n==============================\n");
        System.out.println("    Завдання 3. Клас IntStack");
        System.out.println("\n==============================\n");

        IntStack stack = new IntStack();

        // перевіряємо push()
        System.out.println("Pushing elements (10, 20, 30)...");
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // перевіряємо size() і peek()
        System.out.println("Size after pushing elements = " +  stack.size());
        System.out.println("Top element (stack) = " + stack.peek());
        System.out.println("Size after peek = " + stack.size());

        // перевіряємо pop()
        System.out.println("Popped: " +  stack.pop());
        System.out.println("Popped: " +  stack.pop());
        System.out.println("New top element (peek) = " + stack.peek());

        // статус після видалень
        System.out.println("Size after popping = " +  stack.size());
        System.out.println("Is it empty? " + stack.isEmpty());

        // перевіряємо clear()
        System.out.println("Clearing stack");
        stack.clear();
        System.out.println("After clear, is it empty? " + stack.isEmpty());

        // тестуємо помилки (pop/peek на пустому стеку)
        System.out.println("Trying to pop from empty stack: ");
        System.out.println("Pop result = " + stack.pop());
        System.out.println("Trying to peek on empty stack: ");
        System.out.println("Peek result = " + stack.peek());
    }
}