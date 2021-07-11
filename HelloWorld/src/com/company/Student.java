package com.company;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private Integer height;
    public Student(String firstName){
    this.firstName = firstName;
        }

    public void setAge (int age){
        if (age >10 ){
         this.age = age;
        }else {

        }
    }
    public String getName(){
        return  firstName + lastName;
    }
}
