package pro.nanosystems.robotclass;

import android.content.Context;
import android.media.MediaPlayer;

/**
 * Created by sayyid on 19/03/2018.
 */

public class RobotSound extends Robot {
    MediaPlayer mp;
    public RobotSound(Context context, String name) {
        super(context, name);
        //playSound();
    }
    public void playSound(int soundId, boolean isLoop){
        try{
            mp = MediaPlayer.create(context, soundId);
            mp.setLooping(isLoop);
            if (mp.isPlaying()){
                mp.stop();
                mp.release();
                mp = MediaPlayer.create(context, soundId);
            }
            mp.start();

        }catch ( Exception e){
            e.printStackTrace();
        }
    }

    public void  stopSound(){
        if (mp.isPlaying()){
            mp.stop();
            mp.release();
        }
    }
}
