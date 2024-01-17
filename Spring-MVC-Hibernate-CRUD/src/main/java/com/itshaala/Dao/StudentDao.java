package com.itshaala.Dao;

import com.itshaala.Model.Student;
import com.itshaala.Util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {

    public void addStudent(Student student) {
       Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(student);
        transaction.commit();
        session.close();
    }
}
