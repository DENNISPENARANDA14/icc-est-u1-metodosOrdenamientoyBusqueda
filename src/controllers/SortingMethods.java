package controllers;

import models.Person;

public class SortingMethods {
    public void sortByNameWithBubble(Person[] person){
        String aux;
        for(int i=0 ; i<person.length; i++){
            for(int j=i+1;j<person.length;j++){
                if (person[i].getName().equals(person[j].getName())) {
                  aux=person[j].getName();
                  person[j].setName(person[i].getName());
                  person[i].setName(aux);  
                }
            }
        }
        System.out.println();
   }
}
