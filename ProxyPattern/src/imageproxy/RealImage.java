/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package imageproxy;

/**
 *
 * @author Administrator
 */
public class RealImage implements Image {
    private String fileName;
    
    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }
    
    public void display() {
        System.out.println("Displaying " + fileName);
    }
    
    private void loadFromDisk(String fileName) {
        System.out.println("Loading " + fileName);
    }
}