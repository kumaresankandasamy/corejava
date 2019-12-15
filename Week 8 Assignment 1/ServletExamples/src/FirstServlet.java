
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class FirstServlet extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		HttpSession session = req.getSession();
		ServletContext context = req.getServletContext();
		req.setAttribute("name", "userlist ");
		RequestDispatcher rd = req.getRequestDispatcher("/.displayUsers.jsp");
		rd.forward(req, res);
		}
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
	}

}
