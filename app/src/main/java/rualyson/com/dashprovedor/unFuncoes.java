package rualyson.com.dashprovedor;


import android.app.Activity;
import android.app.AlertDialog;

public class unFuncoes
{
    public static void MensagemAlerta(String titulo, String corpo, Activity Atividade)
    {
        AlertDialog.Builder infoResultado = new   AlertDialog.Builder(Atividade);
        infoResultado.setTitle(titulo);
        infoResultado.setMessage(corpo);
        infoResultado.setNeutralButton("Ok",null);
        infoResultado.show();
    }
    public static String CaracterDireita(String Campo, int Quantidade, String Caracter)
    {
        int tamanho = Quantidade - Campo.length();

        StringBuffer sb = new StringBuffer(Campo);
        if (tamanho > 0)
        {
            for (int i=0 ; i<tamanho ; i++)
            {
                sb.append(Caracter);
            }
        }

        return sb.toString();
    }
    public static String ZeroEsquerda(int Campo, int Quantidade)
    {
        return String.format("%0"+Quantidade+"d", Campo);
    }
}
