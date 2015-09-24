package examples.oop.covariantreturn;

/**
 * Created by burdun on 19.07.2015.
 */

class ClassA {
    ClassA() {
        System.out.println("ClassA");
    }
}

class ClassB extends ClassA {
    ClassB() {
        System.out.println("ClassB");
    }
}


class ClassC {
    public ClassA method() {
        return new ClassA();
    }
}

class ClassD extends ClassC {
    @Override
    public ClassB method() {
        return new ClassB();
    }

    public int method(int number) {
        return 5;
    }
}


public class CovariantReturn {
    public static void main(String[] args) {
        (new ClassC()).method();
        (new ClassD()).method();
    }
}
