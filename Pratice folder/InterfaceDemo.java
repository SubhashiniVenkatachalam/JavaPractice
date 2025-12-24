 @FunctionalInterface
 interface Computer  
{
void code();
}
class Laptop implements Computer
{
    public void code() {
        System.out.println("code, complie, run");
    }
}
class Desktop implements Computer
{
    public void code() {
      System.out.println("code, complie, run: faster");
    }
  
}
class Developer{
    /* this is loosely- coupled =>Here,your developer depend on Computer(computer doesn't exist right..it is a concept)
     it can be either lap or desktop*/
    public void code(Computer com){
        com.code();
    }
/*  -- tightly coupled =>Here, you are saying developer depend on only laptop to code...
        public void code(Laptop llp){
        llp.code(5);
    }*/
}

public class InterfaceDemo {
    public static void main(String[] args) {
         Computer lap =new Laptop(); //Creating Laptop Class object using Computer Interface Reference
         Computer desk = new Desktop(); //Creating Desktop Class object using Computer Interface Reference

        Developer dev = new Developer();
        dev.code(desk);
        dev.code(lap);
    }
}
