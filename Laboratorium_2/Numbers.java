package com.company;

class Numbers {
    private int a;
    private int b;
    private int c;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public Numbers(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int sum() {
        return a + b + c;
    }

    public double average() {
        return (a + b + c)/3;
    }

    public int min() {
        return Math.min(a, Math.min(b, c));
    }

    public int max(){
        return Math.max(a, Math.max(b, c));
    }

    public double geometric(){
        return Math.pow((a * b * c), (1/3));
    }

    @Override
    public String toString() {
        return "suma = " + sum() +
                "\nśrednia = " + average() +
                "\nminimum = " + min() +
                "\nmaximum = " + max() +
                "\nśrednia geometryczna = " + geometric();
    }
}

class Main {
    public static void main(String[] args) {
        Numbers number = new Numbers(2, 8, 18);
        System.out.println(number);
    }
}
