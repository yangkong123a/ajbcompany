package configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author HeYi
 * @version V2.0
 * @Description:
 * @date 2019/7/1 11:27
 */
@Configuration
//@ComponentScan("aopDemoPackge")
@EnableAspectJAutoProxy     //启动aspectJ自动代理
public class AOPTestConfig {

    /*@Bean
    public AOPAspect aopAspect(){
        return new AOPAspect();
    }*/

    /*@Bean
    public AOPDemoInterface aopDemoPackge(){
        return new AOPDemo();
    }*/
}
