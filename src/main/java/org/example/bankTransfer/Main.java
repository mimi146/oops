package org.example.bankTransfer;

import org.example.bankTransfer.BankTransfer;

public class Main {
    public static void main(String[] args) {
//        student s1 = new student();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter student name:");
//        String name = sc.nextLine();
//        System.out.println("Enter student age:");
//        int age = sc.nextInt();
//        s1.setName(name);
//        s1.setAge(age);
//        //s1.getAge();
//        System.out.println(" Age:" + s1.getAge() + "\n Name: "+ s1.getName() +  "\n "+ s1.eligibleTovote());
        BankTransfer bob = new BankTransfer(123,100);
        BankTransfer elis = new BankTransfer(1234,150);

        bob.transfer(elis, 50);
        System.out.println(bob.getBalance());

    }
}