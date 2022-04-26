package com.example.projectapp.main.model;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;


    public class ItemCardapio {
        private String nome;
        private String descricao;
        private BigDecimal valor;
        private int imagem;
        NumberFormat formatter = new DecimalFormat("#0,00");

        public ItemCardapio(String nome, String descricao, BigDecimal valor, int imagem) {
            this.nome = nome;
            this.descricao = descricao;
            this.valor = valor;
            this.imagem = imagem;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getDescricao() {
            return descricao;
        }

        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }

        public BigDecimal getValor() {
            return valor.setScale(2, BigDecimal.ROUND_HALF_EVEN);
        }

        public void setValor(BigDecimal valor) {
            this.valor = valor;
        }

        public int getImagem() {
            return imagem;
        }

        public void setImagem(int imagem) {
            this.imagem = imagem;
        }
    }

