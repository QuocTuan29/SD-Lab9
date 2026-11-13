/**
 * Chương trình minh họa mẫu thiết kế Template Method
 * Xử lý đơn hàng với hai phương thức thanh toán khác nhau
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=====================================================");
        System.out.println("  MINH HỌA MẪU TEMPLATE METHOD - XỬ LÝ ĐƠN HÀNG");
        System.out.println("=====================================================\n");

        // Trường hợp 1: Thanh toán bằng thẻ tín dụng
        System.out.println("--- TRƯỜNG HỢP 1: THANH TOÁN BẰNG THẺ TÍN DỤNG ---");
        Order order1 = new Order("ORD-2026-001", "Nguyễn Văn An", 175000, 2, "Áo thun nam cao cấp");
        AbstractOrderProcessor creditCardProcessor = new CreditCardOrderProcessor();
        creditCardProcessor.processOrder(order1);

        // Trường hợp 2: Thanh toán COD
        System.out.println("--- TRƯỜNG HỢP 2: THANH TOÁN KHI NHẬN HÀNG (COD) ---");
        Order order2 = new Order("ORD-2026-002", "Trần Thị Bình", 899000, 1, "Giày sneaker thể thao");
        AbstractOrderProcessor codProcessor = new CODOrderProcessor();
        codProcessor.processOrder(order2);

        // Trường hợp 3: Đơn hàng không hợp lệ (để kiểm tra validate)
        System.out.println("--- TRƯỜNG HỢP 3: ĐƠN HÀNG KHÔNG HỢP LỆ ---");
        Order order3 = new Order("ORD-2026-003", "Lê Văn Cường", -50000, 0, "Sản phẩm lỗi");
        AbstractOrderProcessor anyProcessor = new CreditCardOrderProcessor();
        anyProcessor.processOrder(order3);
    }
}
