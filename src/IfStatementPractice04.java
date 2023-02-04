import java.util.Scanner;

public class IfStatementPractice04 {

    public static void main(String[] args) {
        /* Create a Java program and name it Double Comparison. Declare 2 double values and if value of
        first variable is higher than the second, print “Double value  is larger than  .” Otherwise print...
               */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter 1st double number");
        double number1 = scanner.nextDouble();
        System.out.println("Enter 2nd double number");
        double number2 = scanner.nextDouble();

        if (number1>number2){
            System.out.println(number1+" is larger than "+number2);
        }else
            System.out.println(number2 +" is greater than "+number1);

        }
    }


