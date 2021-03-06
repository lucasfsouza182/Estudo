package com.estudo.pedidovenda.controller;

import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;


@Named
@RequestScoped
public class PesquisaProdutosBean {

	private List<Integer> produtosFiltrados;

	public PesquisaProdutosBean() {
		produtosFiltrados = new ArrayList<>();
		for(int i = 0; i < 50 ; i++){
			produtosFiltrados.add(i);
		}
	}

	public List<Integer> getProdutosFiltrados() {
		return produtosFiltrados;
	}
}
