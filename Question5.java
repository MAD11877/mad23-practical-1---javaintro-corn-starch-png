import java.util.ArrayList;
import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    ArrayList<Integer> myNum = new ArrayList<>();
    
    for(int i = num;i > 0;i--) {
      Scanner y = new Scanner(System.in);
      int x = y.nextInt();
      myNum.add(x);
    }
    int Hnum = 0;
    int Hcount = 0;
    for(int j = 0; j < myNum.size(); j++) {
      int count = 0;
      for(int k = 0; k < myNum.size(); k++) {
        if(myNum.get(k) == myNum.get(j)) {
            count += 1;
        }
      }
      if(count > Hcount){
          Hcount = count;
          Hnum = myNum.get(j);
      }
    }
    System.out.println(Hnum);
  }
}
