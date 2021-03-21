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
public class label {
    public static void main(String[] args)
    {
        Frame f=new Frame("LableExample");
        Label l1,l2;
        l1=new Label("FirstLable");
        l1.setBounds(50,100,100,20);
        l2=new Label("SecondLable");
        l2.setBounds(50,150,100,35);
        f.add(l1);
        f.add(l2);
        f.setSize(200,300);
        f.setLayout(null);
        f.setVisible(true);
    }
    
}
