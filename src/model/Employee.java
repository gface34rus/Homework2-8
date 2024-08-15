package model;

public class Employee {
    private String firstName;
    private String middleName;
    private String lastName;
    private int id;
    private double salary;

    public Employee(String firstName, String middleName, String lastName, int id, double salary) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.id = id;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return firstName + " " + middleName + " " + lastName + " (ID: " + id + ", Salary: " + salary + ")";
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Employee) {
            return this.id == ((Employee) obj).id;
        }
        return false;
    }
}

