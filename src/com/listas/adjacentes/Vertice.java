package com.listas.adjacentes;

import java.util.ArrayList;
import java.util.List;


public class Vertice {
    public String nome;
    public List<Aresta> adjacencias;
    
    public Vertice pi = null; // Salva vétice antecessor
    public String cor = "b"; // Cor do vértice: (b)branco - estado inicial de um vértice; (c)cinza - vértice descoberto; (p)preto - lista de adjacências foi finalizada;

	// Selos de tempo
    public Integer tInicial = 0; // salva o tempo de quando o vértice foi descoberto e colorido como cinza;
    public Integer tFinal = 0; // salva o tempo de quando a busca finaliza o exame da lista de adjacências do vértice e o colore como preto.
	

    Vertice(String nome) {
        this.nome = nome;
        this.adjacencias = new ArrayList<Aresta>();
    }

    void addAdjacencia(Aresta e) {
    	adjacencias.add(e);
    }
}
