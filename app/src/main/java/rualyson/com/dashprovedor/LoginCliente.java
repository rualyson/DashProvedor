package rualyson.com.dashprovedor;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by @julianacnascimento on march/18.
 */

public class LoginCliente extends AppCompatActivity {

    Button entrar;
    EditText cpf;

    DBProvedor dbcliente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logincliente);

        dbcliente = new DBProvedor(this);

        cpf = (EditText)findViewById(R.id.CPF_Func);
        entrar = (Button) findViewById(R.id.edEntrar);

        entrar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String CPF = cpf.getText().toString();

                if (CPF.equals("")){

                    Toast.makeText(LoginCliente.this, "CPF não inserido", Toast.LENGTH_SHORT).show();

                } else {

                    String res = dbcliente.validaCPF(CPF);

                    if (res.equals("OK")){
                        Toast.makeText(LoginCliente.this, "Logado", Toast.LENGTH_SHORT).show();
                        Intent it = new Intent(LoginCliente.this, DashCliente.class);
                        startActivity(it);
                    } else {
                        Toast.makeText(LoginCliente.this, "CPF incorreto, tente novamente", Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });
}
}