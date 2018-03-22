package rualyson.com.dashprovedor;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

import rualyson.com.dashprovedor.Vendedor;
import rualyson.com.dashprovedor.VendedorAdapter;

public class ConsultaVendedor extends AppCompatActivity {

    private VendedorAdapter v1;
    private ArrayList<Vendedor> list_vendedores;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        list_vendedores = new ArrayList<Vendedor>();


        Vendedor vendedor1 = new Vendedor();
        Vendedor vendedor2 = new Vendedor();

        vendedor1.setId("1");
        vendedor1.setNome("teste");
        vendedor1.setQuantVendas(10);

        vendedor2.setId("2");
        vendedor2.setNome("teste2");
        vendedor2.setQuantVendas(101);



        list_vendedores.add(vendedor1);
        list_vendedores.add(vendedor2);

        v1 = new VendedorAdapter(ConsultaVendedor.this, list_vendedores);
        ListView list = new ListView(ConsultaVendedor.this);
        list.setAdapter(v1);
        setContentView(list);
    }
}