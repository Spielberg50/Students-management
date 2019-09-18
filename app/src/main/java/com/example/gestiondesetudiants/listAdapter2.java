package com.example.gestiondesetudiants;

import android.content.Context;
import android.renderscript.Sampler;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.util.ArrayList;


public class listAdapter2 extends ArrayAdapter<Module> implements View.OnClickListener {


    private ArrayList<Module> dataSet;
    Context mContext;

    @Override
    public void onClick(View view) {

    }

    private static class ViewHolder {
        TextView nom;
        TextView moyenne;
        EditText td;
        EditText tp;
        EditText examen;
        TextView moyenne_general;



    }

    public listAdapter2 (ArrayList<Module> data, Context context) {
        super(context, R.layout.activity_moyenne, data);
        this.dataSet = data;
        this.mContext = context;


    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Module module = getItem(position);
        final ViewHolder viewHolder;

        final View result;


        if (convertView == null) {

            viewHolder = new ViewHolder();

            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.activity_costum_listview, parent, false);
            viewHolder.nom = (TextView) convertView.findViewById(R.id.nom);
            viewHolder.moyenne = (TextView) convertView.findViewById(R.id.moy);
            viewHolder.moyenne_general = (TextView) convertView.findViewById(R.id.moy_gen);
            viewHolder.examen = (EditText) convertView.findViewById(R.id.exam);
            viewHolder.td = (EditText) convertView.findViewById(R.id.td);
            viewHolder.tp = (EditText) convertView.findViewById(R.id.tp);
            result = convertView;


            convertView.setTag(viewHolder);


            viewHolder.nom.setText(dataSet.get(position).getIntitulé());



        } else {
            viewHolder = (ViewHolder) convertView.getTag();
            result=convertView;
        }



        viewHolder.moyenne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moy(viewHolder);

            }
        });
        return convertView;
    }


    public void moy(ViewHolder viewHolder){

        Float tp=Float.valueOf(0);
        Float td=Float.valueOf(0);
        Float examen=Float.valueOf(0);
        Float coef=Float.valueOf(0);
        Double m_g=Double.valueOf(0);


        tp= Float.valueOf(viewHolder.tp.getText().toString()) ;
        td= Float.valueOf(viewHolder.tp.getText().toString()) ;
        examen= Float.valueOf(viewHolder.tp.getText().toString()) ;


        final String moyenne_module =(((tp+td)/2)*0.33+examen*0.66)+"";

        m_g =(m_g + (((tp+td)/2)*0.33+examen*0.66)*coef);
        String moyenneall = m_g+"";




        Toast.makeText(getContext(), moyenne_module, Toast.LENGTH_LONG).show();

       viewHolder.moyenne.setText(moyenne_module);
        //viewHolder.moyenne_general.setText(moyenneall);

        /*if(tp!=null && td!=null  && examen!=null  )
                viewHolder.moyenne.setText(moyenne_module);
            else
                Toast.makeText(getContext(), "un des champs est vide ", Toast.LENGTH_LONG).show();*/

    }


}
