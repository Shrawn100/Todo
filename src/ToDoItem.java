public class ToDoItem {
    private String description;
    private boolean isDone;

    // Constructor
    public ToDoItem(String description) {
        this.description = description;
        this.isDone = false;
    }

    // Getters
    public String getDescription() {
        return description;
    }

    public boolean isDone() {
        return isDone;
    }

    // Setters
    public void setDescription(String description) {
        this.description = description;
    }

    public void setIsDone(boolean isDone) {
        this.isDone = isDone;
    }
}
