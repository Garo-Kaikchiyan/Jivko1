package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;
import model.dao.IUserDAO;
import model.dao.IUserDAO.DataSource;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.sendRedirect("Register/register.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User u = new User(request.getParameter("firstName"),
							request.getParameter("lastName"),
							request.getParameter("username"),
							request.getParameter("password"),
							request.getParameter("email"));
		List<User> users = null;
		request.getSession().removeAttribute("errorMsg");
		try {
			users = IUserDAO.getDAO(DataSource.DB).getAllUsers();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(!validateEmail(u.getEmail())){
			request.getSession().setAttribute("errorMsg", "Invalid E-mail");
			response.sendRedirect("Register/register.jsp");
			//getServletContext().getRequestDispatcher("/Register/register.jsp").forward(request, response);
			return;
		}
		if(!validateUsername(u.getUsername(), users)){
			request.getSession().setAttribute("errorMsg", "Username already in use");
			response.sendRedirect("Register/register.jsp");
			//getServletContext().getRequestDispatcher("/Register/register.jsp").forward(request, response);
			return;
		}
		String msg = validatePassword(u.getPassword(), request.getParameter("rePassword"));	
		if(!msg.equals("")) {
			request.getSession().setAttribute("errorMsg", msg);
			response.sendRedirect("Register/register.jsp");
			//getServletContext().getRequestDispatcher("/Register/register.jsp").forward(request, response);
			return;
		}
			
		
		IUserDAO.getDAO(DataSource.DB).addUser(u);
		
	}

	private boolean validateEmail(String email) {
		for(int i = 1; i < email.length(); i++){
			if(email.charAt(i) == '@')
				return true;
		}
		if(email == "")
			return false;
		return false;
	}

	private boolean validateUsername(String username,  List<User> users) {
		for(User u: users){
			if(u.getUsername().equals(username))
				return false;
		}
		if(username == "")
			return false;
		return true;
	}
	
	private String validatePassword(String password, String rePassowrd){
		boolean upper = false, lower = false;
		if(!password.equals(rePassowrd))
			return "Password mismatch";
		if(password.length() < 6)
			return "Password must be atleast six characters long";
		for(char c: password.toCharArray()){
			if(c >= 'A' && c <= 'Z'){
				upper = true;
				break;
			}
		}
		for(char c: password.toCharArray()){
			if(c >= 'a' && c <= 'z'){
				lower = true;
				break;
			}
		}
		if(!upper)
			return "Password must have atleast one uppercase letter";
		if(!lower)
			return "Password must have atleast one lowercase letter";
		return "";
	}

}
