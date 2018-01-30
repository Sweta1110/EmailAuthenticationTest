package com.example.swedish_sweta.myapplication2;

import android.app.Activity;
import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;


/**
 * Created by Swedish_Sweta on 1/28/2018.
 */

public class SplashScreen extends AppCompatActivity {
    private static final String TAG = "SplashScreen";

    private final int SPLASH_DISPLAY_LENGTH = 2000;

    ImageView i1;

    @Override
    public void onCreate(Bundle icicle) {
        try {

        super.onCreate(icicle);
        setContentView(R.layout.splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent mainIntent = new Intent(SplashScreen.this, LoginActivity.class);
                SplashScreen.this.startActivity(mainIntent);
                SplashScreen.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);
        i1 = (ImageView) findViewById(R.id.iv);
    }
    catch (Exception e){
        Log.e(TAG,"OnCreate_in_SplashScreen_class",e);
        throw e;
    }

}
    }


