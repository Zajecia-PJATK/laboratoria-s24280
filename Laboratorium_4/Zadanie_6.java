class Circle extends Shape {
    double radius = 1;
    public Circle() {
    }
    public Circle(double radius) {
    this.radius = radius;
    }
    public Circle(String color, boolean filled, double radius) {
    super(color, filled);
    this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return getRadius() * getRadius() * 3.141592653589793;
    }
    public double getPerimeter() {
        return getRadius() * 2 * 3.141592653589793;
    }

    @Override
    public String toString() {
        return "Circle{" +
                super.toString() +
                " radius=" + radius + '}';
    }
}

class Rectangle extends Shape {
    double width = 1;
    double length = 1;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return getWidth() * getLength();
    }
    public double getPerimeter() {
        return (2*getWidth()) + (2*getLength());
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                super.toString() +
                " width=" + width +
                ", length=" + length +
                '}';
    }
}