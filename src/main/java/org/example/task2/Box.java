package org.example.task2;

public class Box {
    private  double width; // ширина коробки
    private double height; // висота коробки
    private double length; // довжина коробки

    // конструктор з перевіркою даних
    public Box(double width, double height, double length) {
        setWidth(width);
        setHeight(height);
        setLength(length);
    }

    // перевірка ширини (має бути > 0)
    private void setWidth(double width) {
        if (width <= 0) {
            System.out.println("Width must be greater than zero. The default value will be set to 1");
            this.width = 1;
            return;
        }
            this.width = width;
    }

    // перевірка висоти (має бути > 0)
    private void setHeight(double height) {
        if (height <= 0) {
            System.out.println("Height must be greater than zero. The default value will be set to 1");
            this.height = 1;
            return;
        }
        this.height = height;
    }

    // перевірка довжини (має бути > 0)
    private void setLength(double length) {
        if (length <= 0) {
            System.out.println("Length must be greater than zero. The default value will be set to 1");
            this.length = 1;
            return;
        }
        this.length = length;
    }

    // рахує об'єм коробки
    public double getVolume() {
        return width * height * length;
    }

    // рахує площу бічних граней
    public double getLateralSurfaceArea() {
        return 2 * length * height + 2 * width * height;
    }

    // рахує повну площу поверхні
    public double getSurfaceArea() {
        return 2 * length * width + 2 * length * height + 2 * width * height;
    }
}