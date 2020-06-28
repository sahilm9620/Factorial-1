import java.util.*;
public class Factorial {
   public static void main(String[] args) {
        int result = 1;
        System.out.println("Enter number : ");
        Scanner sc = new Scanner(System.in);

        float input1 = sc.nextFloat();
        int input=Math.round(input1);
        if (input >= 0) {
            for (; input != 0; input--) {
                System.out.println("Before : " + result + "     " + "Value : " + input);
                result = result * input;
                System.out.println("After : " + result + "      " + "Value : " + input);
            }
            System.out.println("\nFactorial is : " + result);
        }else {
            System.out.println("Enter Positive Value \n ");
        }
    }
}
