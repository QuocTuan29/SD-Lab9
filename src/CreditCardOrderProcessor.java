/**
 * Lớp cụ thể: Xử lý đơn hàng thanh toán bằng thẻ tín dụng
 */
public class CreditCardOrderProcessor extends AbstractOrderProcessor {

    @Override
    protected void processPayment(Order order, double total) {
        System.out.println("3. Xử lý thanh toán bằng THẺ TÍN DỤNG:");
        System.out.println("   - Kết nối cổng thanh toán (Visa/Mastercard/JCB)...");
        System.out.println("   - Xác thực thông tin thẻ và OTP");
        System.out.println("   - Trừ tiền thành công: " + String.format("%,.0f", total) + " VND");
        System.out.println("   - Giao dịch đã được ghi nhận.");
    }
}
