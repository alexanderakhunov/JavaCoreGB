package main.sample;

import main.regular.Decorator;
import main.regular.OtherClass;

public class Main {
    public static void main(String[] args) {

        int result = OtherClass.sum(2, 2);
        System.out.println(Decorator.decorate(result));
        result = OtherClass.min(2, 2);
        System.out.println(Decorator.decorate(result));
        result = OtherClass.div(2, 2);
        System.out.println(Decorator.decorate(result));
        result = OtherClass.mult(2, 2);
        System.out.println(Decorator.decorate(result));
    }
}