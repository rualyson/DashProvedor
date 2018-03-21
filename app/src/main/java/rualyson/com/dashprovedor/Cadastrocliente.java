package rualyson.com.dashprovedor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class Cadastrocliente extends AppCompatActivity {

    EditText cpf, nome;
    Button btConfirm, btCancel;

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

        final DBProvedor dbProvedor = new DBProvedor(this);
        cpf = (EditText)findViewById(R.id.edCpf);

        btConfirm = (Button)findViewById(R.id.bt_Confirmar);
        btConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String CPF = cpf.getText().toString();

                if (CPF.equals("")) {
                    Toast.makeText(Cadastrocliente.this, "CPF não inserido, tente novamente", Toast.LENGTH_SHORT).show();
                } else {

                    long res = dbProvedor.CriarCliente(CPF);
                    if (res > 0) {
                        Toast.makeText(Cadastrocliente.this, "Registrado", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(Cadastrocliente.this, "Registro incorreto, tente novamente", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

    }
}


