package udb.guias.guia04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class segundaActividad extends AppCompatActivity {

    private TextView nombre, edad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_actividad);
        nombre = (TextView) findViewById(R.id.textView);
        edad= (TextView) findViewById(R.id.textView2);

        Bundle bundle = getIntent().getExtras();
        String nom = bundle.getString("txt_nombre");
        String ed = bundle.getString("txt_edad");

        nombre.setText(nom);
        edad.setText(ed);
    }

    public  void finalizar(View view){ finish();}
}