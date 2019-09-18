package com.example.gestiondesetudiants;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    Button bt_apropos;
    Button bt_calc;
    Button bt_emploie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        bt_apropos=findViewById(R.id.bt_apropos);
        bt_apropos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this,AboutActivity.class));
            }
        });

        bt_calc=findViewById(R.id.bt_calc);
        bt_calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this,CalculeActivity.class));
            }
        });

        bt_emploie = findViewById(R.id.bt_emploi);
        bt_emploie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2= new Intent(HomeActivity.this,EmploieActivity.class);
                startActivity(intent2);

            }
        });
    }
}
