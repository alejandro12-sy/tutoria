package pe.edu.upeu.tuto.controler;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pe.edu.upeu.tuto.dao.UsuarioDAO;
import pe.edu.upeu.tuto.daoimpl.UsuarioDaoImpl;

/**
 * Servlet implementation class UsuarioControler
 */
public class UsuarioControler extends HttpServlet {
	private UsuarioDAO udao = new UsuarioDaoImpl();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UsuarioControler() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String user = request.getParameter("usuario");
		String pass = request.getParameter("CONTRASEÑA");
		if(udao.validarUsuario(user, pass)==1) {
			out.println("Bienvenido: "+user);
		}else {
			out.println("Datos incorrectos...!");
		}
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
