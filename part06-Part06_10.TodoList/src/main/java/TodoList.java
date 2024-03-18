import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> todos;
    
    public TodoList(){
        this.todos = new ArrayList<String>();
    }
    
    public void add(String task){
        this.todos.add(task);
    }
    
    public void remove(int number){
        this.todos.remove(number - 1);
    }
    
    public void print(){
        for(String todo : todos){
            System.out.println((todos.indexOf(todo) + 1) + ": " + todo);
        }
    }

    public boolean isEmpty() {
        if(this.todos != null) {
            return true;
        }
        return false;
    }
    public TodoList(TodoList list) {
    // TODO Auto-generated constructor stub

}    
}

