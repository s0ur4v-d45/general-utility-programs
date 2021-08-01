package com.university;
import java.util.Scanner;


class SuperClass
{
    void method()
    {
        System.out.println("Method from Super Class");
    }
}
class SubClass extends SuperClass
{
    void method()
    {
        super.method();
        System.out.println("Method from Sub Class");
    }
}
class Main {
    public static void main(String[] args) {
        SubClass obj=new SubClass();
        obj.method();
    }
}