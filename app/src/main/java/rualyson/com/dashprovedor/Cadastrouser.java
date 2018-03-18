package rualyson.com.dashprovedor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Cadastrouser extends AppCompatActivity {
    EditText ed_nome, ed_cpf, ed_email, ed_user, ed_senha;
    Button bt_conf,  bt_cancel;

    DBProvedor db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrouser);

        db = new DBProvedor(this);

        ed_nome = (EditText) findViewById(R.id.edNome);
        ed_cpf = (EditText) findViewById(R.id.edCPF);
        ed_email = (EditText) findViewById(R.id.edEmail);
        ed_user = (EditText) findViewById(R.id.edUsuario);
        ed_senha = (EditText) findViewById(R.id.edPass);

        bt_conf = (Button) findViewById(R.id.btConfirmar);

        bt_conf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = ed_user.getText().toString();
                String password = ed_senha.getText().toString();

                if (username.equals("")) {
                    Toast.makeText(Cadastrouser.this, "Usuário não inserido, tente novamente", Toast.LENGTH_SHORT).show();
                } else if (password.equals("")) {
                    Toast.makeText(Cadastrouser.this, "Deve preencher o campo senha", Toast.LENGTH_SHORT).show();
                } else {

                    long res = db.CriarUtilizador(username, password);
                    if (res > 0) {
                        Toast.makeText(Cadastrouser.this, "Registrado", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(Cadastrouser.this, "Registro incorret, tente novamente", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
    }