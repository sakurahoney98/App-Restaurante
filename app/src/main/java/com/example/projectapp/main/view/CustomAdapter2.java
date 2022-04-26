package com.example.projectapp.main.view;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import androidx.recyclerview.widget.RecyclerView;

import com.example.projectapp.R;
import com.example.projectapp.main.model.ItemCardapio;

import java.util.List;

public class CustomAdapter2 extends RecyclerView.Adapter<CustomAdapter2.CustomViewHolder> {
    private List<ItemCardapio> lista;



    public CustomAdapter2(List<ItemCardapio> lista) {
        this.lista = lista;


    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_layout, parent, false);
        return new CustomAdapter2.CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        holder.getNome().setText(lista.get(position).getNome());
        String aux = "R$ " +lista.get(position).getValor();
        holder.getPreco().setText(aux.replace(".",","));
        holder.getDescricao().setText(lista.get(position).getDescricao());
        holder.getImagem().setImageResource(lista.get(position).getImagem());



    }

    @Override
    public int getItemCount() {
        return lista.size();
    }


    class CustomViewHolder extends RecyclerView.ViewHolder {

        private TextView nome;
        private TextView preco;
        private TextView descricao;
        private ImageView imagem;


        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            nome = itemView.findViewById(R.id.textView_nome_prato);
            preco = itemView.findViewById(R.id.textView_preco_prato);
            descricao = itemView.findViewById(R.id.textView_descricao_prato);
            imagem = itemView.findViewById(R.id.imageView_imagem_prato);
        }

        public TextView getNome() {
            return nome;
        }

        public TextView getPreco() {
            return preco;
        }

        public TextView getDescricao() {
            return descricao;
        }

        public ImageView getImagem() {
            return imagem;
        }
    }
}
