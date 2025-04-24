package controllers;
import models.Person;
import views.View;


public class SearchMethods {
    private Person [] people;
    private View View;
    
    public SearchMethods(Person[] people) {
        this.people = people;
        View = new View();
    }

    public int binarySearchByAge(int age){
        for (int i = 0; i < people.length; i++) {
            if (age == people[i].getAge()) {
                return i;
            }
        }
        return -1;
    }

    public int binarySearchByName(String name){
        for (int i = 0; i < people.length; i++) {
            if (name.equals(people[i].getName())) {
                return i;
            }
        }
        return -1;
   }

   public void isSortedByName(){
    String nameToFind = View.inputName();
    int indexPerson = binarySearchByName(nameToFind);
    if (indexPerson != -1) {
        View.showMessage("LA PERSONA "+nameToFind+" encontrada");
        View.showMessage(people[indexPerson].toString()+"");
        } else {
            View.showMessage("LA PERSONA "+nameToFind+" no encontrada");
    }
}
}
