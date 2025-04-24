
import java.util.ArrayList;
import java.util.List;
import models.Person;



public class App {
    List<Person> personas = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        views.View v = new views.View();

        List<Person> personas = new ArrayList<>();
        personas.add(new Person("JUAN",19));
        personas.add(new Person("JUAN",19));
        personas.add(new Person("PEDRO",34));
        personas.add(new Person("MARIA",37));
        personas.add(new Person("LUISA",45));
        personas.add(new Person("ELIZABETH",16));
        personas.add(new Person("CAARLOS",29));
        personas.add(new Person("DENNIS",28));
        System.out.println("hola");
        System.out.println(personas);
        while (true) { 
            int op = v.showMenu();
            switch (op) { 
                case 1:
                    v.inputPerson();
                    break;
                case 2:
                    //String[] person1 = personas.toArray(new String[8]);
                    //String[] person1 = personas.toArray(new String[personas.size()]);
                    Person[] person1 = personas.toArray();
                    v.displayPersons(person1);   
                    break;
                case 3:
                        
                break;
                default:
                    throw new AssertionError();
            }
            
        }
    }
}
