package com.mau.mauricio_andrango_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class registro extends AppCompatActivity {

    EditText edNombre,edMonto,edPago,txtlog1;
    TextView edlog,txtNombre,txtMonto,txtPago;
    Button enviar;
    Bundle dato;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        txtNombre=(TextView)findViewById(R.id.txtNombre);
        edNombre=(EditText)findViewById(R.id.edNombre);

        txtMonto=(TextView)findViewById(R.id.txtMonto);
        edMonto=(EditText)findViewById(R.id.edMonto);

        txtPago=(TextView)findViewById(R.id.txtPago);
        edPago=(EditText)findViewById(R.id.edPago);

        edlog=(TextView)findViewById(R.id.edlog);

        dato=getIntent().getExtras();

        String valorR=dato.getString("Nombre");
        edlog.setText(valorR);
    }

    public void enviaDato (View v) {

        Toast.makeText(getApplicationContext(),"Elemento Guardao con Exito", Toast.LENGTH_SHORT). show();
        Intent abrir = new Intent(registro.this, encuesta.class);
        abrir.putExtra("Perfil", edNombre.getText().toString());
        startActivity(abrir);



    }

    public  void CalcularSeg1(View v){
        double n1=Double.parseDouble(edMonto.getText().toString());

        double rex1= 1300.0d;
        double r= 0.3d;

        int div=2;

        double suma =r-n1;
        double suma2 =suma / div;


        String resultadosuma=String.valueOf(suma2);
        edPago.setText(resultadosuma);


    }
}
