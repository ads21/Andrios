package org.ads21.andrios.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Eventos")
public class Eventos {
	
	@Id
	@Column(name="ev_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idEvento;
	
	@Column(name="ev_nome", length=30)
	private String nomeEvento;

	private Integer endEvento;
	private Integer numEvento;
	private Integer barEvento;
	private Integer cidEvento;
	private Integer ufEvento;
	private Date dataEvento;
	private Double precoEvento;
	private Integer orgEvento;
	private Integer areaEvento;
	private String descEvento;
	private Boolean ativo;
	private String imgEvento;
	
	
	public Integer getIdEvento() {
		return idEvento;
	}
	public void setIdEvento(Integer idEvento) {
		this.idEvento = idEvento;
	}
	public String getNomeEvento() {
		return nomeEvento;
	}
	public void setNomeEvento(String nomeEvento) {
		this.nomeEvento = nomeEvento;
	}
	public Integer getEndEvento() {
		return endEvento;
	}
	public void setEndEvento(Integer endEvento) {
		this.endEvento = endEvento;
	}
	public Integer getNumEvento() {
		return numEvento;
	}
	public void setNumEvento(Integer numEvento) {
		this.numEvento = numEvento;
	}
	public Integer getBarEvento() {
		return barEvento;
	}
	public void setBarEvento(Integer barEvento) {
		this.barEvento = barEvento;
	}
	public Integer getCidEvento() {
		return cidEvento;
	}
	public void setCidEvento(Integer cidEvento) {
		this.cidEvento = cidEvento;
	}
	public Integer getUfEvento() {
		return ufEvento;
	}
	public void setUfEvento(Integer ufEvento) {
		this.ufEvento = ufEvento;
	}
	public Date getDataEvento() {
		return dataEvento;
	}
	public void setDataEvento(Date dataEvento) {
		this.dataEvento = dataEvento;
	}
	public Double getPrecoEvento() {
		return precoEvento;
	}
	public void setPrecoEvento(Double precoEvento) {
		this.precoEvento = precoEvento;
	}
	public Integer getOrgEvento() {
		return orgEvento;
	}
	public void setOrgEvento(Integer orgEvento) {
		this.orgEvento = orgEvento;
	}
	public Integer getAreaEvento() {
		return areaEvento;
	}
	public void setAreaEvento(Integer areaEvento) {
		this.areaEvento = areaEvento;
	}
	public String getDescEvento() {
		return descEvento;
	}
	public void setDescEvento(String descEvento) {
		this.descEvento = descEvento;
	}
	public Boolean getAtivo() {
		return ativo;
	}
	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
	public String getImgEvento() {
		return imgEvento;
	}
	public void setImgEvento(String imgEvento) {
		this.imgEvento = imgEvento;
	}

}
