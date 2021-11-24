package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.DAO;
//import jakarta.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = {"/Controller", "/main","NovaBanda.html"})
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DAO dao = new DAO();

    /**
     * Default constructor. 
     */
    public Controller() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	//	dao.testeConexao();
		
		String requisicao = request.getServletPath();
		System.out.println(requisicao);
		if(requisicao.equals("NovaBanda.html")) {
			banda(request, response);
		}
		
		
		}
	//listar
	protected void banda(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.sendRedirect("NewFile.jsp");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
