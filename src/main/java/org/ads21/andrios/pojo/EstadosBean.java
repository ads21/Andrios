package org.ads21.andrios.pojo;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.ads21.andrios.entidade.Estados;

@ManagedBean
@ViewScoped
public class EstadosBean {
	
	private Estados estados = new Estados();	
	
	public Estados getEstados() {
		return estados;
	}

	public void setEstados(Estados estados) {
		this.estados = estados;
	}
	
}
