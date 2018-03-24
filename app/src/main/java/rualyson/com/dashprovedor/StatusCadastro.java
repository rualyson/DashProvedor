package rualyson.com.dashprovedor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class statuscadastro extends AppCompatActivity {
    Cursor ponteiro;
    DBProvedor db;
    TextView resultado;
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statuscadastro);

        Button btPesquisar = (Button) findViewById(R.id.btnPesquisar);
        btPesquisar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado = (TextView) findViewById(R.id.txtResultado);
                RadioGroup rgPesquisar = (RadioGroup) findViewById(R.id.rgPesquisar);
                String strPesquisa = "";

                switch (rgPesquisar.getCheckedRadioButtonId()) {
                    case R.id.rbNome:
                        strPesquisa = "name LIKE ?";
                        break;

                    case R.id.rbCidade:
                        strPesquisa = "cpf LIKE ?";
                        break;
                }
            }
        });
    }
}