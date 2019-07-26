package aopDemoPackge;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author HeYi
 * @version V2.0
 * @Description:
 * @date 2019/7/1 14:53
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AnnotationDemo {
    String value() default "自定义注解";
}
