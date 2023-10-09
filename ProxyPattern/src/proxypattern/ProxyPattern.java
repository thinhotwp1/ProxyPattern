package proxypattern;

public class ProxyPattern {
    /**
     * Thay vì gọi trực tiếp request từ đối tượng sẽ tạo một proxy dựa trên đối tượng chính,
     * từ đó logging request hoặc thêm các điều kiện như kiểm tra quyền user, validate trước và
     * sau khi thực hiện request.
     */
    public static void main(String[] args) {
        // Tạo object thật
        RealObject realObject = new RealObjectImpl();

        // Tạo proxy khởi tạo dựa theo objec thật
        Proxy proxy = new Proxy(realObject);

        // Call request bằng proxy
        proxy.request();
    }
}
