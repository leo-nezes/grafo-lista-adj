package com.listas.adjacentes;

import java.util.ArrayList;
import java.util.List;


public class Vertice {
    public String nome;
    public List<Aresta> adjacencias;
    
    public Vertice pi = null; // Salva v�tice antecessor
    public String cor = "b"; // Cor do v�rtice: (b)branco - estado inicial de um v�rtice; (c)cinza - v�rtice descoberto; (p)preto - lista de adjac�ncias foi finalizada;

	// Selos de tempo
    public Integer tInicial = 0; // salva o tempo de quando o v�rtice foi descoberto e colorido como cinza;
    public Integer tFinal = 0; // salva o tempo de quando a busca finaliza o exame da lista de adjac�ncias do v�rtice e o colore como preto.
	

    Vertice(String nome) {
        this.nome = nome;
        this.adjacencias = new ArrayList<Aresta>();
    }

    void addAdjacencia(Aresta e) {
    	adjacencias.add(e);
    }
}
