package com.example.gestiondesetudiants;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;


public class MoyenneActivity extends AppCompatActivity {

    ListView lv_module;
    MySqlHandler myData;

    ListViewHolder mod;
    ArrayList<Module> modulesOrdres = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moyenne);
        Intent cal=getIntent();
        showMessage("Indice !","Si le module n'a pas de tp/td mettez la meme valeur pour tout les champs et pour calculer clické sur le champ moyenne de chaque module merci !");
        myData = new MySqlHandler(this,"",null,1);
        lv_module = findViewById(R.id.lv_module);
        ArrayList<Module> modules  =myData.getAllData(cal.getExtras().getString("Niv"));




        listAdapter2 adapter=new listAdapter2(modules,getApplicationContext());
        lv_module.setAdapter(adapter);
    }



    public void showMessage(String title,String message){
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.setNeutralButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            }
        });
        builder.show();

    }
}




