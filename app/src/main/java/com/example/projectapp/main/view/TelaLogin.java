package com.example.projectapp.main.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.projectapp.R;
import com.example.projectapp.main.model.User;

import java.util.ArrayList;

public class TelaLogin extends AppCompatActivity {

    ArrayList<User> usuarios = new ArrayList<>();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_login_layout);

        usuarios.add(new User("meuemail@gmail.com","admin123","Administrador","Teste"));



    }

    public void entrar(View view){
        boolean prox = false;
       EditText emailInformado = (EditText) findViewById(R.id.editText_email);
       EditText  senhaInformada = (EditText) findViewById(R.id.editText_senha);
       for(User u : usuarios){
           if(u.getEmail().equalsIgnoreCase(String.valueOf(emailInformado.getText()))){
               if(u.getSenha().equals(senhaInformada.getText().toString())) {
               prox = true;
               }
               break;
           }
       }
       if(prox){

        Intent i = new Intent(this, PainelUsuario.class);
        startActivity(i);


       }else{
           Toast.makeText(getApplicationContext(), "Usuário não existe", Toast.LENGTH_SHORT).show();
       }
    }


    public void irLoginHome(View view) {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }
}