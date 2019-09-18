package com.example.gestiondesetudiants;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;


public class CalculeActivity extends AppCompatActivity {

    private Button bt_next;
    Spinner sp_niv;
    Spinner sp_spec;
    Spinner sp_sem;

    String niv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcule);

        bt_next = findViewById(R.id.bt_next);
        bt_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2= new Intent(CalculeActivity.this,MoyenneActivity.class);

                intent2.putExtra("Niv", niv);
                startActivity(intent2);

            }
        });

        sp_niv = findViewById(R.id.sp_niv);
        sp_spec = findViewById(R.id.sp_spec);
        sp_sem = findViewById(R.id.sp_sem);

        ArrayAdapter<CharSequence> adNiv =ArrayAdapter.createFromResource(getApplicationContext(),R.array.niveaux,android.R.layout.simple_spinner_item);
        adNiv.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp_niv.setAdapter(adNiv);
        sp_niv.setSelection(0);
        sp_niv.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:

                        ArrayAdapter<CharSequence> adSpecl1 =ArrayAdapter.createFromResource(getApplicationContext(),R.array.specl1,android.R.layout.simple_spinner_item);
                        adSpecl1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        sp_spec.setAdapter(adSpecl1);

                        sp_spec.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                            @Override
                            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                ArrayAdapter<CharSequence> adSeml1 =ArrayAdapter.createFromResource(getApplicationContext(),R.array.seml1,android.R.layout.simple_spinner_item);
                                adSeml1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                sp_sem.setAdapter(adSeml1);
                                sp_sem.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                    @Override
                                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                        switch (position){
                                            case 0:
                                                niv="1MI1";
                                                break;
                                            case 1:
                                                niv="1MI2";
                                                //niv+="2";
                                        }
                                    }

                                    @Override
                                    public void onNothingSelected(AdapterView<?> parent) {

                                    }
                                });
                            }

                            @Override
                            public void onNothingSelected(AdapterView<?> parent) {

                            }
                        });

                        //Toast.makeText(CalculeActivity.this, "L1", Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        ArrayAdapter<CharSequence> adSpecl2 =ArrayAdapter.createFromResource(getApplicationContext(),R.array.specl2,android.R.layout.simple_spinner_item);
                        adSpecl2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        sp_spec.setAdapter(adSpecl2);



                        sp_spec.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                            @Override
                            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                switch(position){
                                    case 0:
                                        ArrayAdapter<CharSequence> adSeml2 =ArrayAdapter.createFromResource(getApplicationContext(),R.array.seml2,android.R.layout.simple_spinner_item);
                                        adSeml2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                        sp_sem.setAdapter(adSeml2);
                                        sp_sem.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                            @Override
                                            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                switch (position){
                                                    case 0:
                                                        niv="2IN3";
                                                        break;
                                                    case 1:
                                                        niv="2IN4";
                                                        break;
                                                }
                                            }

                                            @Override
                                            public void onNothingSelected(AdapterView<?> parent) {

                                            }
                                        });
                                        break;
                                    case 1:
                                        ArrayAdapter<CharSequence> adSeml2M2 =ArrayAdapter.createFromResource(getApplicationContext(),R.array.seml2,android.R.layout.simple_spinner_item);
                                        adSeml2M2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                        sp_sem.setAdapter(adSeml2M2);
                                        sp_sem.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                            @Override
                                            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                switch (position){
                                                    case 0:
                                                        niv="2MA3";
                                                        break;
                                                    case 1:
                                                        niv="2MA4";
                                                        break;
                                                }
                                            }

                                            @Override
                                            public void onNothingSelected(AdapterView<?> parent) {

                                            }
                                        });
                                        break;
                                }
                            }

                            @Override
                            public void onNothingSelected(AdapterView<?> parent) {

                            }
                        });

                        //Toast.makeText(CalculeActivity.this, "L2", Toast.LENGTH_SHORT).show();

                        break;
                    case 2:
                        ArrayAdapter<CharSequence> adSpecl3 =ArrayAdapter.createFromResource(getApplicationContext(),R.array.specl3,android.R.layout.simple_spinner_item);
                        adSpecl3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        sp_spec.setAdapter(adSpecl3);

                        sp_spec.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                            @Override
                            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                switch (position){
                                    case 0:
                                        ArrayAdapter<CharSequence> adSeml3si =ArrayAdapter.createFromResource(getApplicationContext(),R.array.seml3,android.R.layout.simple_spinner_item);
                                        adSeml3si.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                        sp_sem.setAdapter(adSeml3si);
                                        sp_sem.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                            @Override
                                            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                switch (position){
                                                    case 0:
                                                        niv="3SI5";
                                                        break;
                                                    case 1:
                                                        niv="3SI6";
                                                        break;
                                                }
                                            }

                                            @Override
                                            public void onNothingSelected(AdapterView<?> parent) {

                                            }
                                        });
                                        break;
                                    case 1:
                                        ArrayAdapter<CharSequence> adSeml3is =ArrayAdapter.createFromResource(getApplicationContext(),R.array.seml3,android.R.layout.simple_spinner_item);
                                        adSeml3is.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                        sp_sem.setAdapter(adSeml3is);
                                        sp_sem.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                            @Override
                                            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                switch (position){
                                                    case 0:
                                                        niv="3IS5";
                                                        break;
                                                    case 1:
                                                        niv="3IS6";
                                                        break;
                                                }
                                            }

                                            @Override
                                            public void onNothingSelected(AdapterView<?> parent) {

                                            }
                                        });
                                        break;
                                    case 2:
                                        ArrayAdapter<CharSequence> adSeml3ME =ArrayAdapter.createFromResource(getApplicationContext(),R.array.seml3,android.R.layout.simple_spinner_item);
                                        adSeml3ME.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                        sp_sem.setAdapter(adSeml3ME);
                                        sp_sem.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                            @Override
                                            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                switch (position){
                                                    case 0:
                                                        niv="3ME5";
                                                        break;
                                                    case 1:
                                                        niv="3ME6";
                                                        break;
                                                }
                                            }

                                            @Override
                                            public void onNothingSelected(AdapterView<?> parent) {

                                            }
                                        });
                                        break;
                                }

                            }

                            @Override
                            public void onNothingSelected(AdapterView<?> parent) {

                            }
                        });

                        //Toast.makeText(CalculeActivity.this, "L3", Toast.LENGTH_SHORT).show();
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
