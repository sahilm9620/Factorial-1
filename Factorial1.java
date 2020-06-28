import java.util.*;
public class Factorial1 {
    public static void main(String[] args) {
        int result=1;
        System.out.println("Enter number : ");
        Scanner sc= new Scanner(System.in);
        int input = sc. nextInt();
        
       while (input!=0)
        {
           System.out.println("Before : "+result+"     "+"Value : "+input);
            result=result*input;
            System.out.println("After : "+result+"      "+"Value : "+input);
            input--;
        }
        System.out.println("\nFactorial is "+result);
    }
}