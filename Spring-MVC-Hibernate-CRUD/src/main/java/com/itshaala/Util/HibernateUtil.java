package com.itshaala.Util;

import lombok.Getter;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
   @Getter
   private static SessionFactory sessionFactory;
   static {
      Configuration configuration = new Configuration();
      configuration.configure("Hibernate.cfg.xml");
      sessionFactory = configuration.buildSessionFactory();
   }
}

