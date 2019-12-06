package com.mau.mauricio_andrango_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class resumen extends AppCompatActivity {

    TextView edConectado,edSolicitado,txtConectado,txtSolicitado,txtEducacion,edEducacion,txtDep,chR1,chR2,chR3,rd1,rd2;
    Bundle dato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumen);

        edConectado=(TextView) findViewById(R.id.edConectado);
        edSolicitado=(TextView) findViewById(R.id.edSolicitado);
        txtSolicitado=(TextView) findViewById(R.id.txtSolicitado);
        txtConectado=(TextView) findViewById(R.id.txtConectado);
        txtEducacion=(TextView) findViewById(R.id.txtEducacion);


        edEducacion=(TextView) findViewById(R.id.edEducacion);
        txtDep=(TextView) findViewById(R.id.txtDep);
        chR1=(TextView) findViewById(R.id.chR1);
        chR2=(TextView) findViewById(R.id.chR2);
        chR3=(TextView) findViewById(R.id.chR3);


        rd1=(TextView) findViewById(R.id.rd1);
        rd2=(TextView) findViewById(R.id.rd2);


        dato=getIntent().getExtras();



        String valorR=dato.getString("Nombre");
        String valorR1=dato.getString("Perfil");
        String valorR2=dato.getString("Respuesta1");
        String valorR3=dato.getString("valorEnviado");
        String valorR4=dato.getString("valorEnviado1");
        String valorR5=dato.getString("valorEnviado2");
        String valorR6=dato.getString("valorEnviado3");
        String valorR7=dato.getString("valorEnviado4");


        edConectado.setText(valorR);
        edSolicitado.setText(valorR1);
        edEducacion.setText(valorR2);
        chR1.setText(valorR3);
        chR2.setText(valorR4);
        chR3.setText(valorR5);
        rd1.setText(valorR6);
        rd2.setText(valorR7);
    }
    }

