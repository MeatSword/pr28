package com.example.pr_28;



import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;



public class MainActivity extends Activity {

    private Bitmap mBitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Resources res = this.getResources();

        ImageView sunImageView = findViewById(R.id.sun);

        Animation sunRiseAnimation = AnimationUtils.loadAnimation(this, R.xml.sun_rise);

        sunImageView.startAnimation(sunRiseAnimation);

        ImageView clockImageView = findViewById(R.id.clock);

        Animation clockTurnAnimation = AnimationUtils.loadAnimation(this, R.xml.clock_anim);
        clockImageView.startAnimation(clockTurnAnimation);

        ImageView hourImageView = findViewById(R.id.hour_hand);

        Animation hourTurnAnimation = AnimationUtils.loadAnimation(this, R.xml.hours_anim);

        hourImageView.startAnimation(hourTurnAnimation);
    }
}