package com.scp.hbm.BasicHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.scp.hbm.pojo.Student;
import com.scp.hbm.service.StudentService;
import com.scp.hbm.util.HbmUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
       
    	SessionFactory sessionFactory=HbmUtil.getSF();
        Session session=sessionFactory.openSession();
        Student std =StudentService.getStudent();
        
        Transaction tra=session.beginTransaction();
        session.flush();
        session.save(std);
        tra.commit();
        
        session.close();
        sessionFactory.close();
        
    }
}
