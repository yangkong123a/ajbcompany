package hibernate;

import Utils.HibernateUtil;
import com.ajb.study.domain.Student;
import org.hibernate.Session;
import org.junit.Test;

/**
 * @author HeYi
 * @Description:
 * @date 2019/7/24 15:48
 */
public class HibernateTest {

    //查询
    @Test
    public void test1(){
        Session session = HibernateUtil.getSession();
        Student sd = session.get(Student.class, 1l);
        System.out.println(sd.toString());
    }

}
