# Difference Between Public Class & and Default Class

Public class :-
1] There should be at most 1 public class present in every java code.
2] File name should be same as the name of Public class name.
3]

Defualt class :-
1] There can be more than 1 defualt classes present in the java code.
2] File name should not be same as defualt class name.


-------------------------------------------------------------------------------------------------------------------------------------
For example:

# File Name: Circle.java

```
class Circle1{       //Defualt class
    double x,y;
    double r;
    double circumference(){
        return 2*3.14159*r;
    }
    double area(){
        return 3.14159*r*r;
    }
}
public class Circle{           //Public class
    public static void main(String args[]){
        Circle1 c = new Circle1();
        c.x = 0.0;
        c.y = 0.2;
        c.r = 0.5;
        System.out.println("Circumference:"+c.circumference());
        System.out.println("Area:"+c.area());
    }
}
```

### Keep this in mind while coding in Java:
This is syntax to declare the main class(i.e. public class)  :-``` public static void main(String args[])```
Whenever we write this, just do one thing ---> use syntax  :- ```public class <ClassName>```
