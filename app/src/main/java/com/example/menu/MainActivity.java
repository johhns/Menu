package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> lista1 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista1 = new ArrayList<>();
        ListView vista = findViewById(R.id.lstView01) ;

        lista1.add("Registro UNO") ;
        lista1.add("Registro DOS") ;
        lista1.add("Registro TRES") ;
        lista1.add("Registro CUATRO") ;
        lista1.add("Registro CINCO") ;
        lista1.add("Registro SEIS") ;
        lista1.add("Registro SIETE") ;
        lista1.add("Registro OCHO") ;
        lista1.add("Registro NUEVE") ;
        lista1.add("Registro DIEZ") ;

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,lista1) ;
        vista.setAdapter( adaptador );

        Toolbar barra = findViewById( R.id.barra_ppl ) ;
        setSupportActionBar(barra);

    }
}