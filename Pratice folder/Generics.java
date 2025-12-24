import java.util.ArrayList;
import java.util.List;

class Master{
    private String name;
    private String subject;
    private int age;

    public Master(String name, String subject, int age){
        this.name=name;
        this.subject=subject;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
}
class Student extends Master{
    // private String name;
    // private String subject;
    private int marks;
    
    public Student(String name, String subject, int marks) {
        super(name, subject, 0);
        // this.name = name;
        // this.subject = subject;
        this.marks = marks;
    }
    // public String getName() {
    //     return name;
    // }
    // public void setName(String name) {
    //     this.name = name;
    // }
    // public String getSubject() {
    //     return subject;
    // }
    // public void setSubject(String subject) {
    //     this.subject = subject;
    // }
    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void show(List<? extends Master> list){
        for(Master ms : list)
        System.out.println(ms);
    }


}


public class Generics {

    public static void main(String[] args) {
    
   Master m1=new Master("Raj","Maths", 40);
   Master m2=new Master("John","Science", 30);
   Master m3=new Master("Mani","English", 34);

   Student s1=new Student("Subha","Maths", 80);
   Student s4=new Student("Subha","Science", 90);
   Student s2=new Student("Alex","Science", 93);
   Student s3=new Student("Nancy","Maths", 86);


        List<Master> ms = new ArrayList<>();
             ms.add(m1);
             ms.add(m2);
             ms.add(m3);

        List<Student> ss = new ArrayList<>();
             ss.add(s1);
             ss.add(s2);
             ss.add(s3); 
             ss.add(s4);      
    
      for(Student std : ss){
        System.out.println("Student Name : "+ std.getName()+ ", subject : "+std.getSubject()+", Marks : "+std.getMarks());
      }
      for(Master mst : ms){
        System.out.println("Master Name : "+ mst.getName()+ ", subject : "+mst.getSubject()+", Marks : "+mst.getAge());
      }       
    
    }
    
}
