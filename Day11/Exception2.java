import java.util.*;
public class Exception2{
    public static void main(String[]args){
        int i = 6;
        int j = 0;
        int data;
        try{
            data = i/j;
            System.out.println(data);
        }
        catch(Exception e){
            System.out.println(i/(j+3));
        }
    }
}
output:
2
