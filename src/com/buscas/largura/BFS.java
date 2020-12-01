package com.buscas.largura;

import java.util.ArrayList;
import java.util.List;

import com.listas.adjacentes.*;

public class BFS {
	private List<Vertice> fila;
	private String resultado;

	public BFS() {
		this.fila = new ArrayList<Vertice>();
		this.resultado = "";
	}
	
	public void iniciarBusca(Vertice vertice, boolean verticeOrigem) {
		resultado += "---------------------------------\n";
		resultado += "BFS(" + vertice.getNome() + ")\n";
		
		if(verticeOrigem) fila.add(vertice);
		
		Vertice newVertice = fila.get(0);
		
		newVertice.setCor("c");
		
		resultado += (newVertice.getPi() == null) ? "Antecessor: \n" : "Antecessor: " + newVertice.getPi() + "\n"; 
				
		resultado += "Cor: " + newVertice.getCor() + "\n";
		
		if (verticeOrigem) newVertice.settInicial(0);
		
		newVertice.settInicial((verticeOrigem) ? 0 : newVertice.getPi().gettInicial() + 1);

		resultado += "Tempo Inicial: " + newVertice.gettInicial() + "\n";
		
		newVertice.getAdjacencias().forEach(adjacencia -> {
			adjacencia.getDestino().setPi(newVertice);
			
			fila.add(adjacencia.getDestino());
		});
		
		newVertice.setCor("p");
		
		fila.remove(0);
		
		iniciarBusca(fila.get(0), false);
		
	}
	
	public String toString() {
		return resultado;
	}
}
