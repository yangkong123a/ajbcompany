package configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ActiveProfiles;
import testPackage.TestBean;
import testPackage.TestInterface;

/**
 * @author HeYi
 * @version V2.0
 * @Description: CD播放器配置
 * @date 2019/6/25 10:24
 */
@Configuration
//@ComponentScan(value = {"testPackage"})
public class CDplayerConfig {

    /*@Bean
    public CompactDisk stgpeppers(){
        return new Stgpeppers();
    }

    @Bean
    public CDPlayer cdPlayer(){
        return new CDPlayer(stgpeppers());
    }*/

    @Bean
    public TestInterface testPrint(){
        return new TestBean();
    }
}
