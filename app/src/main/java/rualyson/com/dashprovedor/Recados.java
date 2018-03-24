package rualyson.com.dashprovedor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import java.util.ArrayList;

public class Recados extends AppCompatActivity {

    private ListView anotacoes;
    private Button adicionar,remover;
    private EditText text_user;
    private ArrayAdapter adapter;
    private ArrayList<String> arrayAnotacoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recados);

        arrayAnotacoes = new ArrayList<String>();

        anotacoes=(ListView)findViewById(R.id.listView);
        adicionar=(Button)findViewById(R.id.btn_adicionar);
        text_user=(EditText)findViewById(R.id.anotacaoUuser);

        adapter = new ArrayAdapter<String>(Recados.this,android.R.layout.simple_list_item_1,arrayAnotacoes);

        adicionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(text_user.getText().toString().isEmpty()){
                    Toast.makeText(Recados.this,"Preencha algo",Toast.LENGTH_SHORT).show();
                }
                else{
                    arrayAnotacoes.add(text_user.getText().toString());
                    anotacoes.setAdapter(adapter);


                    // REMOVER QUANDO CLICAR NO RECADO
                    anotacoes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                            int posicao = i;
                            arrayAnotacoes.remove(i);
                            anotacoes.setAdapter(adapter);
                        }
                    });
                }
            }
        });
    }
}