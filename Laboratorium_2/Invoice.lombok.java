import lombok.Data;

@Data class Invoice {
    private String product_number;
    private int quantity;
    private double pricePerItem;

}
class Main {
    public static void main(String[] args) {
        Invoice invoice = new Invoice();
        invoice.setPricePerItem(5);
        invoice.setQuantity(18);
        invoice.setProduct_number("997");
        System.out.println(invoice.getProduct_number() + " " +
                invoice.getPricePerItem() + " " +
                invoice.getQuantity());
    }
}

