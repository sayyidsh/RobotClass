package pro.nanosystems.robotclass;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.widget.ImageView;

/**
 * Created by sayyid on 19/03/2018.
 */

public class RobotAnime extends RobotSound {
     ImageView photo;
    public RobotAnime(Context context, String name, ImageView photo) {
        super(context, name);
        this.photo = photo;
    }
    public void idle (){
        photo.setImageResource(R.drawable.idle);
         stopSound();
        ((AnimationDrawable) photo.getDrawable()).start();
        playSound(R.raw.ready_to_go, true);
    }
}
