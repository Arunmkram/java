import java.util.Scanner;
public class multires {
   public static void main(String args[]) {
      Scanner s = new Scanner(System.in);
      System.out.print("Enter first number: ");
      int firstNumber = s.nextInt();
      System.out.print("Enter second number: ");
      int secondNumber = s.nextInt();
      int mul = firstNumber *secondNumber;
      System.out.println("The result of mul was " + mul);
      int add = firstNumber +secondNumber;
      System.out.println("The result of add was " + add);
      int sub = firstNumber -secondNumber;
      System.out.println("The result of sub was " + sub);
      int div= firstNumber /secondNumber;
      System.out.println("The result of div was " + div);
      
   }
} 