public class Average
{
   public static void main(String[] args)
   {
      //create array
      int[] values = new int [5];
      int total = 0;
      //assign values
      values [0] = 147;
      values [1] = 13;
      values [2] = 236;
      values [3] = 534;
      values [4] = -35;
      
      
      for (int i = 0; i < 5; i++)
      {
      total += values[i];
      }
      System.out.println ("The average is: " + (total/5));
   }
}