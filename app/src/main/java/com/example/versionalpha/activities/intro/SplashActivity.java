package com.example.versionalpha.activities.intro;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.versionalpha.activities.auth.LoginActivity;
import com.example.versionalpha.R;

public class SplashActivity extends AppCompatActivity {
    private ImageView iv, logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        iv = (ImageView) findViewById(R.id.iv);
        logo = (ImageView) findViewById(R.id.logo);
        Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.transition);
        iv.startAnimation(myAnim);
        logo.startAnimation(myAnim);
        final Intent i = new Intent(this, LoginActivity.class);
        Thread timer = new Thread() {
            public void run() {
                try {
                    sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    startActivity(i);
                    finish();
                }
            }
        };
        timer.start();
    }
}
