package com.buscas.largura;

import com.listas.adjacentes.*;

public class Main {

	public static void main(String[] args) {
		Grafo grafo = new Grafo();
		BFS dfs = new BFS();
		
		Vertice v = grafo.addVertice("V");
		Vertice r = grafo.addVertice("R");
	    Vertice s = grafo.addVertice("S");
	    Vertice w = grafo.addVertice("W");
	    Vertice t = grafo.addVertice("T");
	    Vertice x = grafo.addVertice("X");
	    Vertice u = grafo.addVertice("U");
	    Vertice y = grafo.addVertice("Y");
	    
	    Aresta sr = grafo.addAresta(s, r);
	    Aresta sw = grafo.addAresta(s, w);
	    Aresta rv = grafo.addAresta(r, v);
	    Aresta wt = grafo.addAresta(w, t);
	    Aresta wx = grafo.addAresta(w, x);
	    Aresta tu = grafo.addAresta(t, u);
	    Aresta xy = grafo.addAresta(x, y);
	    
	    
	    dfs.iniciarBusca(s, true);
	    
	    // System.out.println(grafo);
	    System.out.println(dfs);

	}

}
