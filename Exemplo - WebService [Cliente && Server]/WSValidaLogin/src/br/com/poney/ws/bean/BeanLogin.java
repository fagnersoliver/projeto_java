package br.com.poney.ws.bean;

import java.io.Serializable;

public class BeanLogin implements Serializable {

	private static final long serialVersionUID = 1603611183652771397L;
		
	private String usuario;
	private String password;
	private String mensaje;
	private Boolean status;

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

}
