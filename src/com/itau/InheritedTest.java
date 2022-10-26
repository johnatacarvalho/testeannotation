package com.itau;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@interface CarAnnotation {

    public String maker();

}

@CarAnnotation(maker="BMW")
class AbstractBMWCar { }

class BMWRoadsterCar extends AbstractBMWCar { }

public class InheritedTest {

    public static void main(String[] args) {

        Class[] classes = {AbstractBMWCar.class, BMWRoadsterCar.class};

        for (Class classObj : classes) {
            Annotation[] annotations = classObj.getAnnotations();
            System.out.println("No. of annotations: " + annotations.length);
            for (Annotation annotation : annotations) {
                CarAnnotation carAnnotation = (CarAnnotation)annotation;
                System.out.println(carAnnotation.maker());
            }
        }
    }
}