package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        student s1 = new student();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student name:");
        String name = sc.nextLine();
        System.out.println("Enter student age:");
        int age = sc.nextInt();
        s1.setName(name);
        s1.setAge(age);
        //s1.getAge();
        System.out.println(" Age:" + s1.getAge() + "\n Name: "+ s1.getName() +  "\n "+ s1.eligibleTovote());

    }
}