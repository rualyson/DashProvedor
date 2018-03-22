package rualyson.com.dashprovedor;

import java.io.Serializable;


public class Vendedor implements Serializable {

    private String nome;
    private int quantVendas;
    private String id;

    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantVendas() {

        return quantVendas;
    }

    public String getId() {

        return id;
    }

    public void setId(String id) {

        this.id = id;
    }
    public void setQuantVendas(int quantVendas) {

        this.quantVendas = quantVendas;
    }



}
