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
		
		switch (vertice.cor) {
		case "b": 
			vertice.cor = "c";
			break;
		case "c": 
			vertice.cor = "p";
			break;
		default:
			break;
		}
		
		
		if (vertice.tInicial != 0) {
			vertice.tFinal = cont;
		} else {
			vertice.tInicial = cont;
		}

		if (vertice.pi == null) {
			resultado += "Antecessor: \n";
		} else {
			resultado += "Antecessor: " + vertice.pi.nome + "\n";
		}
		
		resultado += "Cor: " + vertice.cor + "\n";
		resultado += "Tempo Inicial: " + vertice.tInicial + "\n";
		resultado += "Tempo Final: " + vertice.tFinal + "\n";
		
		
		if (vertice.adjacencias.isEmpty() && vertice.pi.cor != "p") {
			buscaDFS(vertice.pi);
		} else {
			vertice.adjacencias.forEach((verticeAdj) -> {
				if(verticeAdj.destino.cor == "b") {
					verticeAdj.destino.pi = vertice;
					
					buscaDFS(verticeAdj.destino);
				}
			});
		}
	}

	
	public String toString() {
		return resultado;
	}
}
