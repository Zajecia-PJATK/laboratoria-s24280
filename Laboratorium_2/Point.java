package com.company;
import java.lang.Math;

class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    this.x = 320;
    this.y = 200;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public double distance(Point x) {
            return Math.sqrt((this.x - x.x) * (this.x - x.x) + ( this.y - x.y) * ( this.y - x.y));
    }

    public Point getCoordinates(){
        Point tmpPoint = new Point(this.x, this.y);
        return tmpPoint;
    }

    public void setCoordinates(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void setCoordinates(Point p){
        this.x = p.x;
        this.y = p.y;
    }
}

class Segment{
    private Point v1;
    private Point v2;

    public Segment(Point v1, Point v2) {
        this.v1 = v1;
        this.v2 = v2;
    }

    public Point getV1() {
        return v1;
    }

    public void setV1(Point v1) {
        this.v1 = v1;
    }

    public Point getV2() {
        return v2;
    }

    public void setV2(Point v2) {
        this.v2 = v2;
    }

    @Override
    public String toString() {
        return "Segment[" +
                "v1=" + v1.toString() +
                ", v2=" + v2.toString() +
                ']';
    }

    public double getLength(){
        double length;
        length = v1.distance(v2);
        return length;
    }
}

class Triangle{
    private Point v1;
    private Point v2;
    private Point v3;

    public Triangle(Point v1, Point v2, Point v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public Point getV1() {
        return v1;
    }

    public void setV1(Point v1) {
        this.v1 = v1;
    }

    public Point getV2() {
        return v2;
    }

    public void setV2(Point v2) {
        this.v2 = v2;
    }

    public Point getV3() {
        return v3;
    }

    public void setV3(Point v3) {
        this.v3 = v3;
    }

    @Override
    public String toString() {
        return "Triangle[" + "v1=" + v1 + ", v2=" + v2 + ", v3=" + v3 +']';
    }

    public double getDistances(){
        double distance;
        distance = (v1.distance(v2)) + (v1.distance(v3)) + (v2.distance(v3));
        return distance;
    }

    public String getType(){
        String type;
        double a = v1.distance(v2);
        double b = v1.distance(v3);
        double c = v2.distance(v3);

        if((a==b) && (b==c)) {
            type = "Równoboczny";
        }
        else if((a==b) || (b==c) || (a==c)) {
            type = "Równoramienny";
        }
        else{
            type = "Różnoboczny";
        }
        return type;
    }

}

class Main {
    public static void main(String[] args) {
        Segment segment = new Segment(new Point(2,3), new Point(5,6));
        System.out.println(segment.toString());

        Triangle triangle = new Triangle(new Point(4,2), new Point(2,5), new Point(6,3));
        System.out.println(triangle.toString());
        System.out.println("Długość odcinka: " + segment.getLength());
        System.out.println("Obwód trójkąta: " + triangle.getDistances());
        System.out.println("Rodzaj trójkąta: " + triangle.getType());
    }
}
