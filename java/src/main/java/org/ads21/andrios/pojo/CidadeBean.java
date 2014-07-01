package org.ads21.andrios.pojo;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.SelectItem;

import org.ads21.andrios.entidade.Cidades;
import org.ads21.andrios.entidade.Estados;
import org.ads21.andrios.persistence.CidadeDao;

@ManagedBean
@SessionScoped
public class CidadeBean {
	
	private Estados estados;
	private Cidades cidades;
	private List<SelectItem> siglaEstados;
	private Integer estadoId;
	
	@PostConstruct
	public void iniciar(){
		estados = new Estados();
		cidades = new Cidades();
		siglaEstados = new ArrayList<SelectItem>();
		
		CidadeDao cidadeDao = new CidadeDao();
		List<Estados> listaEstados = cidadeDao.listarEstados();
		for(Estados e : listaEstados){
			SelectItem item = new SelectItem(e.getId(), e.getNome());
			siglaEstados.add(item);
		}
	}
	public Estados getEstados() {
		return estados;
	}
	public void setEstados(Estados estados) {
		this.estados = estados;
	}
	public Cidades getCidades() {
		return cidades;
	}
	public void setCidades(Cidades cidades) {
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
