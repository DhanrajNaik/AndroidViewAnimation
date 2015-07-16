package com.example.systems_5.androidviewanimation;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

/**
 * Created by System S-5 on 16-07-2015.
 */
public class TranslateAnimation extends Activity {
    Animation animation ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.translation);
        final ImageView mhajoImage = (ImageView) findViewById(R.id.myimage);
        mhajoImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.translate);
                mhajoImage.startAnimation(animation);


            }
        });


    }


}
