package rualyson.com.dashprovedor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class CadOcorrencia extends AppCompatActivity {
    Button btConf;
    EditText conteudo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cad_ocorrencia);

        Spinner dropdwn = findViewById(R.id.edResp);
        String[] item4 = new String[]{"Selecione", "Rualyson", "Juliana", "Ewerton", "Jorge"};
        ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, item4);
        dropdwn.setAdapter(adapter4);

        dropdwn = findViewById(R.id.edStatus);
        String[] item3 = new String[]{"Selecione", "Aberto", "Fechado"};
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, item3);
        dropdwn.setAdapter(adapter3);

        dropdwn = findViewById(R.id.edOcorrencia);
        String[] item1 = new String[]{"Selecione", "Sem conexão", "Pagamento de boleto", "Lentidão","Mudança de endereço"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, item1);
        dropdwn.setAdapter(adapter);

        dropdwn = findViewById(R.id.edContrato);
        String[] item = new String[]{"Selecione", "1548 - Rualyson", "5688- João antônio gomes"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, item);
        dropdwn.setAdapter(adapter1);

        conteudo = (EditText)findViewById(R.id.edconteudo);


        btConf = (Button) findViewById(R.id.btConfirmarOc);

        btConf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String conteu = conteudo.getText().toString();


                if(conteu.equals("")){
                    Toast.makeText(CadOcorrencia.this, "Campo conteúdo obrigatório", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(CadOcorrencia.this, "Ocorrência cadastrada", Toast.LENGTH_SHORT).show();
                    Intent it = new Intent(CadOcorrencia.this, MainActivity.class);
                    startActivity(it);

                }
            }
        });
    }

}