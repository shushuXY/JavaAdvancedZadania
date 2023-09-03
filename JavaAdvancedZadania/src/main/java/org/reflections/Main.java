package org.reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {


        System.out.println("nazwa metody: " + Task1.class.getName());
        Constructor<?>[] constructors = Task1.class.getConstructors();
        System.out.println("liczba konstruktorów: " + constructors.length);
        System.out.println("liczba metod: " + getMethodsCount(Task1.class));
        printReturnTypes(Task1.class);
        printMethodsNames(Task1.class);
        printFields(Task1.class);
        printFieldsType(Task1.class);


    }


    public static int getMethodsCount(Class<?> myClass) {
        Method[] methods = myClass.getDeclaredMethods();
        return methods.length;
    }

    public static void printReturnTypes(Class<?> myClass) {
        Method[] methods = myClass.getDeclaredMethods();

        for (Method method : methods) {
            Class<?> returnType = method.getReturnType();
            System.out.println("metoda: " + method.getName() + " zwraca typy: " + returnType.getName());
        }
    }

    public static void printMethodsNames(Class<?> myClass) {
        Method[] methods = myClass.getDeclaredMethods();

        for (Method method : methods) {
            System.out.println(method.getName());
        }
    }


    public static void printFields(Class<?> myClass) {
        Field[] field = myClass.getDeclaredFields();

        for (Field f : field) {
            System.out.println(f.getName());
        }
    }


    public static void printFieldsType(Class<?> myClass) {
        Field[] field = myClass.getDeclaredFields();

        for (Field f : field) {

            System.out.println("pole " + f.getName() + " jest typu: " + f.getType());
        }

    }


}





