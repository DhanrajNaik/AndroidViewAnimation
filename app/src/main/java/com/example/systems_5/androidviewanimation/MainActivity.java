package com.example.systems_5.androidviewanimation;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;


public class MainActivity extends ActionBarActivity {

    Spinner sp1;
    ImageView img1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp1 = (Spinner) findViewById(R.id.spinner1);
        img1= (ImageView) findViewById(R.id.image1);

        sp1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                //alpha animation
                if(position==0){

                    Animation an = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.alpha);
                    img1.startAnimation(an);

                }
                //rotate animation
                else if(position==1){

                    Animation an = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
                    img1.startAnimation(an);

                }
                //translate animation
                else if(position==2){

                    Animation an = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.translate);
                    img1.startAnimation(an);

                }
                //scale translation
                else if(position == 3){

                    Animation an = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.scale);
                    img1.startAnimation(an);

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }


}
