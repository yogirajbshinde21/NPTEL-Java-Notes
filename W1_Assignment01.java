// In C Programming, we have seen "scanf()" functions.
// similarly, in Java, we will use "Scanner s = new Scanner(System.in);" to scan the input


import java.util.Scanner;     //  <--- Write this for using Scan Function.
public class W1_Assignment01 {
  
       public static void main(String[] args) {
Scanner s = new Scanner(System.in);   // <--- Similar to scanf() in C Programming.
      double radius= s.nextDouble();  
       double perimeter;
       double area;

//Calculate the perimeter 
perimeter=2*3.1415926535897932384626433*radius;
System.out.println(perimeter);      


  //Calculate the area
area=3.1415926535897932384626433*radius*radius;
System.out.print(area);
}


}
