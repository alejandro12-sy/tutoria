package test;

import static org.junit.Assert.*;

import java.sql.Connection;

import org.junit.Test;

import pe.edu.upeu.tuto.config.Conexion;

public class Conexiontest {

	@Test
	public void test() {
		Connection cx = Conexion.getConexion();
		System.out.println(cx);
		assertEquals(null, cx);
	
		
		
	}

}
