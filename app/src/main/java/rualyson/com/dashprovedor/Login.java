package rualyson.com.dashprovedor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity{
    Button entrar;
    EditText login, senha;

    DBProvedor db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        db = new DBProvedor(this);

        login = (EditText)findViewById(R.id.user);
        senha = (EditText)findViewById(R.id.pass);

        entrar = (Button) findViewById(R.id.logar);


        entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = login.getText().toString();
                String password = senha.getText().toString();


                if(username.equals("")){
                    Toast.makeText(Login.this, "Usuário não inserido, tente novamente", Toast.LENGTH_SHORT).show();
                }else if (password.equals("")){
                    Toast.makeText(Login.this, "Senha não inserida, tente novamente", Toast.LENGTH_SHORT).show();
                }else if (password.equals("admin") && username.equals("admin")){
                    Toast.makeText(Login.this, "Logado", Toast.LENGTH_SHORT).show();
                    Intent it = new Intent(Login.this, MainActivity.class);
                    startActivity(it);
                    finish();
                }
                else{

                    String res = db.validaLoginUser(username, password);

                    if(res.equals("OK")){
                        Toast.makeText(Login.this, "Logado", Toast.LENGTH_SHORT).show();
                        Intent it = new Intent(Login.this, MainActivity.class);
                        startActivity(it);
                        finish();
                    }else{
                        Toast.makeText(Login.this, "Login incorreto, tente novamente", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

    }
}