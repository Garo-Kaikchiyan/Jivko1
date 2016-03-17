package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.fabric.Response;

import model.User;
import model.dao.IUserDAO;
import model.dao.IUserDAO.DataSource;

/**
 * Servlet implementation class ProfileServlet
 */
@WebServlet("/ProfileServlet")
public class ProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		User loggedUser = (User) request.getSession().getAttribute("loggedUser");
		pw.append("<html>");
		pw.append("<title>Profile of "+loggedUser.getUsername()+"</title>");
		pw.append("<form method = \"post\" action=\"ProfileServlet\">");
		pw.append("<br>Username = " + loggedUser.getUsername());
		pw.append("<br>Name<input type=\"text\" name=\"name\" value=\""+loggedUser.getUsername()+"\">");
		pw.append("<br>Password<input type=\"password\" name=\"password\" value=\""+loggedUser.getPassword()+"\">");
		pw.append("<br>Email<input type=\"text\" name=\"email\" value=\""+loggedUser.getUsername()+"\">");
		pw.append("<br><input type=\"submit\" value=\"save changes\">");
		pw.append("</form>");
		pw.append("</html>");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String password = req.getParameter("password");
		String email = req.getParameter("email");
		String name = req.getParameter("name");
		if(password.isEmpty() || email.isEmpty() || name.isEmpty()){
			return;
		}
		if(validMail(email) && validPass(password)){
			//update dao
			User loggedUser = (User) req.getSession().getAttribute("loggedUser");
			loggedUser.setPassword(password);
			loggedUser.setEmail(email);
			loggedUser.setFirstName(name);
			IUserDAO.getDAO(DataSource.DB).updateUser(loggedUser);
		}
		else
			return;
		//validateData();
	}

	private boolean validPass(String password) {
		
		return true;
	}

	private boolean validMail(String email) {
		
		return true;
	}

}
