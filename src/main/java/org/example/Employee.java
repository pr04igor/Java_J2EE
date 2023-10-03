package org.example;
public class Employee {
    private short id;
    private static int nextId;
    private String name;
    private String surname;
    private double salary;

    public Employee(short id, String name, String surname, double salary) throws FieldLengthLimitException, IncorrectSalaryException {
        this.id = id;

        if(name.length() > 15){
            throw new FieldLengthLimitException("Error! This name is too long.");
        }
        this.name = name;

        if(surname.length() > 15){
            throw new FieldLengthLimitException("Error! This surname is too long.");
        }
        this.surname = surname;

        if(salary < 0){
            throw new IncorrectSalaryException("Error! The salary value cannot be negative.");
        }
        this.salary = salary;
    }

    public short getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getSalary() {
        return salary;
    }

    public void setId(short id) {
        this.id = id;
    }

    public void setName(String name) throws FieldLengthLimitException {
        if(name.length() > 15){
            throw new FieldLengthLimitException("Error! This name is too long.");
        }
        this.name = name;
    }

    public void setSurname(String surname) throws FieldLengthLimitException {
        if(surname.length() > 15){
            throw new FieldLengthLimitException("Error! This surname is too long.");
        }
        this.surname = surname;
    }

    public void setSalary(double salary) throws IncorrectSalaryException {
        if(salary < 0){
            throw new IncorrectSalaryException("Error! The salary value cannot be negative.");
        }
        this.salary = salary;
    }
}