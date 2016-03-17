package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;
import model.dao.IUserDAO;
import model.dao.IUserDAO.DataSource;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getSession().getAttribute("loggedUser") != null){
			User u = (User)(request.getSession().getAttribute("loggedUser"));
			response.getWriter().append("Already logged as " + u.getUsername());
			return;
		}
			
		response.sendRedirect("Login/login.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		try {
			for(User u : IUserDAO.getDAO(DataSource.DB).getAllUsers()){
				if(u.getUsername().equals(username) && u.getPassword().equals(password)){
					request.getSession().setAttribute("loggedUser", u);

					response.sendRedirect("Main.jsp");
					return;
				} 
			}	
				request.getSession().setAttribute("errorLogin", "Incorrect username or password. Please try again.");
			//response.sendRedirect("Login/login.html");
		} catch (SQLException e) {
			response.sendRedirect("Login/login.jsp");
		}
		
	}

}
