package collectionsqueue;

import java.util.*;

public class ToDoList {

    private List<ToDo> todos = new ArrayList<>();


    public void addToDos(ToDo toDo) {
        todos.add(toDo);
    }

    public List<ToDo> getTodos() {
        return new ArrayList<>(todos);
    }

    public Deque<ToDo> getTodosInUrgencyOrder() {
        Deque<ToDo> result = new ArrayDeque<>();
        for (ToDo t : todos) {
            if (t.isUrgent()) {
                result.addFirst(t);
            } else {
                result.addLast(t);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        ToDoList toDoList = new ToDoList();
        toDoList.addToDos(new ToDo("a", false));
        toDoList.addToDos(new ToDo("c", true));
        toDoList.addToDos(new ToDo("m", false));
        toDoList.addToDos(new ToDo("o", true));
        toDoList.addToDos(new ToDo("b", true));
        toDoList.addToDos(new ToDo("l", false));

        Deque<ToDo> result = toDoList.getTodosInUrgencyOrder();
        System.out.println(result);
        System.out.println(result.pop());
        System.out.println(result.pop());
        System.out.println(result.pop());
        System.out.println(result.pop());
        System.out.println(result);
    }
}
