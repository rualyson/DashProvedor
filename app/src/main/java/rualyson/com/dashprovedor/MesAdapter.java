package rualyson.com.dashprovedor;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MesAdapter extends BaseAdapter {

    private Context contexto;
    private ArrayList<Mes> nMeses;

    public MesAdapter(Context contexto, ArrayList<Mes> Meses) {
        super();
        this.contexto = contexto;
        this.nMeses = Meses;
    }


    @Override
    public int getCount() {
        return nMeses.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        Mes mes = nMeses.get(position); // pega a posicao do item array especificado

        if (view == null) {
            LayoutInflater mInflater = (LayoutInflater) contexto.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            view = mInflater.inflate(R.layout.activity_consulta_vendas_mes, null);
        }


        TextView txtNomeMes = (TextView) view.findViewById(R.id.txtNomeMes);
        TextView qntVendas = (TextView) view.findViewById(R.id.txtQuantVendasNoMes);



        txtNomeMes.setText(mes.getNomeDoMes());
        qntVendas.setText(String.valueOf(mes.getQuantVendasNoMes()));


        return view;


    }
}