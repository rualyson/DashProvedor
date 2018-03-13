package rualyson.com.dashprovedor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

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

    public void cadastro (View view){
        setContentView(R.layout.escadastro);
    }

    public void cadastrausuario(View view){
        setContentView(R.layout.cadastrouser);
    }

    public void cadastracliente(View view) {
       setContentView(R.layout.cadastrocliente);

        Spinner dropdown = findViewById(R.id.edRoteador);
        String [] itens = new String [] {"Selecione","Comodato","Próprio"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, itens);
        dropdown.setAdapter(adapter);

        Spinner dropdwn = findViewById(R.id.edPlano);
        String [] item = new String [] {"Selecione","6MB","10MB","15MB","20MB","30MB","50MB"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, item);
        dropdwn.setAdapter(adapter1);

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

    public void clickConfirmar(View view) {
    }
}
