package rualyson.com.dashprovedor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class  Ocorrencias extends AppCompatActivity implements OnClickListener {
    private Button cadOcorrencia, vizOcorrencia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ocorrencias);

        cadOcorrencia = (Button) findViewById(R.id.btncadastrar);
        vizOcorrencia = (Button) findViewById(R.id.btnstatus);

        cadOcorrencia.setOnClickListener(this);
        vizOcorrencia.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.btncadastrar:
                i = new Intent(this, CadOcorrencia.class);
                startActivity(i);
                break;
            case R.id.btnstatus:
                i = new Intent(this, VizOcorrencia.class);
                startActivity(i);
                break;
        }
    }
}
