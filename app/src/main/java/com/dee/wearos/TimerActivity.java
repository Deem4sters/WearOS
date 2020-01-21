package com.dee.wearos;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.wearable.activity.WearableActivity;
import android.widget.TextView;

public class TimerActivity extends WearableActivity {

    private TextView TextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer);

        TextView = (TextView) findViewById(R.id.Textview);


        // Enables Always-on
        setAmbientEnabled();
        new CountDownTimer(30000,1000){
            @Override
            public void onTick(long millisUntilFinished) {
                TextView.setText("Seconds Remaining :" +millisUntilFinished/1000);
            }

            @Override
            public void onFinish() {
                TextView.setText("Done");

            }
        }.start();
    }
}
