package Atb13x_Exerscises.ex_32_Collection_Framework_DSA.List;

import java.util.ArrayList;
import java.util.List;

public class Lab253_AL_Students {

    public static void main(String[] args) {
        Student s1 = new Student("mayank", 25);
        Student s2 = new Student("sonal", 25);
        Student s3 = new Student("xyz", 22);

        List<Student> myStudent = new ArrayList<>();
        myStudent.add(s1);
        myStudent.add(s2);
        myStudent.add(s3);


        System.out.println(myStudent);   // print address
        s1.printDetails();
        s2.printDetails();
        s3.printDetails();

    }
}

class Student{

    private String name;
    private Integer age;

    Student(String name, Integer age){
        this.name = name;
        this.age =age;
    }

    public void setName(String name){
       this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(Integer age){
        this.age = age;
    }

    public Integer getAge(){
        return this.age;
    }

    public void printDetails(){
        System.out.println("Student name : " + name + " , Student age is :"+age);
    }

    public String toString(){
        return "Student{" +
                "name='" + name + '\'' +
                ", age ='" + age + '\'' +
                '}';
    }
}