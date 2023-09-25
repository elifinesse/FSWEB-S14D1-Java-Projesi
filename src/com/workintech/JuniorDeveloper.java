package com.workintech;

public class JuniorDeveloper extends Employee{
    public JuniorDeveloper(String id, String name){
        super(id, name);
    }

    public void work(){
        super.setSalary(30000);
        System.out.println(getName() + "Junior developer started working.");
    }

    public void work(double salary){
        super.setSalary(salary);
        System.out.println(getName() + "Junior developer started working.");
    }
}
