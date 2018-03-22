package rualyson.com.dashprovedor;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class vendasmes extends AppCompatActivity {
    private Button consultaVendedor, consultaPorMes;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vendasmes);

        consultaVendedor = (Button) findViewById(R.id.ButtonPesquisarPorVendedor);
        consultaPorMes = (Button) findViewById(R.id.ButtonPesquisarPorMes);


        consultaVendedor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent i;
                switch (view.getId()) {
                    case R.id.ButtonPesquisarPorVendedor:
                        i = new Intent(vendasmes.this, ConsultaVendedor.class);
                        startActivity(i);
                        break;
                    case R.id.ButtonPesquisarPorMes:
                        i = new Intent(vendasmes.this, ConsultaVendasMes.class);
                        startActivity(i);
                        break;
                    default:
                        break;
                }
            }
        });


        consultaPorMes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent i;
                switch (view.getId()) {
                    case R.id.ButtonPesquisarPorVendedor:
                        i = new Intent(vendasmes.this, ConsultaVendedor.class);
                        startActivity(i);
                        break;
                    case R.id.ButtonPesquisarPorMes:
                        i = new Intent(vendasmes.this, ConsultaVendasMes.class);
                        startActivity(i);
                        break;
                    default:
                        break;
                }
            }
        });

    }

}

