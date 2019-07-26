package testPackage;

import org.springframework.stereotype.Component;

/**
 * @author HeYi
 * @version V2.0
 * @Description:
 * @date 2019/6/25 16:32
 */
@Component
public class TestBean implements TestInterface {
    @Override
    public void outPrint(String s) {
        System.out.println(s);
    }
}
