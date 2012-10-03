package com.keanteam.cemetaryworking;

import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;
import android.view.animation.Animation;

    public class SplashActivity extends Activity {
    private static final int SPLASH_DISPLAY_TIME = 4000; // splash screen delay time

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        new Handler().postDelayed(new Runnable() {
            public void run() {

                Intent intent = new Intent();
                intent.setClass(SplashActivity.this, HomeActivity.class);
                SplashActivity.this.startActivity(intent);
                SplashActivity.this.finish();

                // transition from splash to main menu
                overridePendingTransition(R.anim.homefadein,
                        R.anim.splashfadeout);

            }
        }, SPLASH_DISPLAY_TIME);
    }

}