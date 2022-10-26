package com.itau;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE_USE)
@interface TypeAnnotation{}

@TypeAnnotation
public class TypeAnnotationEx {

    public static void main(String[] args) {
        @TypeAnnotation String string = "I am annotated with a type annotation";
        System.out.println(string);
        abc();
    }

    static @TypeAnnotation int abc() {
        System.out.println("This function's  return type is annotated");
        return 0;
    }
}