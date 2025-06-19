public class Rectangle extends Shape {
    private float width;
    private float height;

    Rectangle(float w, float h) {
        this.width = w;
        this.height = h;
    }

    @Override
    public float calculateArea() {
        float area = this.width * this.height;
        return area;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle with width=" + this.width + " height=" + this.height);
    }

    @Override
    public void lineColor(String color) {
        System.out.println("Line color is " + color);
    }
}
