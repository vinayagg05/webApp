package webapp;

import java.util.List;
import java.util.ArrayList;

public class TodoService {

	private static List<Todo> todo = new ArrayList();
	static{
		
		todo.add(new Todo("Learn web application"));
		todo.add(new Todo("Learn Spring"));
		todo.add(new Todo("Learn Spring MVC"));
	}

	
	public List<Todo> retrieveTodo(){
		return todo;
	}
	
	public void addTodo(String todos){
todo.add(new Todo(todos));		
	}
	
	public void deleteTodo(String t){
		todo.remove(new Todo(t));
	}
	
}
