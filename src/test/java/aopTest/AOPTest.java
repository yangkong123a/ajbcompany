package aopTest;

import aopDemoPackge.AOPDemoInterface;
import aopDemoPackge.AOPDemoOnAnnotation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author HeYi
 * @version V2.0
 * @Description:
 * @date 2019/7/1 13:48
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class AOPTest {

    @Autowired
    @Qualifier("aopDemo")
    AOPDemoInterface aopDemo;
    @Autowired
    @Qualifier("aopDemoOnAnnotation")
    AOPDemoInterface aopDemoOnAnnotation;

    @Test
    public void aopTest(){
        aopDemo.print();
    }

    @Test
    public void aopTestOnAnotation(){
        aopDemoOnAnnotation.print();
    }

    @Test
    public  void test(){
        System.out.println("yangkong xixi");
    }
}
