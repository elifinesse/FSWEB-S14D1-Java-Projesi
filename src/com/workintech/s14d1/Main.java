package com.workintech.s14d1;

import com.workintech.HRManager;
import com.workintech.JuniorDeveloper;

public class Main {

    private static void testMethod(){
        Circle circle = new Circle(3.75);

        System.out.println("circle.radius= " + circle.getRadius());

        System.out.println("circle.area= " + circle.getArea());

        Cylinder cylinder = new Cylinder(5.55, 7.25);

        System.out.println("cylinder.radius= " + cylinder.getRadius());

        System.out.println("cylinder.height= " + cylinder.getHeight());

        System.out.println("cylinder.area= " + cylinder.getArea());

        System.out.println("cylinder.volume= " + cylinder.getVolume());

        System.out.println("**********************");

        Rectangle rectangle = new Rectangle(5, 10);

        System.out.println("rectangle.width= " + rectangle.getWidth());

        System.out.println("rectangle.length= " + rectangle.getLength());

        System.out.println("rectangle.area= " + rectangle.getArea());

        Cuboid cuboid = new Cuboid(5,10,5);

        System.out.println("cuboid.width= " + cuboid.getWidth());

        System.out.println("cuboid.length= " + cuboid.getLength());

        System.out.println("cuboid.area= " + cuboid.getArea());

        System.out.println("cuboid.height= " + cuboid.getHeight());

        System.out.println("cuboid.volume= " + cuboid.getVolume());

        System.out.println("**********************");

        JuniorDeveloper jr1 = new JuniorDeveloper("1", "Elif");
        JuniorDeveloper jr2 = new JuniorDeveloper("2", "Kisi1");
        JuniorDeveloper jr3 = new JuniorDeveloper("3", "Kisi2");
        JuniorDeveloper[] jrs = new JuniorDeveloper[2];
        HRManager hrm = new HRManager("4", "kisi3", 70000, jrs, null, null);

        
        hrm.addEmployee(0, jr1);
        hrm.addEmployee(1, jr2);
        hrm.addEmployee(1, jr3);
        hrm.addEmployee(2, jr3);
    }
    public static void main(String[] args) {
        testMethod();
    }
}