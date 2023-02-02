package com.spring.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.spring.hibernate.oneToMany.BankAccount;
import com.spring.hibernate.oneToMany.Person;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello world!" );
        
        //Configuration cfg=new Configuration();
        //SessionFactory factory=new Configuration().configure().buildSessionFactory();
        
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        
        //User usr=new User("ajay1","qwerty1234","delhi");
        Person p=new Person();
        p.setId(1);
        p.setName("Ajay");
        
        List<BankAccount> bankAccnts=new ArrayList<BankAccount>();
        
        BankAccount b1=new BankAccount();
        b1.setAccntNumber(2134252364);
        b1.setBankName("Hdfc");
        b1.setPerson(p);
        
        
        BankAccount b2=new BankAccount();
        b2.setAccntNumber(353425264);
        b2.setBankName("Kotak");
        b2.setPerson(p);
        
        bankAccnts.add(b1);
        bankAccnts.add(b2);
        //p.setBankAccnts(bankAccnts);
        
        //System.out.println(usr);
        System.out.println(p);
        
        
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        //session.save(usr);
        session.save(p);
        session.save(b1);
        session.save(b2);
        
        
        Person p1=(Person)session.get(Person.class, 1);
        System.out.println(p1);
        
        
        tx.commit();
        
        session.close();
    }
}
