package org.ads21.andrios.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.SelectItem;

import org.ads21.andrios.entidade.Cidade;


@ManagedBean
@SessionScoped
public class CidadeBean {
	
	private Cidade cidades;
	private List<SelectItem> siglaEstados;
	private Integer estadoId;
	
	@PostConstruct
	public void iniciar(){
		
	
	}
	public Cidade getCidades() {
		return cidades;
	}
	public void setCidades(Cidade cidades) {
		this.cidades = cidades;
	}
	public List<SelectItem> getSiglaEstados() {
		return siglaEstados;
	}
	public void setSiglaEstados(List<SelectItem> siglaEstados) {
		this.siglaEstados = siglaEstados;
	}
	public Integer getEstadoId() {
		return estadoId;
	}
	public void setEstadoId(Integer estadoId) {
		this.estadoId = estadoId;
	}	
}
