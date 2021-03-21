import java.awt.*;
import java.awt.event.*;
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
public class Label2 {
    public static void main(String[] args){
        Frame f=new Frame("Label Example1");
        final TextField tf=new TextField();
        tf.setBounds(50,50,150,20);
        Label l1=new Label("My Fist Example");
        l1.setBounds(50,100,250,20);
        Button b=new Button("Submit");
        b.setBounds(50,150,60,30);
       
        b.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e){
                tf.setText("Welcome to the Example");
            }
        });
        f.add(tf);
         f.add(b);
        f.add(l1);
        f.setLayout(null);
        f.setVisible(true);
    }
    
}
