package com.example.gestiondesetudiants;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class AffichageActivity extends AppCompatActivity {

    ImageView img;
    String aff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_affichage);
        Intent affich=getIntent();
        aff=affich.getExtras().getString("Affichage");
        img= findViewById(R.id.imageView2);
        switch(aff){
            case "sig1":
                img.setImageResource(R.drawable.sig1);
                break;
            case "sig2":
                img.setImageResource(R.drawable.sig2);
                break;
            case "sig3":
                img.setImageResource(R.drawable.sig3);
                break;
            case "is1":
                img.setImageResource(R.drawable.is1);
                break;
            case "is2":
                img.setImageResource(R.drawable.is2);
                break;
            case "ma1":
                img.setImageResource(R.drawable.ma1);
                break;
            case "ma2":
                img.setImageResource(R.drawable.ma2);
                break;
            case "ma3":
                img.setImageResource(R.drawable.ma3);
                break;
            case "ma4":
                img.setImageResource(R.drawable.ma4);
                break;
            case "in1":
                img.setImageResource(R.drawable.in1);
                break;
            case "in2":
                img.setImageResource(R.drawable.in2);
                break;
            case "in3":
                img.setImageResource(R.drawable.in3);
                break;
            case "in4":
                img.setImageResource(R.drawable.in4);
                break;
            case "mi1":
                img.setImageResource(R.drawable.mi1);
                break;
            case "mi2":
                img.setImageResource(R.drawable.mi2);
                break;
            case "mi3":
                img.setImageResource(R.drawable.mi3);
                break;
            case "mi4":
                img.setImageResource(R.drawable.mi4);
                break;
            case "me1":
                img.setImageResource(R.drawable.me1);
                break;
            case "me2":
                img.setImageResource(R.drawable.me2);
                break;
        }
    }
}
