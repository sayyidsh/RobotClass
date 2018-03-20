package pro.nanosystems.robotclass;

import android.content.Context;

/**
 * Created by sayyid on 19/03/2018.
 */

public class Robot {
    private final String name;
    Context context;

    public String getName() {
        return name;
    }

    public Robot(Context context, String name) {
        this.name = name;
        this.context = context;
    }
}
