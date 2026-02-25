abstract class Shape{
    abstract void calculateArea();
}
class Circle extends Shape{
    double radius;
    Circle(double radius){
        this.radius = radius;
    }
    @Override
    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}
class Rectangle extends Shape{
    double length, width;
    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    @Override
    void calculateArea() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

public class ShapeDemo {
    
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        circle.calculateArea();
        rectangle.calculateArea();
    }
}
