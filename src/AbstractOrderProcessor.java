/**
 * Lớp trừu tượng định nghĩa khung thuật toán xử lý đơn hàng (Template Method Pattern)
 */
public abstract class AbstractOrderProcessor {

    /**
     * Template Method: định nghĩa quy trình xử lý chung, không cho phép override
     */
    public final void processOrder(Order order) {
        System.out.println("=== BẮT ĐẦU XỬ LÝ ĐƠN HÀNG: " + order.getOrderId() + " ===");
        
        // Bước 1: Xác thực đơn hàng (chung)
        if (!validateOrder(order)) {
            System.out.println("Đơn hàng không hợp lệ. Dừng xử lý.\n");
            return;
        }
        
        // Bước 2: Tính tổng tiền (chung)
        double total = calculateTotal(order);
        System.out.println("Tổng tiền cần thanh toán: " + String.format("%,.0f", total) + " VND");
        
        // Bước 3: Xử lý thanh toán (thay đổi tùy phương thức - abstract)
        processPayment(order, total);
        
        // Bước 4: Cập nhật tồn kho (chung)
        updateInventory(order);
        
        // Bước 5: Gửi thông báo xác nhận (chung)
        sendConfirmation(order);
        
        System.out.println("=== HOÀN TẤT XỬ LÝ ĐƠN HÀNG ===\n");
    }

    /**
     * Bước chung: Kiểm tra tính hợp lệ của đơn hàng
     */
    protected boolean validateOrder(Order order) {
        if (order == null || order.getAmount() <= 0 || order.getQuantity() <= 0) {
            System.out.println("1. Xác thực đơn hàng: THẤT BẠI (dữ liệu không hợp lệ)");
            return false;
        }
        System.out.println("1. Xác thực đơn hàng: THÀNH CÔNG");
        return true;
    }

    /**
     * Bước chung: Tính tổng tiền đơn hàng
     */
    protected double calculateTotal(Order order) {
        System.out.println("2. Tính toán tổng tiền đơn hàng");
        return order.getAmount() * order.getQuantity();
    }

    /**
     * Bước thay đổi: Xử lý thanh toán - các lớp con phải triển khai
     */
    protected abstract void processPayment(Order order, double total);

    /**
     * Bước chung: Cập nhật số lượng tồn kho
     */
    protected void updateInventory(Order order) {
        System.out.println("4. Cập nhật tồn kho: giảm " + order.getQuantity() 
            + " sản phẩm \"" + order.getProductName() + "\"");
    }

    /**
     * Bước chung: Gửi thông báo xác nhận cho khách hàng
     */
    protected void sendConfirmation(Order order) {
        System.out.println("5. Gửi thông báo xác nhận đến khách hàng: " + order.getCustomerName());
    }
}
