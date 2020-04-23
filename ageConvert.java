
//Import math utilities
import java.util.*;
// file naming
public class ageConvert
// to handle the math from user input 
{
    public static int multiply(int n1, int n2) {
    int result = 0;
    boolean negative_num = (n1 < 0 && n2 >= 0) || (n2 < 0 && n1 >= 0);
    boolean positive_num = !negative_num;
    n1 = Math.abs(n1);
    for (int i = 0; i < n1; i++) {
      if (negative_num && n2 > 0 || positive_num && n2 < 0)
        result -= n2;
      else
        result += n2;
    }

    return result;
 }
   public static void main(String[] args)
   { 
      // user first name input
      System.out.println("first name: ");
      Scanner scanner = new Scanner(System.in);
      //first name as string variable
      String firstName = scanner.nextLine();
  
      // user last name input
      System.out.println("Last name: ");
      Scanner scanner2 = new Scanner(System.in);
      // last name as string variable
      String lastName = scanner.nextLine();
      
      // user age input
      System.out.print("Age: ");
      Scanner in = new Scanner(System.in);
      // age as an integer variable
      int ageYearsIn = in.nextInt();
      
      // convert age and prepare for print
      String ageYears = ageYearsIn + " years old.";
      String ageMonths = multiply(ageYearsIn,12) + " months old.";
      String ageDays = multiply(ageYearsIn,365) + " days old.";
      String ageHours = multiply(ageYearsIn,8766) + " hours old.";
      String ageMinutes = multiply(ageYearsIn,525949) + " minutes old.";
      String ageSeconds = multiply(ageYearsIn,31556952) + " seconds old.";

      // display results 
      System.out.println(lastName + ", " + firstName 
               +  "\n" + ageYears +  "\n" + ageMonths 
               +  "\n" + ageDays +  "\n" + ageHours
               +  "\n" + ageMinutes +  "\n" + ageSeconds);
   }
}
