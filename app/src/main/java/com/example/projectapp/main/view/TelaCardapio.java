package com.example.projectapp.main.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.projectapp.R;
import com.example.projectapp.main.model.ItemCardapio;

import java.math.BigDecimal;
import java.util.ArrayList;

public class TelaCardapio extends AppCompatActivity {

    ArrayList<ItemCardapio> dados = new ArrayList<>();
    CustomAdapter customAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_cardapio_layout);

        dados.add(new ItemCardapio("Hossomaki","Hossomaki de salmão 5 pçs", BigDecimal.valueOf(58),R.drawable.hossomaki));
        dados.add(new ItemCardapio("HotRoll","Hot Takê 6 pçs",BigDecimal.valueOf(65),R.drawable.hotroll));
        dados.add(new ItemCardapio("Sushi","Sushi misto 11 pçs",BigDecimal.valueOf(59),R.drawable.sushi));
        dados.add(new ItemCardapio("Uramaki","Uramaki de camarão na Panko 8 pçs",BigDecimal.valueOf(69.00),R.drawable.uramaki));
        dados.add(new ItemCardapio("Temaki","Temaki de salmão com cream cheese",BigDecimal.valueOf(59.00),R.drawable.temaki));

        TelaItem.lista = dados;

        RecyclerView recyclerView = findViewById(R.id.ReclyclerView_lista);
        customAdapter = new CustomAdapter(dados, TelaCardapio.this);
        recyclerView.setAdapter(customAdapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this,1));




    }
    public void irCardapioHome(View view) {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }
}