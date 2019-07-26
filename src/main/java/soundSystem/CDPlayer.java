package soundSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author HeYi
 * @version V2.0
 * @Description:
 * @date 2019/6/25 11:45
 */
//@Component
public class CDPlayer implements MediaPlayer {

    private CompactDisk cd;

    //@Autowired
    public CDPlayer(CompactDisk cd){
        this.cd = cd;
    }

    @Override
    public void play() {
        cd.play();
    }
}
