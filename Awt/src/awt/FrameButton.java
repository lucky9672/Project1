import java.awt.event.*; 
import javax.swing.*; 
import java.awt.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package awt;

/**
 *
 * @author LAKSHMI NARAYANA
 */
public class FrameButton {
FrameButton()
 {
     Frame f1=new Frame();
     Button b=new Button("Click Me");
     b.setBounds(30,150,200,30);
     f1.add(b);
     f1.setSize(250,250);
     f1.setLayout(null);
     f1.setVisible(true);
 }
 
    public static void main(String[] args) {
       
        // TODO code application logic here
        FrameButton f1=new FrameButton();
    }
    
}
