/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nt.test;
//package com.nt.beans.WishMessageGenerator;
import com.nt.beans.WishMessageGenerator;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
        /**
 *
 * @author LAKSHMI NARAYANA
 */
public class SetterInjectionTest {
    public static void main(String[] args)
    {
        Resource res=null;
        BeanFactory factory=null;
        Object obj=null;
        WishMessageGenerator generator=null;
        res=new FileSystemResource("src/com/cfgs/applicationContext.xml");
        factory=new XmlBeanFactory(res);
        obj=factory.getBean("wish");
        generator=(WishMessageGenerator)obj;
        System.out.println("Message:::"+generator.generateWishMsg("Lucky"));
        
    }
    
}
