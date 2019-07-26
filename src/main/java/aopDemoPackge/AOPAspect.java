package aopDemoPackge;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author HeYi
 * @version V2.0
 * @Description:
 * @date 2019/7/1 11:32
 */
@Aspect
@Component
public class AOPAspect {
    /**
     * 第一种方式 通知和切点同时定义
     */
    /*@Before("execution(* aopDemoPackge.AOPDemo.print(..))")
    public void functionLog(){
        System.out.println("AOPDemo.print()方法即将执行！");
    }*/

    /**
     * 第二种方式
     */
    @Pointcut("execution(* aopDemoPackge.AOPDemo.print(..))")
    public void functionLogPointcut(){

    }
    @Before("functionLogPointcut())")
    public void functionLog(){
        System.out.println("AOPDemo.print()方法即将执行！");
    }

    /**
     * 第三种方式：注解
     */
    @Around("@annotation(ms)")
    public void functionLogOnAnnotation(ProceedingJoinPoint jp, AnnotationDemo ms){
        String value = ms.value();
        try {
            System.out.println("AOPDemoOnAnnotation.print()方法即将执行！  注解传入值为："
                    + value + "  方法名称：" + jp.getSignature().getName());
            jp.proceed();
            System.out.println("AOPDemoOnAnnotation.print()方法执行成功 by @Around！");
        }catch (Throwable throwable){
            System.out.println(throwable.getMessage());
        }
    }
}
