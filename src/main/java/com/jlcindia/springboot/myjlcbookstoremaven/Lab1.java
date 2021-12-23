package com.jlcindia.springboot.myjlcbookstoremaven;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class Lab1 
{
	@Autowired
	CustomerDAO cdao;
    public static void main( String[] args )
    {
     //   AnnotationConfigApplicationContext ctxx = new AnnotationConfigApplicationContext(JLCConfig.class);
     //   CustomerDAO cdao = (CustomerDAO)ctxx.getBean("custDAO");
        
        //Add Customer
   //     Customer cust1 = new Customer(107,"sd","sd@jlc",99,"Blore");
   //     cdao.addCustomer(cust1);
        
        //getAllCustomer
        
        System.out.println("-----------getAll customer---------------");
//        List<Customer> list= cdao.getAllCustomer();
 //       list.forEach(cust-> System.out.println(cust));
	    
	    System.out.println("-----------Update 1 by Deepak---------------"); 
	     System.out.println("-----------Update 2 by Deepak---------------");
    }
}
