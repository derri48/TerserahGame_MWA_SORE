package com.example.asus.terserahgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;

public class anim_main extends AppCompatActivity {
    private static int splashInterval = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anim_main);

        new Handler().postDelayed(new Runnable() {


            @Override
            public void run() {
                Intent i = new Intent(anim_main.this, MainActivity.class);
                startActivity(i); 
                this.finish();
            }

            private void finish() {
            }
        }, splashInterval);

    };

}

