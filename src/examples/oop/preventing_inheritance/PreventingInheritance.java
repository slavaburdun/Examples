package examples.oop.preventing_inheritance;

/**
 * Created by burdun on 19.07.2015.
 */

final class ClassA {}

class ClassB {
    private ClassB() {}
    /*private*/ ClassB(int a) {}
}

class ClassC extends ClassB {
    ClassC(int a) {
        super(a);
    }
}


public class PreventingInheritance {
}
