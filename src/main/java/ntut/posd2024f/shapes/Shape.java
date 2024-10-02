package ntut.posd2024f.shapes;

public interface Shape {
    public double area();
    public double perimeter();
    public void add(Shape s);
    
    public NullIterator iterator();

    
}
