package com.listas.adjacentes;

import java.util.ArrayList;
import java.util.List;


public class Vertice {
    private String nome;
    private List<Aresta> adjacencias;
    
    private Vertice pi; // Salva v�tice antecessor
    private String cor; // Cor do v�rtice: (b)branco - estado inicial de um v�rtice; (c)cinza - v�rtice descoberto; (p)preto - lista de adjac�ncias foi finalizada;

	// Selos de tempo
    private Integer tInicial; // salva o tempo de quando o v�rtice foi descoberto e colorido como cinza;
    private Integer tFinal; // salva o tempo de quando a busca finaliza o exame da lista de adjac�ncias do v�rtice e o colore como preto.
	

    Vertice(String nome) {
        this.nome = nome;
        this.adjacencias = new ArrayList<Aresta>();
        this.pi = null;
        this.cor = "b";
        this.tInicial = 0;
        this.tFinal = 0;
    }

    void addAdjacencia(Aresta e) {
    	adjacencias.add(e);
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Aresta> getAdjacencias() {
		return adjacencias;
	}

	public void setAdjacencias(List<Aresta> adjacencias) {
		this.adjacencias = adjacencias;
	}

	public Vertice getPi() {
		return pi;
	}

	public void setPi(Vertice pi) {
		this.pi = pi;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Integer gettInicial() {
		return tInicial;
	}

	public void settInicial(Integer tInicial) {
		this.tInicial = tInicial;
	}

	public Integer gettFinal() {
		return tFinal;
	}

	public void settFinal(Integer tFinal) {
		this.tFinal = tFinal;
	}
    
    
}
