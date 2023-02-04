import java.util.Scanner;

public class IfStatementPractice11 {
    public static void main(String[] args) {
        /*
        You are a loan specialist and you need to ask user what is the amount of loan is needed.
        If loan is less or equal to 200,000 then you would lend the money otherwise
        you would reject the client.
         */

        int loan=200000;

        Scanner scanner = new Scanner(System.in);
        System.out.println(" What is the house price");
        int price = scanner.nextInt();

        if (price<=loan){
        System.out.println("Congratulation you wil get a loan");
        }else{
            System.out.println("Sorry we cant give you a loan");
        }

    }


    }


