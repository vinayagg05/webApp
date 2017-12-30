package webapp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/deletetodo.do")
public class DeleteTodoServlet extends HttpServlet{
	
private static final long SerialVersionUID = 1L;
	TodoService todoService = new TodoService();
	
	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		todoService.deleteTodo(request.getParameter("todo"));
		response.sendRedirect("/todo.do");
	
	}


}
