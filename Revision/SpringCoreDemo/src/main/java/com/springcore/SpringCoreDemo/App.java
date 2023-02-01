package com.springcore.SpringCoreDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext appContxtObj=new ClassPathXmlApplicationContext("config.xml");
        
        Student student=(Student)appContxtObj.getBean("student1");
        System.out.println(student);
        
        
        Student student2=(Student)appContxtObj.getBean("student2");
        System.out.println(student2);
        
    }
}
