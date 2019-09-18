package com.example.gestiondesetudiants;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import java.util.Calendar;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Element adsElement=new Element();
        adsElement.setTitle("advertice here");

        View aboutPage = new AboutPage(this)
                .isRTL(false)
                .setImage(R.drawable.logo1)
                .setDescription("L'application Gestion Des Etudiant sert à calculer les moyennes des étudiants et afficher leur emploie du temps. \n " +
                        "Réaliser par :                    \n" +
                        "SOUKEUR Seif Eddine   \n" +
                        "MEHADJBIA Abdelhak \n" +
                        "Habbou Ayoub               ")
                .addItem(new Element().setTitle("Version 1"))
                .addGroup("Contacter nous")
                .addEmail("soukeur.1998@gmail.com")
                .addFacebook("Sifou.Sailor")
                .addInstagram("sailor.fifou")
                .addItem(createCopyright())
                .create();
        setContentView(aboutPage);
    }

    private Element createCopyright(){
        Element copyright = new Element();
        final String copyrightString = String.format("Copyright %d par Spielberg", Calendar.getInstance().get(Calendar.YEAR));
        copyright.setTitle(copyrightString);
        copyright.setIcon(R.drawable.emploi);
        copyright.setGravity(Gravity.CENTER);
        copyright.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AboutActivity.this , copyrightString,Toast.LENGTH_SHORT).show();
            }
        });
        return copyright;

    }
}
