package rualyson.com.dashprovedor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class CadOcorrencia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cad_ocorrencia);

        Spinner dropdwn = findViewById(R.id.edStatus);
        String[] item = new String[]{"Selecione", "Aberto", "Fechado"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, item);
        dropdwn.setAdapter(adapter1);

        dropdwn = findViewById(R.id.edOcorrencia);
        String[] item1 = new String[]{"Selecione", "Sem conexão", "Pagamento de boleto", "Lentidão","Mudança de endereço"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, item1);
        dropdwn.setAdapter(adapter);
    }
}
