package com.banco.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Servlet implementation class clienteServlet
 */
@WebServlet("/cliente")
public class clienteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public clienteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	
	
	
	
	
		response.setContentType("application/cliente");

		JSONArray clientes = new JSONArray();
		
		JSONObject cliente = new JSONObject();
		cliente.put("ok", true);
		cliente.put("msg", "");
		
		
		JSONObject cliente1 = new JSONObject();
		cliente1.put("id",1);
		cliente1.put("usuario","cliente1");
		cliente1.put("email","cliente1@gmail.com");
		clientes.put(cliente1);
		
		
		JSONObject cliente2 = new JSONObject();
		cliente2.put("id",2);
		cliente2.put("usuario","cliente2");
		cliente2.put("email","cliente2@gmail.com");
		clientes.put(cliente2);
		
		JSONObject cliente3 = new JSONObject();
		cliente3.put("id",3);
		cliente3.put("usuario","cliente3");
		cliente3.put("email","cliente3@gmail.com");
		clientes.put(cliente3);
		
		cliente.put("data", clientes);		
		response.getWriter().append(clientes.toString());
	
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
