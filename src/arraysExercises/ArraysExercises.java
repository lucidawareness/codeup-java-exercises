package arraysExercises;

import main.Person;

import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
//        To string needed due to array containing only int's.
        System.out.println(Arrays.toString(numbers));

        Person[] persons = new Person[3];

        persons[0] = new Person("Irvin");
        persons[1] = new Person("Julia");
        persons[2] = new Person("Mike");

        for (Person person : persons) {
            System.out.println(person.getName());
        }

        System.out.println("New array");

        Person person = new Person("Lilly");

        Person[] persons2 = addPerson(persons, person);

        for (Person person2 : persons2) {
            System.out.println(person2.getName());
        }


    }


    public static Person[] addPerson(Person[] persons, Person person) {
        Person[] newPersons = Arrays.copyOf(persons, persons.length + 1);
        newPersons[newPersons.length - 1] = person;
        return newPersons;
    }
}
