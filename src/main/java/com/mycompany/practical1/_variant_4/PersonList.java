
package com.mycompany.practical1._variant_4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;


    


public class PersonList {
    ArrayList<Person> persList;

    public PersonList() {
        persList = new ArrayList<>();
        // Заполнение начальными значениями
        persList.add(new Person(445566, "Антонов Андрей Антонович", "сантехник", false));
        persList.add(new Person(112134, "Иванов Иван Иванович", "директор", true));
        persList.add(new Person(306306, "Яковлева Юлия Аристарховна", "секретарь", false));
    }

    public void addPerson(int number, String fullName, String job, boolean accessAllowed) {
        for (Iterator<Person> iterator = persList.iterator(); iterator.hasNext();) {
            Person pers = iterator.next();
            if (pers.number == number) {
                if (!pers.getFullName().equals(fullName)) {
                    iterator.remove();
                    break;
                } else {
                    System.out.println("Пропуск с таким номером и ФИО уже существует");
                    return;
                }
            }
        }
        persList.add(new Person(number, fullName, job, accessAllowed));
    }

    public void printSortedPersons() {
        ArrayList<Person> sortedListByName = new ArrayList<>(persList);
        sortedListByName.sort(Comparator.comparing(p -> p.getFullName()));
        System.out.println("Сортировка по ФИО:");
        for (Person pers : sortedListByName) {
            System.out.println(pers);
        }

        ArrayList<Person> sortedListByNumber = new ArrayList<>(persList);
        sortedListByNumber.sort(Comparator.comparingInt(p -> p.number));
        System.out.println("Сортировка по номеру пропуска:");
        for (Person pers : sortedListByNumber) {
            System.out.println(pers);
        }
    }

}
