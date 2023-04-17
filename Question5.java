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
    int[] myNum = {};
    
    for(int i = num;i > 0;i--) {
      Scanner y = new Scanner(System.in);
      int x = y.nextInt();

      myNum = Arrays.copyOf(myNum, myNum.length + 1);
      myNum[myNum.length-1] = x;
    }
    int Hnum = 0;
    int Hcount = 0;
    for(int j = 0; j < myNum.length; j++) {
      int count = 0;
      for(int k = 0; k < myNum.length; k++) {
        if(myNum[k] == myNum[j]) {
            count += 1;
        }
      }
      if(count > Hcount){
          Hcount = count;
          Hnum = myNum[j];
      }
    }
    System.out.println(Hnum);
  }
}
