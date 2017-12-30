package webapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login.do")

public class LoginServet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
/*		String name = request.getParameter("name");
		request.setAttribute("name", name);
		
		
		request.setAttribute("password", request.getParameter("password"));
		System.out.println(request.getParameter("name"));
*/		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);

		/*	PrintWriter writer= response.getWriter();
		writer.print("abcdef");
		writer.print("abcdef1");*/
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name = request.getParameter("inputname");
		String password = request.getParameter("inputPassword");
		
		LoginService ls = new LoginService();
		TodoService todoService = new TodoService();
		if(ls.validateUser(name, password)){
			/*request.setAttribute("getName",request.getParameter("inputname"));
			request.setAttribute("todos", todoService.retrieveTodo());
			
			//request.setAttribute("getPassword", request.getParameter("inputPassword"));
			request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);*/
			response.sendRedirect("/todo.do");
		}

		else{
			request.setAttribute("errorMessage", "Invalid user");
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		}
	
	}
	
}
