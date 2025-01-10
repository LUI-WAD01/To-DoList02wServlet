package ToDoSer.pkg;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Servlet implementation class ToDoServlet
 */

public class ToDoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private List<TodoItem> todoList;

	public void addDefaultItem(TodoItem item) {
		todoList.add(item);
	}
	
//	init means initialization, init method means what happens before your applet even loads
//	or does anything at all, this is what happen first.
//	Use the init method to perform whatever you need to perform before the applet actually loads.
	@Override
	public void init() throws ServletException {
		todoList = new ArrayList<>();
	}
	
//    /**
//     * @see HttpServlet#HttpServlet()
//     */
//    public ToDoServlet() {
//        super();
//        // TODO Auto-generated constructor stub
//    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if("add".equals(action)) {
			String description = request.getParameter("description");
			todoList.add(new TodoItem(description));
			
			
		} else if ("complete".equals(action)) {
			int index = Integer.parseInt(request.getParameter("index"));
			todoList.get(index).setCompleted(true);
		}
		response.sendRedirect("todo.jsp");
	}

}
