import java.util.Scanner;

public class IfStatementPractice {

    public static void main(String[] args) {
        //Write a Java program to get a number from the user and print whether it is positive or negative

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a number");
        int  number = scanner.nextInt();

        if (number<0){
            System.out.println(" this is a negative number");
        }else {
            System.out.println("this is a positive number");

        }
    }
}
