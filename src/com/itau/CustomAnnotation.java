package com.itau;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyCustomAnnotation{
    int value();
}

class Hello{
    @MyCustomAnnotation(value=10)
    public void sayHello(){System.out.println("hello annotation");}
}

class CustomAnnotation {
    public static void main(String args[])throws Exception{

        Hello hello = new Hello();
        Method method = hello.getClass().getMethod("sayHello");

        MyCustomAnnotation myCustomAnnotation = method.getAnnotation(MyCustomAnnotation.class);
        System.out.println("value is: "+myCustomAnnotation.value());
    }}