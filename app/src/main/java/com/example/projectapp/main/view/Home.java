package com.example.projectapp.main.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;

import com.example.projectapp.R;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_layout);

    }

    public void irTelaLogin(View view) {
        Intent intent = new Intent(this, TelaLogin.class);
        startActivity(intent);
    }

    public void irTelaCardapio(View view) {
       Intent intent = new Intent(this, TelaCardapio.class);
        startActivity(intent);
    }


}