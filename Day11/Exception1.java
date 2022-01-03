import java.util.*;
public class Exception1{
    public static void main(String[]args){
        try{
            int data = 50/2;
            System.out.println(data);
        } 
        catch(Exception e){
            System.out.println("can't be divided");
        }  
        
    }
}
output:
25