package soundSystem;

import org.springframework.stereotype.Component;

/**
 * @author HeYi
 * @version V2.0
 * @Description: CD实现（光盘中的歌曲）
 * @date 2019/6/25 9:53
 */
@Component
public class Stgpeppers implements CompactDisk {

    private String title = "Stg.my voice";
    private String artist = "DeHua Liu";

    @Override
    public void play(){
        System.out.println("playing " + title + " by " + artist);
    }

    public void setTitle(String title){
        this.title = title;
    }
}
