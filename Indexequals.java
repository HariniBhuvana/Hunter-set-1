import java.util.Scanner;

public class Indexequals {
  private static Scanner s;
  
  public static void main(String[] args) {
      s = new Scanner(System.in);
      System.out.println("Enter the Array Seperated by Comma");
      String s1 = s.next();
      boolean f = false;
      int input = 0;
      int value = 0;
      String sr[] = s1.split(",");
      for (int i = 0; i < sr.length; i++) {
        if (Integer.parseInt(sr[i]) == i) {
            f = true;
            input = i;
            value = Integer.parseInt(sr[i]);
        }
      }
      if (f) {
        System.out.println("The Value Found at the Index " + input + " is " + value);
      } else {
        System.out.println("No Value Index Matches Found");
      }
    
  }
  
}
