package com.example.projectapp.main.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projectapp.R;
import com.example.projectapp.main.model.ItemCardapio;


import java.util.ArrayList;

public class TelaItem extends AppCompatActivity {



    static ArrayList<ItemCardapio> lista;

    static String buscaNome;
    CustomAdapter2 customAdapter2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_item_layout);


        Intent recuperaDados = getIntent();
        buscaNome = recuperaDados.getStringExtra("buscaNome");

        ArrayList<ItemCardapio> arrayAux = new ArrayList<>();

        for(ItemCardapio i : lista){
            if(i.getNome().equalsIgnoreCase(buscaNome)){
                arrayAux.add(i);
                break;
            }
        }

        RecyclerView recyclerView = findViewById(R.id.RecycleView_item);
        customAdapter2 = new CustomAdapter2(arrayAux);
        recyclerView.setAdapter(customAdapter2);
        recyclerView.setLayoutManager(new GridLayoutManager(this,1));
    }

    public void irItemCardapio(View view) {
        Intent intent = new Intent(this, TelaCardapio.class);
        startActivity(intent);
    }

}