package Assignment_1;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
   private String name;
   private String subject;
   private int age;

   public Student(String var1, String var2, int var3) {
      this.name = var1;
      this.subject = var2;
      this.age = var3;
   }
   public void display(){
    System.out.println(name +" : "+ subject +" : "+ age);
   }
}

public class IO {
    public static void main(String[] args) throws IOException {
        
// File f1 = new File("/Users/subha/Library/CloudStorage/MacDroid-Subha'sS20FE/Internal storage/Telusko/Sample.txt");

// f1.createNewFile();
// System.out.println(f1.exists());
String f1="/Users/subha/Library/CloudStorage/MacDroid-Subha'sS20FE/Internal storage/Telusko/Sample.txt";
// FileReader reader=null;

// reader = new FileReader(f1);
// int i= reader.read();
// while (i!=-1) {
//     System.out.print((char)(i));
//     i=reader.read();
// }
// char ch[]=new char[(int)f1.length()];
// reader.read(ch);
// for(char c: ch){
//     System.out.print(c);}

// File file=new File(f1);

//             try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
//             bw.newLine(); // go to next line before appending
//             bw.write("This thesis summarizes several points in Sandel’s argument, but it does not make a claim about how we should understand his argument...");
//         } // ✅ auto flush + close here

//         System.out.println("Appended successfully!");

//         // Optional: read and print to confirm
//         try (BufferedReader br = new BufferedReader(new FileReader(file))) {
//             String line= br.readLine();
//             while (line != null) {
//                 System.out.println(line);
//             }
    
//}

Student s1=new Student("Subha","Maths", 10);
s1.display();
try{
BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(f1));
ObjectOutputStream oos =new ObjectOutputStream(bos);
oos.writeObject(s1);
 bos.close();

}
catch(Exception e){
    e.printStackTrace();
}


    }
}
