package org.acme;

public class StaticMethodAccessNonStaticVariableAndMethod {
    int instanceVar = 10;

    public void instanceMethod(){
        System.out.println("Instance method");
    }

    public static void staticMethod(){
        StaticMethodAccessNonStaticVariableAndMethod s = new StaticMethodAccessNonStaticVariableAndMethod();
        s.instanceVar = 20;
        s.instanceMethod();
        System.out.println(s.instanceVar);
    }

    public static void main(String[] args) {
        staticMethod();
    }
}
