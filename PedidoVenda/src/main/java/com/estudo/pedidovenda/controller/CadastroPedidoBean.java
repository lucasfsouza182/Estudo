package com.estudo.pedidovenda.controller;

import java.util.ArrayList;
import java.util.List;
import com.estudo.pedidovenda.service.NegocioException;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;



@Named
@RequestScoped
public class CadastroPedidoBean {

	private List<Integer> items;

	public CadastroPedidoBean() {
		items = new ArrayList<>();
		items.add(1);
	}
	
	public void salvar() {
		throw new NegocioException("Pedido não pode ser salvo, pois ainda não foi implementado.");
	}
	

	public List<Integer> getItems() {
		return items;
	}
}
