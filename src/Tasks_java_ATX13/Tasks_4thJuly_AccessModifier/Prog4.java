package Tasks_java_ATX13.Tasks_4thJuly_AccessModifier;

import java.rmi.StubNotFoundException;


public class Prog4 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setDetails(1,"mayank");

        String details = s1.getDetails();
        System.out.println(details);

        // this is from prog 5 diff class in same package
//        Student2 s2 = new Student2();
//       s2.getAge();


    }
}

class Student{
   private int id;
   private String name;

  public String getDetails(){
    if(verifyStudent()){
        return "name:"+name+" ID:"+id;
    } else {
        return "Invalid student data.";
    }
   }

   void setDetails(int id , String name){
       this.name = name;
       this.id = id;
   }

   private boolean verifyStudent(){
      return(id>0 && name != null && !name.isEmpty());
   }
}
