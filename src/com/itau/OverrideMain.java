package com.itau;

public class OverrideMain {

    public static void main(String[] args) {
        CLasseHerdada obj = new CLasseHerdada();
        obj.display();


    }
}

class Base {

    public void display()
    {
        System.out.println("Base display()");
    }
}

class CLasseHerdada extends Base {

    @Override public void display()
    {
        System.out.println("CLasseHerdada display(int )");
    }
}