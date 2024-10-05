package ntut.posd2024f.shapes;

public class ShapeException extends RuntimeException{
    private String s;
    public ShapeException(String message) {
        s = message;

    }
    public String toString() {
        return s;
    }
}
