/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nt.beans;

import java.util.Date;

/**
 *
 * @author LAKSHMI NARAYANA
 */
public class WishMessageGenerator {
    private Date date;
    public void setDate(Date date){
        this.date=date;
    }
    public String benerateWishMsg(String name){
        int hour=0;
        hour=date.getHours();
        if(hour<=12)
            return "GM:"+name;
        else if(hour<=16)
            return "GA:"+name;
        if(hour<=20)
            return "GE:"+name;
        else 
            return "GN"+name;
                }

    public String generateWishMsg(String lucky) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
            
    

