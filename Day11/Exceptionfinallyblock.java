import java.util.*;
public class Exceptionfinallyblock{
    public static void main(String[]args){
        try{
        int data = 25/0;
        System.out.println(data);
        }
        catch(Exception e){
            System.out.println("Exception handling");
            System.out.println(e);
        }
        finally{
            System.out.println("finally block is excecuted");
        }
    }
}
output:
Exception handling
java.lang.ArithmeticException: / by zero
finally block is excecuted