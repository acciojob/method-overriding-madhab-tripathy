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
        B b = new B();
        b.meth();
        B b1 = new B();
        b.meth();
    }
}


