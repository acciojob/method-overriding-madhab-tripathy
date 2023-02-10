package com.driver;

public class Main {
    public static class A {
        public String meth() {
            return "Invoking method from class A";
        }
    }

    // Class B
    public static class B extends A {
        @Override
        public String meth() {
            return "Method is overridden in Extended class B";
        }
    }
    public static void main(String[] args) {
        // Final Submit
        B obj1 = new B();
        obj1.meth();
        B obj2 = new B();
        obj1.meth();
    }
}


