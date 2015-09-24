package examples.oop.equals_and_hashcode.my;

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

    @Override
    public boolean equals(Object otherObj) {
        if (otherObj == this) return true;
        if (otherObj == null) return false;
        if (getClass() != otherObj.getClass()) return false;
        Employee otherEmployee = (Employee) otherObj;
        return Objects.equals(name, otherEmployee.name)
                && salary == otherEmployee.salary;
    }

    @Override
    public int hashCode() {
        return /*7 * Objects.hashCode(name)
                + 11 * new Double(salary).hashCode();*/
                Objects.hash(name, salary);
    }
}
