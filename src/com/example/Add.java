package com.example;
import java.util.ArrayList;

public interface Add {
   void adicionarMusica(Musica musica);
   ArrayList<Musica> obterListaMusicas();
   String getNome();

   String getGeneroMusical();

   int getLancamento();
   void setDuracao();
   int getDuracao();
}