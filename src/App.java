
import models.Person;



public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        views.View v = new views.View();
        v.showMenu();
        Person person[];
        v.listarPersonas();


    }
}
