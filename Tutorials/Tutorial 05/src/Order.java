public class Order {
    private int orderName;
    private String customerName;
    private String orderDetails;
    private String status;
    public Order(int orderName, String customerName, String orderDetails,
                 String status) {
        this.orderName = orderName;
        this.customerName = customerName;
        this.orderDetails = orderDetails;
        this.status = status;
    }
    public int getOrderName() {
        return orderName;
    }
    public String getCustomerName() {
        return customerName;
    }
    public String getOrderDetails() {
        return orderDetails;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}