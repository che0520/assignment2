package ntut.posd2024f.shapes;

public class Circle implements Shape {
    private double radian;
   

    public Circle(Double... args) throws ShapeException{
        if (args.length != 1)
            throw new ShapeException("It's not a circle!");
        radian = args[0];

    }
    public int test() {
        return 10;
    }
    public double area() {
        return radian * radian * 3.14;
    }

    public double perimeter() {
        return 2 * radian * 3.14;
    }

}
