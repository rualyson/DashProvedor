package rualyson.com.dashprovedor;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class VendedorAdapter extends BaseAdapter {

    private Context ctx;
    private ArrayList<Vendedor> mVendedor;

    public VendedorAdapter(Context ctx, ArrayList<Vendedor> vendedores) {
        super();
        this.ctx = ctx;
        this.mVendedor = vendedores;
    }


    @Override
    public int getCount() {
        return mVendedor.size();
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
        Vendedor usuario = mVendedor.get(position); // pega a posicao do item array especificado

        if (view == null) {
            LayoutInflater mInflater = (LayoutInflater) ctx.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            view = mInflater.inflate(R.layout.activity_consulta_vendedor, null);
        }


        TextView txtNome = (TextView) view.findViewById(R.id.txtNomeVendedor);
        TextView qntVendas = (TextView) view.findViewById(R.id.txtQuantVendasVendedor);
        TextView idVendedor = (TextView) view.findViewById(R.id.txtId);


        txtNome.setText(usuario.getNome());
        qntVendas.setText(String.valueOf(usuario.getQuantVendas()));
        idVendedor.setText(usuario.getId());

        return view;


    }
}