package com.example.animationex_1;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{

    Button btn1,btn2,btn3,btn4,btn5,btn6;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);

        text=findViewById(R.id.animationEx);


        Animation blinkAnimation= AnimationUtils.loadAnimation(this,R.anim.blink);

        Animation transAnimation=AnimationUtils.loadAnimation(this,R.anim.translate);

        Animation fadeAnimation=AnimationUtils.loadAnimation(this,R.anim.fade);

        Animation zoomAnimation=AnimationUtils.loadAnimation(this,R.anim.zoom);

        Animation rotateAnimation=AnimationUtils.loadAnimation(this,R.anim.rotate);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.startAnimation(blinkAnimation);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.startAnimation(transAnimation);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.startAnimation(zoomAnimation);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.startAnimation(fadeAnimation);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.startAnimation(rotateAnimation);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.clearAnimation();
            }
        });
    }
}
