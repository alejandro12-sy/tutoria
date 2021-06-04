package pe.edu.upeu.tuto.dao;

import java.util.List;

import pe.edu.upeu.tuto.entity.Usuario;

public interface UsuarioDAO {
	public int validarUsuario(String user, String pass);
	public int createUser(Usuario u);
	public int updateUser(Usuario u);
	
	public int deleteUser(int id);
	public Usuario readUser(int id);
	public List<Usuario> readAll();
}
