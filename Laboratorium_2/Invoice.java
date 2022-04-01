package com.company;

class Invoice {
    private String product_number;
    private String product_description;
    private int quantity;
    private double pricePerItem;

    public String getProduct_number() {
        return product_number;
    }

    public void setProduct_number(String product_number) {
        this.product_number = product_number;
    }

    public String getProduct_description() {
        return product_description;
    }

    public void setProduct_description(String product_description) {
        this.product_description = product_description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    public Invoice(String product_number, String product_description, int quantity, double pricePerItem) {
        this.product_number = product_number;
        this.product_description = product_description;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public double Amount() {
        if ((quantity <= 0) || (pricePerItem <= 0)) {
            return 0;
        } else {
            return quantity * pricePerItem;
        }
    }
}

class Main {
    public static void main(String[] args) {
        Invoice inv1 = new Invoice("1", "random_product", 3, 1.48);
        System.out.println(inv1.Amount());

        Invoice inv2 = new Invoice("2", "random_product", 0, 2.15);
        System.out.println(inv2.Amount());

        Invoice inv3 = new Invoice("3", "random_product", 8, 0);
        System.out.println(inv3.Amount());
    }
}
