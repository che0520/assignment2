package ntut.posd2024f.shapes;

public class ShapeException extends Exception{
    private String message;
    public ShapeException() {};
    public ShapeException(String message) {
        this.message = message;
    }
    public String toString() {
        return message;
    }
}
