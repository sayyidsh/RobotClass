package pro.nanosystems.robotclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   TextView name;
   Button idleBtn, walkBtn, runBtn;
   ImageView photo;
   RobotWalk robot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.name);
        idleBtn = findViewById(R.id.idleBtn);
        photo = findViewById(R.id.photo);
        robot = new RobotWalk(this, "Nano101", photo);
       name.setText(robot.getName());
       photo.setImageResource(R.drawable.idle_000);
       robot.playSound(R.raw.time, true);
       idleBtn.setOnClickListener(v -> {
           robot.idle();
       });
       walkBtn = findViewById(R.id.walkBtn);
       walkBtn.setOnClickListener(v ->{
           robot.walk();
       });
       runBtn = findViewById(R.id.runBtn);
       runBtn.setOnClickListener(v ->{
           robot.running();
       });
    }
}
