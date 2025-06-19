public class Circle extends Shape {
    private float radius;

    Circle(float r) {
        this.radius = r;
    }

    @Override
    public float calculateArea() {
        float area = (float)Math.PI * this.radius * this.radius;
        return area;
    }

    @Override
    public void draw() {
        System.out.println("Drawing circle with radius=" + this.radius);
    }

    @Override
    public void lineColor(String color) {
        System.out.println("Line color: " + color);
    }
}
