package rualyson.com.dashprovedor;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private CardView cadastro, localizacao, ocorrencias, statuscadastro, vendasmes, recados;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cadastro = (CardView) findViewById(R.id.cadastro_);
        localizacao = (CardView) findViewById(R.id.localizacao_);
        ocorrencias = (CardView) findViewById(R.id.edOcorrencias);
        statuscadastro = (CardView) findViewById(R.id.statuscadastro_);
        vendasmes = (CardView) findViewById(R.id.vendasmes_) ;
        recados = (CardView) findViewById(R.id.recados_);


        cadastro.setOnClickListener(this);
        localizacao.setOnClickListener(this);
        ocorrencias.setOnClickListener(this);
        statuscadastro.setOnClickListener(this);
        vendasmes.setOnClickListener(this);
        recados.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()){
            case R.id.cadastro_ : i = new Intent(this,Cadastro.class);startActivity(i); break;
            case R.id.localizacao_ : i = new Intent(this,Localizacao.class);startActivity(i); break;
            case R.id.edOcorrencias: i = new Intent(this, Ocorrencias.class);startActivity(i); break;
            case R.id.statuscadastro_ : i = new Intent(this, StatusCadastro.class);startActivity(i); break;
            case R.id.vendasmes_ : i = new Intent(this, VendasMes.class);startActivity(i); break;
            case R.id.recados_ : i = new Intent(this, Recados.class);startActivity(i); break;
            default:break;

        }
    }
}