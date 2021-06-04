package pe.edu.upeu.tuto.entity;

public class Usuario {
	int idusuario;
	String usuario;
	String CONTRASEÑA;
	int estado;
	public Usuario() {
		
	}
	public Usuario(String usuario, String cONTRASEÑA, int estado) {
		
		this.usuario = usuario;
		CONTRASEÑA = cONTRASEÑA;
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
	public String getCONTRASEÑA() {
		return CONTRASEÑA;
	}
	public void setCONTRASEÑA(String cONTRASEÑA) {
		CONTRASEÑA = cONTRASEÑA;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	
	
}
