package com.buscas.profundidade;

import com.listas.adjacentes.*;

public class Main {

	public static void main(String[] args) {
		Grafo grafo = new Grafo();
		DFS dfs = new DFS();
		
		Vertice a = grafo.addVertice("A");
	    Vertice b = grafo.addVertice("B");
	    Vertice c = grafo.addVertice("C");
	    
	    Aresta ab = grafo.addAresta(a, b);
	    Aresta ac = grafo.addAresta(a, c);
	    
	    grafo.vertices.forEach((vertice) -> {
	    	dfs.buscaDFS(vertice);
	    });
	    
	    System.out.println(dfs);
	}

}
