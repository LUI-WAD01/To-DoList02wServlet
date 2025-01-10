package ToDoSer.pkg;

public class TodoItem {
	private String description;

	
	private boolean completed;
	public TodoItem(String description) {
		this.description = description;
		this.completed = false;
	}
	
	
	public String getDescription() {
		return description;
	}

	
	
	public boolean isCompleted() {
		return completed;
	}
	public void setCompleted(boolean completed) {
		this.completed = completed;
	}
}
