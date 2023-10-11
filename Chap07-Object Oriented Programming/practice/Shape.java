package chap07;

public abstract class Shape {

    public abstract double areaCalculate();
}
class Rectangle extends Shape{
    private double length;
    private double width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double areaCalculate() {
        return length * width ;
    }
}

class Circle extends Shape {
    private final double PI = 3.14156;
    private double radius ;

    public Circle(double radius) {
        this.radius = radius;
    }


    @Override
    public double areaCalculate() {
        return  PI * radius * radius;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 8);
        double area = rectangle.areaCalculate();
        System.out.println(area);
    }
}
