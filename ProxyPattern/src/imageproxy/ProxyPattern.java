/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package imageproxy;

/**
 *
 * @author Administrator
 */
public class ProxyPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Image image = new ProxyImage("test_image.jpg");

        // Hình ảnh chưa được tải trước đó, đối tượng ProxyImage sẽ 
        //tải hình ảnh từ đĩa
        image.display();
        System.out.println("");

        // Hình ảnh đã được tải trước đó, đối tượng ProxyImage sẽ 
        //chỉ đơn giản chuyển tiếp yêu cầu hiển thị đến đối tượng RealImage
        image.display();
    /* Virtual Proxy: Đối tượng proxy sẽ tạo đối tượng thực sự chỉ khi nó 
        được yêu cầu  (image real và image proxy) */

    }

}
