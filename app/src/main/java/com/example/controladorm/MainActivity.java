package com.example.controladorm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public int contador;
    Button dddd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dddd = findViewById()
        contador = 0;
        mostrarResultado();
    }

    public void mostrarResultado()
    {
        TextView resultado = (TextView)findViewById(R.id.txtNumero);
        resultado.setText(String.valueOf(contador));
    }

    public void Incrementar(View view) {
        contador++;
        mostrarResultado();
    }


    public void Decremento(View view) {
        contador--;
        mostrarResultado();
    }

    public void reset(View view) {
        contador=0;
        mostrarResultado();
    }
}