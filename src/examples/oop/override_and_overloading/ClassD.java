package examples.oop.override_and_overloading;

/**
 * Created by burdun on 20.07.2015.
 */

// http://ru.stackoverflow.com/questions/279518/

class A {
    void m1(A a) {
        System.out.print("A");
    }
}

class B extends A {
    void m1(B b) {
        System.out.print("B");
    }
}

class C extends B {
    @Override
    void m1(B c) {
        System.out.print("C");
    }
}


public class ClassD {
    public static void main(String[] args) {
        A c1 = new C();
        c1.m1(new B());
    }
}
