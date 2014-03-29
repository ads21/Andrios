package org.ads21.andrios.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Usuario")
public class Usuario {

	@Id
	@Column(name="id_user")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idUser;
	
	@Column(name="user_login")
	private String userLogin;
	@Column(name="user_senha")
	private String userSenha;
	
	public Integer getIdUser() {
		return idUser;
	}
	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}
	public String getUserLogin() {
		return userLogin;
	}
	public void setUserLogin(String userLogin) {
		this.userLogin = userLogin;
	}
	public String getUserSenha() {
		return userSenha;
	}
	public void setUserSenha(String userSenha) {
		this.userSenha = userSenha;
	}
	
	
	
}
