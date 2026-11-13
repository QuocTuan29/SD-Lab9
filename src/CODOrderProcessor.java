/**
 * Lớp cụ thể: Xử lý đơn hàng thanh toán khi nhận hàng (COD)
 */
public class CODOrderProcessor extends AbstractOrderProcessor {

    @Override
    protected void processPayment(Order order, double total) {
        System.out.println("3. Xử lý thanh toán COD (Thanh toán khi nhận hàng):");
        System.out.println("   - Ghi nhận đơn hàng chờ thu hộ");
        System.out.println("   - Số tiền cần thu khi giao: " + String.format("%,.0f", total) + " VND");
        System.out.println("   - Không trừ tiền ngay lập tức, chờ shipper thu từ khách.");
        System.out.println("   - Đơn hàng được đánh dấu trạng thái: Chờ thanh toán.");
    }
}
