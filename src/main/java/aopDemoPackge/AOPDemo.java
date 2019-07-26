package aopDemoPackge;

import org.springframework.stereotype.Component;

/**
 * @author HeYi
 * @version V2.0
 * @Description:
 * @date 2019/7/1 11:33
 */
@Component("aopDemo")
public class AOPDemo implements AOPDemoInterface {

    @Override
    public void print(){
        System.out.println("AOPDemo.print()方法执行成功！");
    }
}
