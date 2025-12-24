 @FunctionalInterface
 interface Computer  
{
void code(int n);
}
class Laptop implements Computer
{
    public void code(int n) {
        System.out.println("code, complie, run");
    }
}
class Desktop implements Computer
{
    public void code(int n) {
      System.out.println("code, complie, run: faster");
    }
  
}
class Developer{
    public void code(Computer com){
        com.code(5);
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        // Computer lap =new Laptop();
        // Computer desk = new Desktop();

        // Developer dev = new Developer();
        // dev.code(desk);
        // dev.code(lap);

        // Computer com = ()-> System.out.println("coding");
        // com.code();
        Computer com = n -> System.out.println("coding");
         com.code(5);
    }
}
