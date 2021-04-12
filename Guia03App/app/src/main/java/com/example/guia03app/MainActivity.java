package com.example.guia03app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView contador;
    private Button aumentar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getLifecycle().addObserver(new MyLifeCycleObserver());
        setContentView(R.layout.activity_main);
        contador = (TextView) findViewById(R.id.txt_cont);

    }

    public void sumar(View view) {
        String valor = contador.getText().toString();
        int actual = Integer.parseInt(valor);
        int cont = 0;
        String total;

        if(actual == 9) {
            total = String.valueOf(cont);
        } else {
            cont = actual + 1;
            total = String.valueOf(cont);
        }

            contador.setText(total);
    }
}