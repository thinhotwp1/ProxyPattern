package proxypattern;

public class Proxy implements RealObject {
    private RealObject realObject;

    public Proxy(RealObject realObject) {
        this.realObject = realObject;
    }

    public void request() {
        // Log trước khi gọi request bằng object thật
        System.out.println("Proxy: Logging before request");

        // Chuyển hướng cho object thật gọi request
        realObject.request();

        // Log sau khi gọi request bằng object thật
        System.out.println("Proxy: Logging after request");
    }
}