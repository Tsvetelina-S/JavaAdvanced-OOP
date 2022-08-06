package Abstraction.StudentSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Person> students = new ArrayList<>();
       // Person person = null;
        String input = scan.nextLine();
        while (!input.equals("Exit")){
            String [] inputInfo = input.split("\\s+");
            String command = inputInfo[0];
            String name = inputInfo[1];
            switch (command){
                case "Create":
                    int age = Integer.parseInt(inputInfo[2]);
                    double grade = Double.parseDouble(inputInfo[3]);
                   Person person = new Person(name,age,grade);
                    students.add(person);
                    break;
                case "Show":
                    for (Person student: students) {
                        if(student.getName().equals(name)){
                            System.out.printf("%s is %d years old. ",student.getName(),student.getAge());
                            if (student.getGrade() >= 5) {
                                System.out.println("Excellent student.");
                            } else if (student.getGrade() < 5 && student.getGrade() >= 3.50) {
                                System.out.println("Average student.");
                            } else {
                                System.out.println("Very nice person.");
                            }
                        }
                    }
                    break;
            }

            input = scan.nextLine();
        }

    }
}
