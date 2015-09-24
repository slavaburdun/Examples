package examples.oop.equals_and_hashcode.my;

import java.util.Objects;

/**
 * Created by burdun on 19.07.2015.
 */
public class Manager extends Employee {

    private int bonus;


    public Manager(String name, int salary) {
        super(name, salary);
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public boolean equals(Object otherObj) {
        /*if (otherObj == null) return false;
        if (otherObj == this) return true;
        if (otherObj.getClass() != this.getClass()) return false;*/
        if (!(super.equals(otherObj))) return false;
        Manager otherManager = (Manager) otherObj;
        return bonus == otherManager.bonus;
    }

    @Override
    public int hashCode() {
        return /*super.hashCode()
                + new Double(bonus).hashCode();*/
                Objects.hash(super.hashCode() + bonus);
    }
}
