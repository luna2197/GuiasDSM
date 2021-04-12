package laonia.luna.salarios;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Salarios extends AppCompatActivity {

    private TextView nombre, horas, afp_, isss_, renta_, salarion_, salariob_;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salarios);
        nombre = (TextView) findViewById(R.id.txtNombre);
        horas= (TextView) findViewById(R.id.txtHoras);
        salariob_ = (TextView) findViewById(R.id.txtSalariob);
        afp_ = (TextView) findViewById(R.id.txtAfp);
        isss_ = (TextView) findViewById(R.id.txtIsss);
        renta_ = (TextView) findViewById(R.id.txtRenta);
        salarion_ = (TextView) findViewById(R.id.txtSalarion);

        Bundle bundle = getIntent().getExtras();
        String nom = bundle.getString("txt_nombre");
        String hr = bundle.getString("txt_salario");

        double hrs = Double.parseDouble(hr);

        double salariob=0, afp=0, isss=0, renta=0, salarion=0;
        salariob = hrs * 8.5;
        afp = salariob * 0.03;
        isss = salariob * 0.02;
        renta = salariob * 0.04;
        salarion = salariob - afp - isss - renta;

        String sb = String.valueOf(salariob);
        String a = String.valueOf(afp);
        String i = String.valueOf(isss);
        String r = String.valueOf(renta);
        String sn = String.valueOf(salarion);
        nombre.setText(nom);
        horas.setText(hr);
        salariob_.setText(sb);
        afp_.setText(a);
        isss_.setText(i);
        renta_.setText(r);
        salarion_.setText(sn);

    }

    public  void finalizar(View view){ finish();}
}