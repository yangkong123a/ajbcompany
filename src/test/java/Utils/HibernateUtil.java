package Utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author HeYi
 * @Description:
 * @date 2019/7/24 16:23
 */
public final class HibernateUtil {

    private static SessionFactory sessionFactory;

    private HibernateUtil(){
    }
    static{
        Configuration cfg = new Configuration();
        cfg.configure();
        sessionFactory = cfg.buildSessionFactory();
    }

    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
    public static Session getSession(){
        return sessionFactory.openSession();
    }

}
