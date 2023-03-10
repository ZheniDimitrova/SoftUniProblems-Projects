package exercise_P06_OrderByAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Person> personList = new ArrayList<>();

        while (!input.equals("End")) {
            String[] personData = input.split(" ");

            String name = personData[0];
            String id = personData[1];
            int age = Integer.parseInt(personData[2]);

            Person person = new Person(name, id, age);
            personList.add(person);
            personList.sort(Comparator.comparing(Person::getAge));

            input = scanner.nextLine();
        }

        for (Person person : personList) {
            System.out.println(person);

        }

    }
}
