package rualyson.com.dashprovedor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;




import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

import rualyson.com.dashprovedor.Mes;
import rualyson.com.dashprovedor.VendedorAdapter;

    public class ConsultaVendasMes extends AppCompatActivity {

        private MesAdapter m1;
        private ArrayList<Mes> list_meses;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);


            list_meses = new ArrayList<Mes>();


            Mes mes1 = new Mes();
            Mes mes2 = new Mes();


            mes1.setNomeDoMes("Janeiro");
            mes1.setQuantVendasNoMes(10);


            mes2.setNomeDoMes("fevereiro");
            mes2.setQuantVendasNoMes(101);



            list_meses.add(mes1);
            list_meses.add(mes2);

            m1 = new MesAdapter(ConsultaVendasMes.this, list_meses);
            ListView list = new ListView(ConsultaVendasMes.this);
            list.setAdapter(m1);
            setContentView(list);
        }
    }