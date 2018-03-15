package rualyson.com.dashprovedor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Cadastro extends AppCompatActivity  implements View.OnClickListener {
    private Button cadcliente, cadUser;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        cadcliente = (Button) findViewById(R.id.cadcliente);
        cadUser = (Button) findViewById(R.id.caduser);

        cadcliente.setOnClickListener(this);
        cadUser.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.cadcliente:
                i = new Intent(this, Cadastrocliente.class);startActivity(i);break;
            case R.id.caduser:
                i = new Intent(this, Cadastrouser.class);startActivity(i);break;
            default:
                break;

        }
    }
}