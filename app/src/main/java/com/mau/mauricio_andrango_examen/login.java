package com.mau.mauricio_andrango_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {
    EditText edUsuario,edPass;
    Button ingresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edUsuario=(EditText)findViewById(R.id.edUsuario);
        edPass=(EditText)findViewById(R.id.edPass);
        ingresar=(Button) findViewById(R.id.btnIngresar);
        ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String vUsuario=edUsuario.getText().toString();
                String vPass=edPass.getText().toString();
                if(vUsuario.equals("estudiante2019") && vPass.equals("uisrael2019")){
                    Intent intent=new Intent(getApplicationContext(),registro.class);
                    intent.putExtra("Nombre", edUsuario.getText().toString());
                    startActivity(intent);


                }
                else{
                    Toast.makeText(getApplicationContext(),"Usuario o Contraseña incorectos", Toast.LENGTH_SHORT). show();

                }
            }
        });
    }
}
