package com.buscas.largura;

import java.util.ArrayList;
import java.util.List;

import com.listas.adjacentes.*;

public class BFS {
	private List<Vertice> fila;
	private String resultado;
	private String auxCor;

	public BFS() {
		this.fila = new ArrayList<Vertice>();
		this.resultado = "";
		this.auxCor = "b";
	}
	
	public void iniciarBusca(Vertice vertice, boolean verticeOrigem) {
		if(verticeOrigem) fila.add(vertice);
		
		Vertice newVertice = fila.get(0);
		
		newVertice.setCor("c");
		
		newVertice.settInicial((verticeOrigem) ? 0 : newVertice.getPi().gettInicial() + 1);
		
		setResultado(newVertice);
		
		newVertice.getAdjacencias().forEach(adjacencia -> {
			if (adjacencia.getDestino().getCor() == "b") {
				adjacencia.getDestino().setPi(newVertice);
				
				fila.add(adjacencia.getDestino());
			}
		});
		
		newVertice.setCor("p");
		
		setResultado(newVertice);
		
		fila.remove(0);
		
		if (!fila.isEmpty()) {
			
			iniciarBusca(fila.get(0), false);
		}
	}
	
	private void setResultado(Vertice vertice) {
		this.resultado += "---------------------------------\n";
		this.resultado += "BFS(" + vertice.getNome() + ")\n";
		this.resultado += "Cor: " + vertice.getCor() + "\n";
		this.resultado += (vertice.getPi() == null) ? "Antecessor: \n" : "Antecessor: " + vertice.getPi().getNome() + "\n";
		this.resultado += "Tempo Inicial: " + vertice.gettInicial() + "\n";
	}
	
	public String toString() {
		return resultado;
	}
}
