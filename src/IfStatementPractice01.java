import java.util.Scanner;

public class IfStatementPractice01 {

    public static void main(String[] args) {
        //Take three numbers from the user and print the greatest number

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1st number ");
        int number1 = scanner.nextInt();

        System.out.println("Enter 2nd number ");
        int number2 = scanner.nextInt();

        System.out.println("Enter 3rd number ");
        int number3 = scanner.nextInt();

/*
        if (greatest > (number2 & number3)){
            System.out.println(number1 + " is the greatest");

        } else if (number2>(number1 & number3)) {
            System.out.println(number2 + "is the greatest");

        }else if (number3>(number1&number2)){
            System.out.println(number3 + "is the greatest");
        }
*/
        if (number1 > number2)
            if (number1 > number3) {
                System.out.println(number1 + "is the greatest");
            }
        if (number2 > number1)
            if (number2 > number3) {
                System.out.println(number2 + " is the greatest");
            }
        if (number3 > number1)
            if (number3 > number2) {
                System.out.println(number3+" is the greatest");

            }

    }
}

