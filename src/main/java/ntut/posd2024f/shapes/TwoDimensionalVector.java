package ntut.posd2024f.shapes;

public class TwoDimensionalVector {
    public double x, y;
    public TwoDimensionalVector(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double length() {
        return Math.sqrt(x * x + y * y);
    }

    public double dot(TwoDimensionalVector op) {
        return this.x * op.x + this.y * op.y;

    }

    public double cross(TwoDimensionalVector op) {

        return this.x * op.y - this.y * op.x;
    }



    public TwoDimensionalVector subtract(TwoDimensionalVector op) {
        double newX = this.x - op.x;
        double newY =  this.y - op.y;
        return new TwoDimensionalVector(newX, newY);


    }
}
