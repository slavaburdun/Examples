package examples.oop.equals_and_hashcode.autogenerate;

import java.util.Objects;

/**
 * Created by burdun on 19.07.2015.
 */
public class Employee {

    private String name;
    private int salary;


    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        System.out.println("name == " + name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
