package soundSystemTest;

import configuration.CDplayerConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import soundSystem.CDPlayer;
import soundSystem.CompactDisk;
import testPackage.TestInterface;

/**
 * @author HeYi
 * @version V2.0
 * @Description:
 * @date 2019/6/25 10:18
 */
@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = CDplayerConfig.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
@ActiveProfiles("testProfile")
public class CDplayerTest {

    @Autowired
    private CompactDisk cd;
    @Autowired
    private CDPlayer cdPlayer;
    @Autowired
    private TestInterface testPrint;

    @Test
    public void playCD() {
        cd.play();
    }

    @Test
    public void cdPlayerPlayCD(){
        cdPlayer.play();
    }

    @Test
    public void print(){
        testPrint.outPrint("输出测试");
    }
}