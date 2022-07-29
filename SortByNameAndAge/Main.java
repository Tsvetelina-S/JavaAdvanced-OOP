package SortByNameAndAge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfPpl = Integer.parseInt(scan.nextLine());

        List<Person> people = new ArrayList<>();

        for (int i = 0; i < numberOfPpl; i++) {

            String[] input = scan.nextLine().split(" ");
            String firstName = input[0];
            String lastName = input[1];
            int age = Integer.parseInt(input[2]);
            double salary = Double.parseDouble(input[3]);

            people.add(new Person(firstName,lastName,age,salary));

        }
        Collections.sort(people, (firstPerson, secondPerson) -> {
            int sComp = firstPerson.getFirstName().compareTo(secondPerson.getFirstName());

            if (sComp != 0) {
                return sComp;
            } else {
                return Integer.compare(firstPerson.getAge(), secondPerson.getAge());
            }
        });


        double bonus = Double.parseDouble(scan.nextLine())/100;

        for (Person person : people) {
            person.increaseSalary(bonus);
            System.out.println(person.toString());

        }
    }
}
