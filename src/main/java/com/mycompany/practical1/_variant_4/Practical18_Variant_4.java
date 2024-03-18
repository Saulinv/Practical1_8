
package com.mycompany.practical1._variant_4;


public class Practical18_Variant_4 {

    public static void main(String[] args) {
        System.out.println("Practical 1.8 Saulin Ivan RIBO-01-22 Variant 4");
        PersonList personList = new PersonList();
        personList.printSortedPersons();
        // Добавление новых пропусков
        personList.addPerson(445566, "Петров Петр Петрович", "монтажник", true);
        personList.printSortedPersons();
    }
}
