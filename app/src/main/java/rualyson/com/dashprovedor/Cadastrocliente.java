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

public class Cadastrocliente extends AppCompatActivity {
    EditText ed_cpf, ed_name, ed_rg, ed_dtnascimento, ed_contato, ed_cidade, ed_instalacao;
    Button btConfirm, btCancel;

    DBProvedor db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrocliente);
        Spinner dropdown = findViewById(R.id.edRoteador);
        String[] itens = new String[]{"Selecione", "Próprio", "Comodato"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, itens);
        dropdown.setAdapter(adapter);

        Spinner dropdwn = findViewById(R.id.edPlano);
        String[] item = new String[]{"Selecione", "6 Megas", "10 Megas", "15 Megas", "20 Megas", "30 Megas", "50 Megas"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, item);
        dropdwn.setAdapter(adapter1);

        db = new DBProvedor(this);
        ed_name = (EditText)findViewById(R.id.edNomeCli);
        ed_cpf = (EditText)findViewById(R.id.edCPFcliente);
        ed_rg = (EditText)findViewById(R.id.edRG);
        ed_dtnascimento= (EditText)findViewById(R.id.edDataNascimento);
        ed_contato= (EditText)findViewById(R.id.edContato);
        ed_cidade= (EditText)findViewById(R.id.edCidade);
        ed_instalacao = (EditText)findViewById(R.id.edValorInstalacao);


        btConfirm = (Button)findViewById(R.id.btConfirmar);
        btConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = ed_name.getText().toString();
                String CPF = ed_cpf.getText().toString();
                String RG = ed_rg.getText().toString();
                String dtnasc = ed_dtnascimento.getText().toString();
                String contato = ed_contato.getText().toString();
                String cidade = ed_cidade.getText().toString();
                String instalacao = ed_instalacao.getText().toString();

                if (CPF.equals("")) {
                    Toast.makeText(Cadastrocliente.this, "CPF não inserido, tente novamente", Toast.LENGTH_SHORT).show();
                }else if (name.equals("")) {
                    Toast.makeText(Cadastrocliente.this, "Nome não inserido, tente novamente", Toast.LENGTH_SHORT).show();
                }else if (RG.equals("")) {
                    Toast.makeText(Cadastrocliente.this, "RG não inserido, tente novamente", Toast.LENGTH_SHORT).show();
                }else if (dtnasc.equals("")) {
                    Toast.makeText(Cadastrocliente.this, "Data de nascimento não inserida, tente novamente", Toast.LENGTH_SHORT).show();
                }else if (contato.equals("")) {
                    Toast.makeText(Cadastrocliente.this, "Telefone para contato não inserido, tente novamente", Toast.LENGTH_SHORT).show();
                }else if (cidade.equals("")) {
                    Toast.makeText(Cadastrocliente.this, "Cidade não inserida, tente novamente", Toast.LENGTH_SHORT).show();
                }else if (instalacao.equals("")) {
                    Toast.makeText(Cadastrocliente.this, "Valor da instalação não inserida, tente novamente", Toast.LENGTH_SHORT).show();
                }else {
                    long res = db.CriarCliente(name, CPF);
                    if (res > 0) {
                        Toast.makeText(Cadastrocliente.this, "Cadastro realizado com sucesso", Toast.LENGTH_SHORT).show();
                        Intent it = new Intent(Cadastrocliente.this, MainActivity.class);
                        startActivity(it);
                    } else {
                        Toast.makeText(Cadastrocliente.this, "Registro incorreto, tente novamente", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

    }
}


