import java.util.Scanner;
public class Calculations {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      
      System.out.print("Enter a number: ");
      int firstNum = in.nextInt();
      System.out.print("Enter a second number: ");
      int secondNum = in.nextInt();
      System.out.print("Enter a string: ");
      String firstS = in.next();
      System.out.print("Enter another string: ");
      String secondS = in.next();
  
      System.out.println(firstNum + " + " + secondNum + " = " + (firstNum + secondNum));      
      System.out.println(firstNum + " - " + secondNum + " = " + (firstNum - secondNum));
      System.out.println(firstNum + " * " + secondNum + " = " + (firstNum * secondNum));   
      System.out.println(firstNum + " / " + secondNum + " = " + (firstNum / secondNum));
      System.out.println(firstNum + " % " + secondNum + " = " + (firstNum % secondNum));
      System.out.println(firstNum + " / " + secondNum + " = " + ((double)firstNum / secondNum));

      System.out.println("First word, uppercase: " + firstS.toUpperCase());
      System.out.println("Second word, lowercase: " + secondS.toLowerCase());
      System.out.println("First characters: " + firstS.charAt(0) + " and " + secondS.charAt(0));  
      System.out.println("Last characters: " + firstS.charAt(firstS.length() -1 ) + " and " + 
      secondS.charAt(secondS.length()-1)); 
}
}

