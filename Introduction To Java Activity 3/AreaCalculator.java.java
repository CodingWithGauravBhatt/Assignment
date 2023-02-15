package com.cognizant.shapes;

public class AreaCalculator {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10.0, 5.0);
        rectangle.calculateArea();
    }

    public static class Rectangle {
        private double length;
        private double breadth;

        public Rectangle(double length, double breadth) {
            this.length = length;
            this.breadth = breadth;
        }

        public void calculateArea() {
            System.out.println("The Area of the rectangle is calculated using the formula length * breadth");
        }
    }
}
