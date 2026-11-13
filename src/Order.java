public class Order {
    private String orderId;
    private String customerName;
    private double amount;
    private int quantity;
    private String productName;

    public Order(String orderId, String customerName, double amount, int quantity, String productName) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.amount = amount;
        this.quantity = quantity;
        this.productName = productName;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getAmount() {
        return amount;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getProductName() {
        return productName;
    }
}
