package com.listas.adjacentes;

import java.util.List;
import java.util.ArrayList;

public class Grafo {
	public List<Vertice> vertices;
	public List<Aresta> arestas;

    public Grafo() {
        vertices = new ArrayList<Vertice>();
        arestas = new ArrayList<Aresta>();
    }

    public Vertice addVertice(String nome) {
        Vertice v = new Vertice(nome);
        vertices.add(v);
        return v;
    }

    public Aresta addAresta(Vertice origem, Vertice destino) {
    	Aresta e = new Aresta(destino);
        origem.addAdjacencia(e);
        arestas.add(e);
        return e;
    }

    public String toString() {
        String r = "";
        for (Vertice vertice : vertices) {
            r += vertice.nome + " -> ";
            for (Aresta aresta : vertice.adjacencias) {
                Vertice v = aresta.destino;
                r += v.nome + ", ";
            }
            r += "\n";
        }
        return r;
    }
}