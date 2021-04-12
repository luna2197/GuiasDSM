package laonia.luna.salarios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText nombre, horas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombre =(EditText) findViewById(R.id.txt_horas);
        horas = (EditText) findViewById(R.id.txt_horas);
    }
    public void Salarios(View view){
        Intent i =new Intent(this, Salarios.class);
        i.putExtra("txt_nombre", nombre.getText().toString());
        i.putExtra("txt_horas", horas.getText().toString());
        startActivity(i);

    }
}