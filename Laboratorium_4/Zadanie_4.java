class Circle {
    double radius = 1.0;
    String color = "red";

    public Circle(){};
    public Circle(double db){
        this.radius = db;
    }
    public Circle(double db, String str) {
        this.radius = db;
        this.color = str;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double p) {
        this.radius = p;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String col) {
        this.color = col;
    }
    public double getArea() {
        double area = (this.radius * this.radius) * 3.141592653589793;
        return area;
    }

    @Override
    public String toString() {
        return "Circle[" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ']';
    }
}
class Cylinder extends Circle {
    double height;

    public Cylinder() {
        super();
        this.height = 1.0;
    }

    public Cylinder(double height) {
        this.height = height;
    }
    public Cylinder(double radius, double height){
        this.radius = radius;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume() {
        return getArea() * height;
    }
}