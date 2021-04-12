package udb.guias.guia04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText nombre, edad;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombre= (EditText) findViewById(R.id.txt_nombre);
        edad =  (EditText) findViewById(R.id.txt_edad);

    }

    public void segundaActividad (View view){
        Intent i = new Intent(this, segundaActividad.class);
        i.putExtra("txt_nombre", nombre.getText().toString());
        i.putExtra("txt_edad", edad.getText().toString());
        startActivity(i);
    }
}