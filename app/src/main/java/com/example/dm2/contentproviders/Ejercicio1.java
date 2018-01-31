package com.example.dm2.contentproviders;

import android.database.Cursor;
import android.net.Uri;
import android.provider.CallLog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.TextView;

public class Ejercicio1 extends AppCompatActivity {

    private TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio1);
        txt=(TextView)findViewById(R.id.registros_txt);
    }

    public void registro(View v){
        String[] TIPO_LLAMADA={"","Entrante","Saliente","Perdida"};
        Uri llamadas=Uri.parse("content://call_log/calls");

        //Recorremos el cursor cogiendo todas las llamadas
        Cursor c=getContentResolver().query(llamadas,null,null,null,null);
        while (c.moveToNext()){
            txt.append("\n"+ DateFormat.format("dd/MM/yy k:mm (",c.getLong(c.getColumnIndex(CallLog.Calls.DATE)))
            +c.getString(c.getColumnIndex(CallLog.Calls.DURATION))+")"+ c.getString(c.getColumnIndex(CallLog.Calls.NUMBER))+
             ", "+TIPO_LLAMADA[Integer.parseInt(c.getString(c.getColumnIndex(CallLog.Calls.TYPE)))])
            ;
        }
    }
}
