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

public class EmploieActivity extends AppCompatActivity {

    Button bt_afficher;
    Spinner sp_niv2;
    Spinner sp_spec2;
    Spinner sp_sem2;
    Spinner sp_groupe;
    Intent int_aff = new Intent(EmploieActivity.this,AffichageActivity.class);
    String aff;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emploie);

        sp_niv2 = findViewById(R.id.sp_niv2);
        sp_spec2 = findViewById(R.id.sp_spec2);
        sp_sem2 = findViewById(R.id.sp_sem2);
        sp_groupe = findViewById(R.id.sp_groupe);

        ArrayAdapter<CharSequence> adNiv =ArrayAdapter.createFromResource(getApplicationContext(),R.array.niveaux,android.R.layout.simple_spinner_item);
        adNiv.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp_niv2.setAdapter(adNiv);
        sp_niv2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
               switch (position){
                   case 0:
                       ArrayAdapter<CharSequence> adSpecl1 =ArrayAdapter.createFromResource(getApplicationContext(),R.array.specl1,android.R.layout.simple_spinner_item);
                       adSpecl1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                       sp_spec2.setAdapter(adSpecl1);

                       sp_spec2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                           @Override
                           public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                               ArrayAdapter<CharSequence> adSeml1 =ArrayAdapter.createFromResource(getApplicationContext(),R.array.seml1,android.R.layout.simple_spinner_item);
                               adSeml1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                               sp_sem2.setAdapter(adSeml1);
                               sp_sem2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                   @Override
                                   public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                       ArrayAdapter<CharSequence> adGrp =ArrayAdapter.createFromResource(getApplicationContext(),R.array.groupe4,android.R.layout.simple_spinner_item);
                                       adGrp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                       sp_groupe.setAdapter(adGrp);
                                       sp_groupe.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                           @Override
                                           public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                               switch (position){
                                                   case 0:
                                                       aff="mi1";
                                                       break;
                                                   case 1:
                                                       aff="mi2";
                                                       break;
                                                   case 2:
                                                       aff="mi3";
                                                       break;
                                                   case 3 :
                                                       aff="mi4";
                                                       break;
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
                           }

                           @Override
                           public void onNothingSelected(AdapterView<?> parent) {

                           }
                       });

                       //Toast.makeText(EmploieActivity.this, "L1", Toast.LENGTH_SHORT).show();
                       break;
                   case 1:
                       ArrayAdapter<CharSequence> adSpecl2 =ArrayAdapter.createFromResource(getApplicationContext(),R.array.specl2,android.R.layout.simple_spinner_item);
                       adSpecl2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                       sp_spec2.setAdapter(adSpecl2);

                       sp_spec2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                           @Override
                           public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                               switch (position){
                                   case 0:
                                       ArrayAdapter<CharSequence> adSeml2 =ArrayAdapter.createFromResource(getApplicationContext(),R.array.seml2,android.R.layout.simple_spinner_item);
                                       adSeml2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                       sp_sem2.setAdapter(adSeml2);
                                       sp_sem2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                           @Override
                                           public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                               ArrayAdapter<CharSequence> adGrp =ArrayAdapter.createFromResource(getApplicationContext(),R.array.groupe4,android.R.layout.simple_spinner_item);
                                               adGrp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                               sp_groupe.setAdapter(adGrp);
                                               sp_groupe.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                   @Override
                                                   public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                                       switch (position){
                                                           case 0:
                                                               aff="in1";
                                                               break;
                                                           case 1:
                                                               aff="in2";
                                                               break;
                                                           case 2:
                                                               aff="in3";
                                                               break;
                                                           case 3 :
                                                               aff="in4";
                                                               break;
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
                                       break;
                                   case 1:
                                       ArrayAdapter<CharSequence> adSeml22 =ArrayAdapter.createFromResource(getApplicationContext(),R.array.seml2,android.R.layout.simple_spinner_item);
                                       adSeml22.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                       sp_sem2.setAdapter(adSeml22);
                                       sp_sem2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                           @Override
                                           public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                               ArrayAdapter<CharSequence> adGrp =ArrayAdapter.createFromResource(getApplicationContext(),R.array.groupe4,android.R.layout.simple_spinner_item);
                                               adGrp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                               sp_groupe.setAdapter(adGrp);
                                               sp_groupe.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                   @Override
                                                   public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                                       switch (position){
                                                           case 0:
                                                               aff="ma1";
                                                               break;
                                                           case 1:
                                                               aff="ma2";
                                                               break;
                                                           case 2:
                                                               aff="ma3";
                                                               break;
                                                           case 3 :
                                                               aff="ma4";
                                                               break;
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
                                       break;
                               }

                           }

                           @Override
                           public void onNothingSelected(AdapterView<?> parent) {

                           }
                       });

                       //Toast.makeText(EmploieActivity.this, "L2", Toast.LENGTH_SHORT).show();

                       break;
                   case 2:
                       ArrayAdapter<CharSequence> adSpecl3 =ArrayAdapter.createFromResource(getApplicationContext(),R.array.specl3,android.R.layout.simple_spinner_item);
                       adSpecl3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                       sp_spec2.setAdapter(adSpecl3);

                       sp_spec2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                           @Override
                           public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                               switch (position){
                                   case 0:
                                       ArrayAdapter<CharSequence> adSeml3 =ArrayAdapter.createFromResource(getApplicationContext(),R.array.seml3,android.R.layout.simple_spinner_item);
                                       adSeml3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                       sp_sem2.setAdapter(adSeml3);
                                       sp_sem2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                           @Override
                                           public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                               ArrayAdapter<CharSequence> adGrp =ArrayAdapter.createFromResource(getApplicationContext(),R.array.groupe3,android.R.layout.simple_spinner_item);
                                               adGrp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                               sp_groupe.setAdapter(adGrp);
                                               sp_groupe.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                   @Override
                                                   public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                                       switch (position){
                                                           case 0:
                                                               aff="sig1";
                                                               break;
                                                           case 1:
                                                               aff="sig2";
                                                               break;
                                                           case 2:
                                                               aff="sig3";
                                                               break;
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
                                       break;
                                   case 1:
                                       ArrayAdapter<CharSequence> adSeml32 =ArrayAdapter.createFromResource(getApplicationContext(),R.array.seml3,android.R.layout.simple_spinner_item);
                                       adSeml32.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                       sp_sem2.setAdapter(adSeml32);
                                       sp_sem2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                           @Override
                                           public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                               ArrayAdapter<CharSequence> adGrp =ArrayAdapter.createFromResource(getApplicationContext(),R.array.groupe2,android.R.layout.simple_spinner_item);
                                               adGrp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                               sp_groupe.setAdapter(adGrp);
                                               sp_groupe.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                   @Override
                                                   public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                                       switch (position){
                                                           case 0:
                                                               aff="is1";
                                                               break;
                                                           case 1:
                                                               aff="is2";
                                                               break;
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
                                       break;
                                   case 2:
                                       ArrayAdapter<CharSequence> adSeml33 =ArrayAdapter.createFromResource(getApplicationContext(),R.array.seml3,android.R.layout.simple_spinner_item);
                                       adSeml33.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                       sp_sem2.setAdapter(adSeml33);
                                       sp_sem2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                           @Override
                                           public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                               ArrayAdapter<CharSequence> adGrp =ArrayAdapter.createFromResource(getApplicationContext(),R.array.groupe2,android.R.layout.simple_spinner_item);
                                               adGrp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                               sp_groupe.setAdapter(adGrp);
                                               sp_groupe.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                   @Override
                                                   public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                                       switch (position){
                                                           case 0:
                                                               aff="me1";
                                                               break;
                                                           case 1:
                                                               aff="me2";
                                                               break;

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
                                       break;
                               }
                           }

                           @Override
                           public void onNothingSelected(AdapterView<?> parent) {

                           }
                       });

                       //Toast.makeText(EmploieActivity.this, "L3", Toast.LENGTH_SHORT).show();
                       break;
               }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        bt_afficher = findViewById(R.id.bt_afficher);
        bt_afficher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent2= new Intent(EmploieActivity.this,AffichageActivity.class);
                intent2.putExtra("Affichage",aff);
                startActivity(intent2);

            }
        });
    }
}

