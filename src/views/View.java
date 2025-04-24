package views;

import java.util.Scanner;
import models.Person;

public class View {
    private Scanner scanner;
    Person person;
    public View() {
        this.scanner = new Scanner(System.in);
        
    }

    public int  showMenu(){
        int op;
        while(true){
        showMessage("MENU PRINCIPAL");
        showMessage("1.- INGRESAR PERSONA");
        showMessage("2.- IMPRIMIR PERSONAS");
        showMessage("3.- SELECCIONAR METODO DE ORDENAMIENTO");
        showMessage("4.- SELECCIONAR METODO DE BUSCA");
        showMessage("5.- SALIR");
        showMessage("INGRESE SU OPCION");
        try {
            String entrada = scanner.nextLine();
            op = Integer.parseInt(entrada);
            return op; // Si la conversión es exitosa, salimos del bucle
        } catch (NumberFormatException e) {
            showMessage("Error: Por favor, ingrese un número válido.");
        }
        
        }
    }

    public Person inputPerson(){
        String name=inputName();
        int age = inputAge();
        Person person= new Person(name,age);
        person.setName(name);
        person.setAge(age);
        return person;
    }

    public void showMessage(String message){
        System.out.println(message);
    }
    public void displayPersons(String[] person){
           for (int i = 0; i < person.length; i++) {
                System.out.println(person[i].toString());
           }
    }
    public int selectSortingMethod(){
        int op;
        while(true){
            showMessage("METODOS DE ORDENAMIENTO");
            showMessage("1.- ORDENAR POR NOMBRE CON METODO BURBUJA");
            showMessage("2.- ORDENAR POR NOMBRE CON METODO SELECCION");
            showMessage("3.- ORDENAR POR EDAD CON METODO INSERCION");
            showMessage("4.- ORDENAR POR NOMBRE CON METODO INSERCION");
            try {
                String entrada = scanner.nextLine();
                op = Integer.parseInt(entrada);
                return op; // Si la conversión es exitosa, salimos del bucle
            } catch (NumberFormatException e) {
                showMessage("Error: Por favor, ingrese un número válido.");
            }
        }    
    }

    public int selectSearchCriterion(){
        int op;
        while(true){
            showMessage("METODOS DE ORDENAMIENTO");
            showMessage("1.- ORDENAR POR NOMBRE CON METODO BURBUJA");
            showMessage("2.- ORDENAR POR NOMBRE CON METODO SELECCION");
            showMessage("3.- ORDENAR POR EDAD CON METODO INSERCION");
            showMessage("4.- ORDENAR POR NOMBRE CON METODO INSERCION");
            try {
                String entrada = scanner.nextLine();
                op = Integer.parseInt(entrada);
                return op; // Si la conversión es exitosa, salimos del bucle
            } catch (NumberFormatException e) {
                showMessage("Error: Por favor, ingrese un número válido.");
            }
        }
    }

    public void displaySearchResult(Person[] persons){

    }
    public int inputAge(){
        int numero;

        while (true) {
            try {
                showMessage("Ingrese la edad: ");
                String entrada = scanner.nextLine();
                numero = Integer.parseInt(entrada);
                return numero; // Si la conversión es exitosa, salimos del bucle
            } catch (NumberFormatException e) {
                showMessage("Error: Por favor, ingrese un número válido.");
            }
        }

    }

    public String inputName(){
        showMessage("Ingrese el nombre: ");
        String nombre = scanner.next();
        while(true){
            if (nombre.matches("^[a-zA-Z]*$")) {
                showMessage("El texto contiene solo letras.");
            return nombre;
        } else {
            showMessage("El texto no contiene solo letras.");
        }
        }
    }

    
}
