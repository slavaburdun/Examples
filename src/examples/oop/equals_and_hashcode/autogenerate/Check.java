package examples.oop.equals_and_hashcode.autogenerate;

/**
 * Created by burdun on 19.07.2015.
 */
public class Check {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Harry", 1000);
        Employee employee2 = new Employee("Harry", 1000);

        Manager manager1 = new Manager("Sally", 5000);
        Manager manager2 = new Manager("Sally", 5000);

        System.out.println(manager1.equals(manager2));
    }
}
