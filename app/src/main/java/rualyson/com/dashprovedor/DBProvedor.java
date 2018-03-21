package rualyson.com.dashprovedor;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class DBProvedor extends SQLiteOpenHelper {
    private static int versao = 1;
    private static String nome = "Login_Registro_BaseDados.db";
    private String username;
    private String password;
    private String cpf;

    public DBProvedor(Context context) {
        super(context, nome, null, versao);
    }

    public void onCreate(SQLiteDatabase db) {
        String str = "CREATE TABLE Utilizador(username TEXT PRIMARY KEY, password TEXT);";
        db.execSQL(str);

        String str1 = "CREATE TABLE ClienteCPF(cpf TEXT PRIMARY KEY, nome TEXT);";
        db.execSQL(str1);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS Utilizador");
        onCreate(db);
    }

    public long CriarUtilizador(String username, String password) {
        SQLiteDatabase db = getReadableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("username", username);
        cv.put("password", password);
        long result = db.insert("Utilizador", null, cv);
        return result;
    }


    public String validaLoginUser(String username, String password) {
        this.username = username;
        this.password = password;
        SQLiteDatabase db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM Utilizador WHERE username = ? AND password = ?" , new String[]{
                username.toString(), password.toString()});
        if (c.getCount()>0) {
            return "OK" ;
        }
        return "ERRO";
    }

    public long CriarCliente(String cpf){
        SQLiteDatabase dbcliente = getReadableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("CPF", cpf);
        long result = dbcliente.insert("ClienteCPF", null, contentValues);
        return result;
    }

    public String validaCPF (String cpf){
        this.cpf = cpf;
        SQLiteDatabase database = getReadableDatabase();
        Cursor cs = database.rawQuery("SELECT * FROM ClienteCPF WHERE cpf = ?", new String [] {
                cpf.toString()});
        if (cs.getCount() > 0){
            return "OK";
        } return "ERRO";
    }

}
