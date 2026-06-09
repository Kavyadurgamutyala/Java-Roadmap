package Day08;

abstract class Shape {
    String color;

    Shape(String color){
        this.color = color;
    }

    abstract double area();
    abstract double perimeter();

    void display(){
        System.out.println("Color: " + color);
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimeter());
        System.out.println();
    }
}

class Circle extends Shape {
    double radius;

    Circle(String color, double radius){
        super(color);
        this.radius = radius;
    }

    @Override
    double area(){
        return Math.PI * radius * radius;
    }

    @Override
    double perimeter(){
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(String color, double length, double width){
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    double area(){
        return length * width;
    }

    @Override
    double perimeter(){
        return 2 * (length + width);
    }
}

class Triangle extends Shape {
    double base, height, a, b, c;

    Triangle(String color, double base, double height,
             double a, double b, double c){
        super(color);
        this.base = base;
        this.height = height;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double area(){
        return 0.5 * base * height;
    }

    @Override
    double perimeter(){
        return a + b + c;
    }
}

public class ShapeHierarchy {
    public static void main(String[] args){

        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("Red", 5.0);
        shapes[1] = new Rectangle("Blue", 4.0, 6.0);
        shapes[2] = new Triangle("Green", 3.0, 4.0, 3.0, 4.0, 5.0);

        System.out.println("=== Shape Hierarchy ===");
        for(Shape s : shapes){
            System.out.println(s.getClass().getSimpleName());
            s.display();
        }
    }
}