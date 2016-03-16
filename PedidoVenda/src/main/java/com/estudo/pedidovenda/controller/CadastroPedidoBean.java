package com.estudo.pedidovenda.controller;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class CadastroPedidoBean {

	private List<Integer> items;

	public CadastroPedidoBean() {
		items = new ArrayList<>();
		items.add(1);
	}

	public List<Integer> getItems() {
		return items;
	}
}
