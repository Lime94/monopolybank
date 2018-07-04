package monopolybankir.com.monopolybank.activities;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.animation.DynamicAnimation;
import android.support.animation.FlingAnimation;
import android.support.animation.FloatPropertyCompat;
import android.support.animation.SpringAnimation;
import android.support.animation.SpringForce;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import monopolybankir.com.monopolybank.MainActivity;
import monopolybankir.com.monopolybank.R;

public class SplashScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
    }

    @Override
    protected void onResume() {
        super.onResume();
        ImageView bones = findViewById(R.id.monopolylogo);


        FlingAnimation flingAnimation = new FlingAnimation(bones, DynamicAnimation.Y);

        flingAnimation.setStartVelocity(2800f);
        flingAnimation.setFriction(0.8f);
        flingAnimation.start();

        flingAnimation.addEndListener(new DynamicAnimation.OnAnimationEndListener() {
            @Override
            public void onAnimationEnd(DynamicAnimation animation, boolean canceled, float value, float velocity) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        startActivity(new Intent(SplashScreen.this, MainActivity.class));
                    }
                },2000);

            }
        });
    }
}
