package rualyson.com.dashprovedor;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;


public class DBProvedor extends SQLiteOpenHelper {
    private static int versao = 2;
    private static String nome = "Database.db";
    private String username;
    private String password;
    private String name;
    private String cpf;

    public DBProvedor(Context context) {
        super(context, nome, null, versao);
    }

    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE Utilizador(username TEXT PRIMARY KEY, password TEXT)");
        db.execSQL("CREATE TABLE Cliente(name TEXT, cpf INTEGER PRIMARY KEY )");
        db.execSQL("CREATE TABLE Recados(anotacao TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS Utilizador");
        db.execSQL("DROP TABLE IF EXISTS Cliente");
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

    public long CriarRecado(String anotacao) {
        SQLiteDatabase db = getReadableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("anotacao", anotacao);
        long result = db.insert("Recados", null, cv);
        return result;
    }

    public long CriarCliente(String name, String cpf) {
        SQLiteDatabase db = getReadableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("name", name);
        cv.put("cpf", cpf);
        long result = db.insert("Cliente", null, cv);
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

    public String validaCliente(String name, String cpf) {
        this.name = name;
        this.cpf = cpf;
        SQLiteDatabase db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM Cliente WHERE name = ? AND cpf = ?" , new String[]{
                name.toString(), cpf.toString()});
        if (c.getCount()>0) {
            return "OK" ;
        }
        return "ERRO";
    }
    public String validaCPF(String cpf) {
        this.cpf = cpf;
        SQLiteDatabase db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM Cliente WHERE cpf = ?" , new String[]{
                cpf.toString()});
        if (c.getCount()>0) {
            return "OK" ;
        }
        return "ERRO";
    }
}
