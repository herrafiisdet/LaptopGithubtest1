import java.util.Scanner;

public class IfStatementPractice07 {

    public static void main(String[] args) {
        /*
        Write a Java Program to check whether number is Even or Odd.
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number and will let you know if its an Even or Odd number");
        double number=scanner.nextInt();

        if (number%2==0){
            System.out.println("this number is even");
        }else{
            System.out.println("this number is Odd");
        }

    }
}



