package pe.edu.upeu.tuto.entity;

public class Usuario {
	int idusuario;
	String usuario;
	String CONTRASE�A;
	int estado;
	public Usuario() {
		
	}
	public Usuario(String usuario, String cONTRASE�A, int estado) {
		
		this.usuario = usuario;
		CONTRASE�A = cONTRASE�A;
		this.estado = estado;
	}
	public int getIdusuario() {
		return idusuario;
	}
	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getCONTRASE�A() {
		return CONTRASE�A;
	}
	public void setCONTRASE�A(String cONTRASE�A) {
		CONTRASE�A = cONTRASE�A;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	
	
}
