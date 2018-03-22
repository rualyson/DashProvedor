package rualyson.com.dashprovedor;

import java.io.Serializable;


public class Mes implements Serializable {

    private String nomeMes;
    private int quantVendasDoMes;
    private String idDoMes;



    public String getNomeDoMes() {
        return nomeMes;
    }

    public void setNomeDoMes(String nome) {

        this.nomeMes = nome;
    }

    public int getQuantVendasNoMes() {

        return quantVendasDoMes;
    }

    public void setQuantVendasNoMes(int quantVendasDoMes) {

        this.quantVendasDoMes = quantVendasDoMes;
    }

    /*public String getIdDoMes() {
        return idDoMes;
    }

    public void setId(String id) {

        this.idDoMes = id;
    }*/




}
