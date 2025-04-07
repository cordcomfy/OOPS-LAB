class calculator {
protected double a, b;
public calculator(double a, double b) {
     this.a = a;
     this.b = b;
   }
}
class Addition extends Calculator {
public Addition(double a,double b) {
super(a,b);
}
public double add() {
    return a+b;
 }
}
class Subtraction extends Calculator {
public Subtraction(double a,double b) {
super(a.b);
}
public double sub() {
   return a-b;
 }
}
class Multiplication extends Calculator {
public Multiplication(double a,double b) {
super(a,b);
}
public double mul() {
    return a*b;
  }
}
class Division extends Calculator {
public Division(double a,double b) {
super(a.b);
}
 public double divide() {
   if (b!= 0) {
      return a/b;
}
  else{
      System.out.println("error");
      return Double.NaN;
   }
 }
}
public class Final extends Division {
    public final (double a, double b) {
  super(a,b);
}
public void displayResults() {
  System.out.println("Addition: " + add());
  System.out.println("Subtraction: " + sub());
  System.out.println("Multiplication: " + mul());
  System.out.println("Division: " + divide());
 }
}
