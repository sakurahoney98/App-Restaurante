package com.example.projectapp.main.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projectapp.R;
import com.example.projectapp.main.model.ItemCardapio;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder> {

    private ArrayList<ItemCardapio> lista;
    Intent intent;
    Context contexto;

    public CustomAdapter(ArrayList<ItemCardapio> lista, Context contexto) {
        this.lista = lista;
        this.contexto = contexto;
        this.intent = new Intent(contexto, TelaItem.class);
    }



    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_cardapio_layout, parent, false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.getNome().setText(lista.get(position).getNome());
        String aux = "R$ " +lista.get(position).getValor();
        holder.getPreco().setText(aux.replace(".",","));

        holder.getBotao().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                TelaItem.lista = lista;
                intent.putExtra("buscaNome", lista.get(position).getNome());
                contexto.startActivity(intent);

            }


        });



    }



    @Override
    public int getItemCount() {
        return lista.size();
    }


    class CustomViewHolder extends RecyclerView.ViewHolder {

        private TextView nome;
        private TextView preco;
        private Button botao;

        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            nome = itemView.findViewById(R.id.textView_item_nome);
            preco = itemView.findViewById(R.id.textView_item_preco);
            botao = itemView.findViewById(R.id.button_ver_mais);

        }




        public TextView getNome() {
            return nome;
        }

        public TextView getPreco() {
            return preco;
        }

        public Button getBotao() {
            return botao;
        }
    }
}
