package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> todos = new ArrayList<>();
        boolean exit = false;
        String todo="";
        while (!todo.equals("x")) {
            System.out.print("Adja meg a következő todo-t! Befejezés 'x'-el!:");
            todo = scanner.nextLine();
            if (!todo.equals("x")) {
                todos.add(todo);
            }
        }

        Path path = Paths.get("training-solutions/src/main/resources/todos.txt");
        try {
            Files.write(path, todos);
        } catch (IOException e) {
            throw new IllegalStateException("Error writing file.", e);
        }
    }
}
