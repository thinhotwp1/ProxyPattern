/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proxyfakeip;

/**
 *
 * @author Administrator
 */
public class Main {

    public static void main(String[] args) {
        /* Remote Proxy: Đối tượng proxy sẽ làm việc với 
        đối tượng thực sự nằm trên một máy chủ từ xa(fake ip) */

        System.out.println("===== Real Internet =====");
        Internet internetReal = new RealInternet();
        try {
            internetReal.connectTo("google.com");
            internetReal.connectTo("bongda.com");
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
