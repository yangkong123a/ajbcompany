import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author HeYi
 * @Description:
 * @date 2019/7/30 15:34
 */
public class MyTest {

    /**
     * List测试
     */
    @Test
            public void testArrayList(){
                List<String> al = new ArrayList<String>();
                al.add("1111");
                al.add("2222");
                al.add("3333");
                al.add("4444");
                al.add("2222");
                for (String ls : al){
            System.out.println(ls);
        }
    }
}
