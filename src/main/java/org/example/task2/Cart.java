package org.example.task2;

import java.util.Arrays;

public class Cart {

    private Item[] contents; // масив для зберігання товарів
    private int index; // поточна кількість товарів

    // конструктор створює копію масиву товарів
    public Cart(Item[] _contents) {
        this.contents = Arrays.copyOf(_contents, _contents.length);
        this.index = 0;
    }

    public void removeById(int itemIndex) {

        if (index == 0)
            return;

        int foundItemIndex = findItemInArray(contents[itemIndex]);

        if (foundItemIndex == -1)
            return;

        if (foundItemIndex == index - 1) {
            contents[index - 1] = null;
            index--;
            return;
        }

        shiftArray(foundItemIndex);
    }

    public void shiftArray(int itemIndex) {
        for (int i = itemIndex; i < index - 1; i++) {
            contents[i] = contents[i + 1];
        }
        contents[index-1] = null;
        index--;
    }

    public int findItemInArray(Item item) {
        for (int i = 0; i < index; i++) {
            if (contents[i].getId() == item.getId()) {
                return i;
            }
        }

        return -1;
    }

    void add(Item item) {
        if (isCartFull())
            return;

        contents[index] = item;
        index++;
    }

    // повертає кількість товарів у корзині
    public int getCurrentSize() {
        return this.index;
    }

    // повертає товар за індексом або null, якщо він некоректний
    public Item getItem(int itemIndex) {
        if (itemIndex < 0 || itemIndex >= this.index) {
            return null;
        }
        return contents[itemIndex];
    }

    // перевіряє чи корзина заповнена
    public boolean isCartFull() {
        return index == contents.length;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "contents=" + Arrays.toString(contents) +
                '}' + "\n";
    }
}
