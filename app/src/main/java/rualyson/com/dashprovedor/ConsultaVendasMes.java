package rualyson.com.dashprovedor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ConsultaVendasMes extends AppCompatActivity {
    DBProvedor db;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consulta_vendas_mes);
    }

    public void contarClientes() {
        int contarClientes = new DBProvedor(this).contador();
        TextView textViewContador = (TextView) findViewById(R.id.quantVendasMes);
        textViewContador.setText(contarClientes);
    }
}