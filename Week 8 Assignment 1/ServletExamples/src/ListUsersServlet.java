import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ListUsersServlet extends User {
	
	public ListUsersServlet(int id, String name, int age, String location) {
		super(id, name, age, location);
		
	}

	public void doGET(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		
		List<User> user = new ArrayList<>();
		User user1 = new User(1,"ram",22,"Bangalore");
		User user2 = new User(2,"raj",22,"Bangalore");
		User user3 = new User(3,"raghu",22,"Bangalore");
		User user4 = new User(4,"balu",22,"Bangalore");
		user.add(user1);
		user.add(user2);
		user.add(user3);
		user.add(user4);
		
		HttpSession session = req.getSession();
		ServletContext context = req.getServletContext();
		req.setAttribute("user", "user1_details");
		RequestDispatcher rd = req.getRequestDispatcher("/displayUsers.jsp");
		rd.forward(req, res);

}
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int session = res.getStatus();
	}
}
