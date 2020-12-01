package com.buscas.largura;

import com.listas.adjacentes.*;

public class Main {

	public static void main(String[] args) {
		Grafo grafo = new Grafo();
		BFS dfs = new BFS();
		
		Vertice a = grafo.addVertice("A");
	    Vertice b = grafo.addVertice("B");
	    Vertice c = grafo.addVertice("C");
	    
	    Aresta ab = grafo.addAresta(a, b);
	    Aresta ac = grafo.addAresta(a, c);
	    
	    dfs.iniciarBusca(grafo.getVertices().get(0), true);
	    
	    System.out.println(dfs);

	}

}
