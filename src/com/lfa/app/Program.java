package com.lfa.app;
import com.lfa.app.entity.Student;

public class Program{

    public static void main(String[] args){
        Student student=new Student(1,"Deep Shrestha");

        System.out.println(student.getName());
    }
}