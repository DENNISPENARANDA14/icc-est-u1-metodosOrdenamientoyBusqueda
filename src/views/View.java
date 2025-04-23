package views;

import java.util.Scanner;
import models.Person;

public class View {
    private Scanner scanner;
    Person person;
    public View() {
        this.scanner = new Scanner(System.in);
        
    }

    public int showMenu(){
        showMessage("MENU PRINCIPAL");
        showMessage("1.- INGRESAR PERSONA");
        
        int op = scanner.nextInt();
        do { 
            switch(op){
                case 1:
                    Person person;
                    //person.Add(inputPerson());
                break;
                case 2:
                break;
    
            }
    
            return op;    
        } while (op != 5);
        
    }

    public Person inputPerson(){
        showMessage("ingrese el nombre:");
        String name = scanner.next();
        showMessage("igrese la edad");
        int age = scanner.nextInt();
        Person person = new Person(name, age);
        return person;
    }
    public void showMessage(String message){
        System.out.println(message);
    }
    public void listarPersonas(){
        
    }
    
}
