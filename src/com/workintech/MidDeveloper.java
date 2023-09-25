package com.workintech;

public class MidDeveloper extends Employee{
    public MidDeveloper(String id, String name, double salary){
        super(id, name, salary);
    }

    public void work(){
        setSalary(40000);
        System.out.println(getName() + "Mid developer starts working.");
    }
}
