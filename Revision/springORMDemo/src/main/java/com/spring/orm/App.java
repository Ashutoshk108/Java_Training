package com.spring.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.bean.Student;
import com.spring.dao.StudentDao;

/**
 * Hello world!
 *
 */
public class App 
{
	@SuppressWarnings("resource")
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext contextObj=new ClassPathXmlApplicationContext("config.xml");
        
        System.out.println("a");
        
        StudentDao studentDao=contextObj.getBean("studentDao",StudentDao.class);
        studentDao.add(new Student(1,"Akash","Delhi"));
    }
}
