package org.example.bankTransfer;

public class student {
    private  String name;
    private  int age;

    public  void setName(String name){

        this.name = name.trim();
    }
    public  void setAge(int age){
        this.age = age;
    }
    public String eligibleTovote(){
        if(this.age >18){
            return "Yes eligible to vote!!";
        }
            return  "Not Eligible to vote";
    }



    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


}
