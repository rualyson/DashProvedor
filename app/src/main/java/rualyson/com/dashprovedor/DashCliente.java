package rualyson.com.dashprovedor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class DashCliente extends AppCompatActivity implements View.OnClickListener {
    private CardView  ocorrencias, statuscadastro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_cliente);

        ocorrencias = (CardView) findViewById(R.id.ocorrenciascli);
        statuscadastro = (CardView) findViewById(R.id.statuscadastrocli);

        ocorrencias.setOnClickListener(this);
        statuscadastro.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()){

            case R.id.ocorrenciascli : i = new Intent(this, Ocorrencias.class);startActivity(i); break;
            case R.id.statuscadastrocli : i = new Intent(this, statuscadastro.class);startActivity(i); break;
            default:break;
    }
}
}
