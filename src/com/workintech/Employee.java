package com.workintech;

public class Employee {
    private String id; 
    private String name;
    private double salary;

    public Employee(String id, String name){
        this.id = id;
        this.name = name;
    }

    public Employee(String id, String name, double salary){
        this(id, name);
        if(salary < 0){
            this.salary = 0;
        } else {
            this.salary = salary;
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary < 0){
            this.salary = 0;
        } else {
            this.salary = salary;
        }
    }

    public void work(){
        System.out.println("Employee started working.");
    }

    @Override
    public String toString() {
        return "Name: " + name + " Id: " + id + " Salary: " + salary;
    }
}
