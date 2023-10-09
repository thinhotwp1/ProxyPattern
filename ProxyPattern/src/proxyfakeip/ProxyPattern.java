/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proxyfakeip;

/**
 *
 * @author Administrator
 */
public class ProxyPattern {
    /**
     * Remote Proxy: Khi bị chặn ở trang cado.vn ở Việt Nam thì tạo 1 proxy đứng chặn ở ngoài
     * sẽ gọi qua proxy này tới trang cado.vn, vì proxy này ip nước ngoài nên trang cado.vn
     * không bị chặn, proxy internet
     */


    public static void main(String[] args) {

        System.out.println("===== Real Internet =====");
        Internet internetReal = new RealInternet();
        try {
            internetReal.connectTo("google.com");
            internetReal.connectTo("cado.vn");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("===== Proxy Internet =====");
        Internet internetProxy = new ProxyInternet();
        try {
            internetProxy.connectTo("google.com");
            internetProxy.connectTo("bongda.com");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
