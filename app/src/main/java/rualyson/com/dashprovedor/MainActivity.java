package rualyson.com.dashprovedor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        Button botao1 = (Button) findViewById(R.id.botao1);

        botao1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                setContentView(R.layout.activity_main);
            }
        });

    }

    public void login(View view){

        setContentView(R.layout.activity_main);
    }
    public void cadastracliente(View view) {
       setContentView(R.layout.cadastrocliente);

    }
    public void localizacao(View view){
        setContentView(R.layout.localizacao);
    }

    public void statuscadastro(View view){
        setContentView(R.layout.statuscadastro);
    }
    public void ocorrencias(View view){
        setContentView(R.layout.ocorrencias);
    }

}
