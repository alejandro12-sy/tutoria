package pe.edu.upeu.tuto.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import pe.edu.upeu.tuto.config.Conexion;
import pe.edu.upeu.tuto.dao.UsuarioDAO;
import pe.edu.upeu.tuto.entity.Usuario;

public class UsuarioDaoImpl implements UsuarioDAO {
	private PreparedStatement ps;
	private ResultSet rs;
	private Connection cx =null;
	
	@Override
	public int validarUsuario(String user, String pass) {
		String SQL = "select *from usuario where usuario=? and CONTRASEÑA=?";
		int x = 0;
		try {
			cx = Conexion.getConexion();
			ps = cx.prepareStatement(SQL);
			ps.setString(1, user);
			ps.setString(2, pass);
			rs = ps.executeQuery();
			while(rs.next()) {
				x = 1;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: "+e);
		}
		return x;
	}

	@Override
	public int createUser(Usuario u) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateUser(Usuario u) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteUser(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Usuario readUser(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuario> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
