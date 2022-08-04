package SalaryIncrease;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;


    public Person(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }
    public void increaseSalary(double bonus){
        bonus /= 100;
        if(this.age < 30){
            bonus /= 2;
        }
        setSalary( this.salary + (this.salary * bonus));
    }

    @Override
    public String toString() {
        return String.format("%s %s gets %.1f leva",this.firstName,this.lastName,this.salary);
    }
}
