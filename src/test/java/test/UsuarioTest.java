package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import pe.edu.upeu.tuto.dao.UsuarioDAO;
import pe.edu.upeu.tuto.daoimpl.UsuarioDaoImpl;


public class UsuarioTest {
	private UsuarioDAO udao;
	@Before
	public void befo() {
		udao = new UsuarioDaoImpl();
	}
	/**/
	@Test
	public void test() {
		int  x = udao.validarUsuario("alejandro", "111111");
		int esperado = 1;
		assertEquals(esperado, x);;
		
	}

}
