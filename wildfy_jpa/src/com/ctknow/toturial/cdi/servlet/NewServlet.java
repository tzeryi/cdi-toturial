package com.ctknow.toturial.cdi.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ctknow.toturial.cdi.bean.Message;
import com.ctknow.toturial.cdi.bean.MessageB;

/**
 * Servlet implementation class NewServlet
 */
@WebServlet("/cdiservlet")
public class NewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Message message;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewServlet() {
        super();
        message = new MessageB();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().write(message.get());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
