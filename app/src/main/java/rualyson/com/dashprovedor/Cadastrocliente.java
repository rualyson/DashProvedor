package rualyson.com.dashprovedor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Cadastrocliente extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrocliente);
        Spinner dropdown = findViewById(R.id.edRoteador);
        String[] itens = new String[]{"Selecione", "Próprio", "Comodato"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, itens);
        dropdown.setAdapter(adapter);

        Spinner dropdwn = findViewById(R.id.edPlano);
        String[] item = new String[]{"Selecione", "6 Megas", "10 Megas", "15 Megas", "20 Megas", "30 Megas", "50 Megas"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, item);
        dropdwn.setAdapter(adapter1);

    }
}


