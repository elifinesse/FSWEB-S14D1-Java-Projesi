package com.workintech;

public class HRManager extends Employee{
    private JuniorDeveloper[] juniorDevs;
    private MidDeveloper[] midDevs;
    private SeniorDeveloper[] seniorDevs;

    public HRManager(String id, String name, double salary){
        super(id, name, salary);
    }

    public HRManager(String id, String name, double salary, JuniorDeveloper[] juniorDevs, MidDeveloper[] midDevs, SeniorDeveloper[] seniorDevs){
        super(id, name, salary);
        this.juniorDevs = juniorDevs;
        this.midDevs = midDevs;
        this.seniorDevs = seniorDevs;
    }

    public void work(){
        setSalary(70000);
        System.out.println(getName() + "HR Manager started working.");
    }

    public void addEmployee(int index, JuniorDeveloper junior){
        try{
            if(juniorDevs[index] == null){
                juniorDevs[index] = junior;
            } else{
                System.out.println("This index is occupied.");
            }
        } catch(Exception ex) {
            ex.printStackTrace();
            System.out.println("Index not found: " + ex.getMessage());
        }
    }
    public void addEmployee(int index, MidDeveloper mid){
        try{
            if(midDevs[index] == null){
                midDevs[index] = mid;
            } else{
                System.out.println("This index is occupied.");
            }
        } catch(Exception ex) {
            ex.printStackTrace();
            System.out.println("Index not found: " + ex.getMessage());
        }
    }
    public void addEmployee(int index, SeniorDeveloper senior){
        try{
            if(seniorDevs[index] == null){
                seniorDevs[index] = senior;
            } else{
                System.out.println("This index is occupied.");
            }
        } catch(Exception ex) {
            ex.printStackTrace();
            System.out.println("Index not found: " + ex.getMessage());
        }
    }

    
}
