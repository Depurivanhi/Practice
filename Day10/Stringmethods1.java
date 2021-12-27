import java.util.*;
public class Stringmethods1{
 public static void main(String[] args){
     String Name = "Ashoka Womens Engineering college";
     String s1 = " lucky ";
     String s2 = " chiku ";
     String s3 = " lucky ";
     String str = String.format("Name is %s",Name);
     String s4 = s1.intern();
     String s5 = "VANHI";
     String s5Lower = s5.toLowerCase();
     String s2Upper = s2.toUpperCase();
     String date = String.join("/","10","06","2002");
     System.out.println("charAt index 2:"+Name.charAt(2) );
     System.out.println("Checking compareTo case:"+s1.compareTo(s2));
     System.out.println("After concat:"+s1.concat(s2)); 
     System.out.println("Checking contains case:"+Name.contains("womens"));
     System.out.println("endWith case:"+s2.endsWith("u"));
     System.out.println("Checking equals with case:"+s1.equals(s3));
     System.out.println("Checking equalsIgnoreCase:"+s1.equalsIgnoreCase(s3));
     System.out.println("String format case:"+str);
     System.out.println("String intern  :"+s4);
     System.out.println("Converting to LowerCase  :"+s5Lower);
     System.out.println("Converting to upperCase  :"+s2Upper);
     System.out.println("Triming string :"+s1.trim());
     System.out.println("sub string :" +s2.substring(2));
     System.out.println("String length is :"+s1.length());
     System.out.println("String indexOf case:"+Name.indexOf("Engineering"));
     System.out.println("String isEmpty case:"+s1.isEmpty());
     System.out.println("String join case:"+date);
     System.out.println("String lastIndexOf case:"+Name.lastIndexOf("college"));
     System.out.println("String replace case:"+Name.replace("e","a"));
     System.out.println("String replaceAll case:"+Name.replaceAll("\\s",""));
     System.out.println("String startsWith case:"+s1.startsWith("lu"));
    
    }
}

Output:
charAt index 2:h
Checking compareTo case:9  
After concat: lucky  chiku 
Checking contains case:false
endWith case:false
Checking equals with case:true
Checking equalsIgnoreCase:true
String format case:Name is Ashoka Womens Engineering college
String intern  : lucky
Converting to LowerCase  :vanhi
Converting to upperCase  : CHIKU 
Triming string :lucky
sub string :hiku
String length is :7
String indexOf case:14
String isEmpty case:false
String join case:10/06/2002
String lastIndexOf case:26
String replace case:Ashoka Womans Enginaaring collaga
String replaceAll case:AshokaWomensEngineeringcollege
String startsWith case:false

