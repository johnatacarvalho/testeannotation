package com.itau;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@MyAnnotation(value1 = 1, value2 = "teste")
public class RetentionTest {

//    @MyAnnotation(value1 = 1, value2 = "teste")
    private int qualquerCoisa = 10;
}

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE/*, ElementType.FIELD*/})
@interface MyAnnotation{
    int value1();
    String value2();
}

// refers to the source code, discarded during compilation. It will not be available in the compiled class.

// refers to the .class file, available to java compiler but not to JVM . It is included in the class file

// 	refers to the runtime, available to java compiler and JVM .