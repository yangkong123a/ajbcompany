package aopDemoPackge;

import org.springframework.stereotype.Component;

/**
 * @author HeYi
 * @version V2.0
 * @Description:
 * @date 2019/7/1 15:00
 */
@Component("aopDemoOnAnnotation")
public class AOPDemoOnAnnotation implements AOPDemoInterface {

    @Override
    @AnnotationDemo("注解消息")
    public void print(){
        System.out.println("AOPDemoOnAnnotation.print()方法执行成功！");
    }
}
