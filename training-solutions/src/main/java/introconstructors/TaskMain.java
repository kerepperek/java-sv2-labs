package introconstructors;

public class TaskMain {

    public static void main(String[] args) {
        Task task= new Task("Első kód megírása.","A programterv alapján hozd létre az osztályokat.");
        task.start();
        task.setDuration(10);

        System.out.println("Cím: "+task.getTitle());
        System.out.println("Leírás: "+task.getDescription());
        System.out.println("Kezdődik: "+task.getStartDateTime());
        System.out.println("Tartama: "+task.getDuration()+" perc.");

    }
}
