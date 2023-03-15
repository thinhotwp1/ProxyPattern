/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proxyfakeip;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class RealInternet implements Internet {

    private List<String> bannedSites = new ArrayList<>();

    private void prepare() {
        bannedSites.add("bongda.com");
        bannedSites.add("cado.vn");
        //....
    }

    @Override
    public void connectTo(String serverHost) throws Exception {
        prepare();
        if (bannedSites.contains(serverHost.toLowerCase())) {
            throw new Exception("Trang web bị khóa " + serverHost);
        }
        System.out.println("Connecting to " + serverHost);
    }
}
