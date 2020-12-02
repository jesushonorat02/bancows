package com.banco.servlets;

import java.io.BufferedReader;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Servlet implementation class GestorServlet
 */
@WebServlet("/Gestor")
public class GestorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GestorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		
		response.setContentType("application/json");

		JSONArray gestores = new JSONArray();
		
		JSONObject json = new JSONObject();
		json.put("ok", true);
		json.put("msg", "");
		
		
		JSONObject gestor1 = new JSONObject();
		gestor1.put("id",1);
		gestor1.put("usuario","gestor1");
		gestor1.put("email","gestro1@gmail.com");
		gestores.put(gestor1);
		
		
		JSONObject gestor2 = new JSONObject();
		gestor2.put("id",2);
		gestor2.put("usuario","gestor2");
		gestor2.put("email","gestro2@gmail.com");
		gestores.put(gestor2);
		
		JSONObject gestor3 = new JSONObject();
		gestor3.put("id",3);
		gestor3.put("usuario","gestor3");
		gestor3.put("email","gestro3@gmail.com");
		gestores.put(gestor3);
		
		json.put("data", gestores);		
		response.getWriter().append(json.toString());
	
	}

	
	
	
	
	
	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String metodo = request.getMethod();
		System.out.println(metodo);
		
		// body
		BufferedReader reader = request.getReader();
		StringBuilder body = new StringBuilder();
		String line = null;
		while ((line = reader.readLine()) != null) {
			body.append(line);
		}
		System.out.println(body);
		JSONObject jsonBody = new JSONObject(body.toString());
		System.out.println(jsonBody.get("email"));
	}
}
