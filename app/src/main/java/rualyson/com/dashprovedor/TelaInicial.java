package rualyson.com.dashprovedor;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;


public class TelaInicial extends AppCompatActivity {

    CardView clickF, clickC;

    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telainicial);

        clickF = (CardView) findViewById(R.id.funcionario);
        clickF.setOnClickListener(new android.view.View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TelaInicial.this, Login.class);
                startActivity(intent);
            }
        });

        clickC = (CardView) findViewById(R.id.cliente);
        clickC.setOnClickListener(new android.view.View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TelaInicial.this, LoginCliente.class);
                startActivity(intent);
            }
        });

    }

}
