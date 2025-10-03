package org.example.task2;

public class IntStack {
    private int[] stackArray; // масив для зберігання елементів
    private int top; // покажчик на верхній елемент
    private static final int DEFAULT_CAPACITY = 20; // початковий розмір масиву

    // створює новий стек з початковою місткістю
    public IntStack() {
        stackArray = new int[DEFAULT_CAPACITY];
        top = 0;
    }

    // додає елемент у стек
    public void push(int element) {
        if  (top == stackArray.length) {
            System.out.println("Stack Full");
            return;
        }
        stackArray[top] = element;
        top++;
    }

    // видаляє та повертає верхній елемент
    public int pop() {
        if  (top == 0) {
            System.out.println("Stack Empty");
            return 0;
        }
        return stackArray[--top];
    }

    // повертає верхній елемент без видалення
    public int peek() {
        if  (top == 0) {
            System.out.println("Stack Empty");
            return 0;
        }
        return stackArray[top - 1];
    }

    // повертає кількість елементів у стеці
    public int size() {
        return top;
    }

    // перевіряє, чи стек порожній
    public boolean isEmpty() {
        return top == 0;
    }

    // очищає стек
    public void clear() {
        top = 0;
    }
}
