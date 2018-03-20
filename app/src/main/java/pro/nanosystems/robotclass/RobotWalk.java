package pro.nanosystems.robotclass;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.widget.ImageView;

/**
 * Created by sayyid on 19/03/2018.
 */

public class RobotWalk extends RobotAnime {
    public RobotWalk(Context context, String name, ImageView photo) {
        super(context, name, photo);
    }
    public void walk(){
    photo.setImageResource(R.drawable.walk);
    stopSound();
        ((AnimationDrawable) photo.getDrawable()).start();
        playSound(R.raw.robot, true);
    }
    public void running(){
        photo.setImageResource(R.drawable.running);
        stopSound();
        ((AnimationDrawable) photo.getDrawable()).start();
        playSound(R.raw.runrobot, true);
    }
}
