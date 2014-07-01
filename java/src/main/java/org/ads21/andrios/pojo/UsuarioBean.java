package org.ads21.andrios.pojo;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.ads21.andrios.entidade.Usuario;

@ManagedBean
@ViewScoped
public class UsuarioBean {
	
	private Usuario usuario = new Usuario();
	
	public void cadastrarUsuario(){
		
	}
	public void excuirUsuario(){
		
	}
	public String alterarUsuario(){
		return "";
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}
