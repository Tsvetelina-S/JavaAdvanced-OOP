package ValidationData;

import java.text.DecimalFormat;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;


    public Person(String firstName, String lastName, int age, double salary) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
        this.setSalary(salary);
    }


    public void setFirstName(String firstName) {
        if(firstName.length() < 3){
            throw new IllegalArgumentException("Firs name cannot be less than 3 symbols");
        }
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        if(firstName.length() < 3){
            throw new IllegalArgumentException("Last name cannot be less than 3 symbols");
        }
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setAge(int age) {
        if(age <= 0){
            throw new IllegalArgumentException("Age cannot be zero or negative integer");
        }
        this.age = age;
    }

    public void setSalary(double salary) {
        if(salary < 460){
            throw new IllegalArgumentException("Salary cannot be less than 460 leva");
        }
        this.salary = salary;
    }
    public void increaseSalary(double bonus){
        if(this.age > 30) {
            this.salary = (this.salary + (this.salary * bonus / 100));
        }else{
            this.salary = (this.salary + (this.salary * bonus / 200));
        }
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.0####");
        return String.format("%s %s gets %s leva",this.firstName,this.lastName,df.format(this.getSalary()));
    }
}
