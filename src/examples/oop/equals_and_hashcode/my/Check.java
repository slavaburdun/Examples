package examples.oop.equals_and_hashcode.my;

/**
 * Created by burdun on 19.07.2015.
 */
public class Check {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Harry", 1000);
        Employee employee2 = new Employee("Harry", 1000);

        Manager manager1 = new Manager("Sally", 5000);
        Manager manager2 = new Manager("Sally", 5000);

        System.out.println(employee1.equals(employee2));
        System.out.println(manager1.equals(manager2));
        System.out.println(employee1.hashCode() + " " + employee2.hashCode());
        System.out.println(manager1.hashCode() + " " + manager2.hashCode());
    }
}
