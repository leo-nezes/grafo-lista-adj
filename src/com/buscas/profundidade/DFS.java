package com.buscas.profundidade;

import java.util.ArrayList;
import java.util.List;

import com.listas.adjacentes.*;

// Algoritmo de Cormen
public class DFS {
	private List<Vertice> vertices;
	private Integer cont;
	private boolean isAdj;
	private String resultado;
	
	public DFS() {
		this.vertices = new ArrayList<Vertice>();
		this.cont = 0;
		this.isAdj = false;
		this.resultado = "";
	}
	
	public void buscaDFS(Vertice vertice){
		resultado += "---------------------------------\n";
		resultado += "DFS(" + vertice.nome + ")\n";
		
		cont += 1;
		
		vertice.cor = "c";
		vertice.tInicial = cont;

		if (vertice.pi == null) {
			resultado += "Antecessor: \n";
		} else {
			resultado += "Antecessor: " + vertice.pi.nome + "\n";
		}
		
		resultado += "Cor: " + vertice.cor + "\n";
		resultado += "Tempo Inicial: " + vertice.tInicial + "\n";
		
		vertice.adjacencias.forEach((verticeAdj) -> {
			if(verticeAdj.destino.cor == "b") {
				verticeAdj.destino.pi = vertice;
				
				buscaDFS(verticeAdj.destino);
			}
			
		// vertice.cor = "p";
		// vertice.tInicial = ++cont;
		});
	}

	
	public String toString() {
		return resultado;
	}
}
