package webapp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/todo.do")
public class TodoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private TodoService todoService = new TodoService();
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("todos",todoService.retrieveTodo());
		request.getRequestDispatcher("/WEB-INF/views/todo.jsp").forward(request, response);
		
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		String inputTodo =  request.getParameter("todo");
		
		if("".equals(inputTodo)){
			request.setAttribute("errorMessage", "Enter a valid Todo");
		}
		else{
			todoService.addTodo(inputTodo);
		}
		// TODO Auto-generated method stub

	request.setAttribute("todos",todoService.retrieveTodo());
	request.getRequestDispatcher("/WEB-INF/views/todo.jsp").forward(request, response);;
	
	}


}
