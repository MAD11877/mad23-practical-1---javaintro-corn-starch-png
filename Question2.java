import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
     
    
    Scanner x = new Scanner(System.in);
    double weight = x.nextDouble();
    
    Scanner in = new Scanner(System.in);
    double height = in.nextDouble();
   
    
    System.out.println(weight/(height*height));
    
    
  }
}
