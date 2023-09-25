package com.workintech;

public class SeniorDeveloper extends Employee{
    public SeniorDeveloper(String id, String name, double salary){
        super(id, name, salary);
    }

    public void work(){
        super.setSalary(60000);
        System.out.println( getName() + "Senior developer started working.");
    }
}
