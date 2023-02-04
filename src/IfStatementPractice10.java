import java.util.Scanner;
public class IfStatementPractice10 {
    public static void main(String[] args) {
        /*
Create a Java program and store values of mortgage rate and mortgage price.
First, program should check if rate is higher than 4.5 user will not buy a house,
otherwise user will consider buying. Once user decides to buy a house,
if price of the house is larger than 200000 than user will take a loan, otherwise user will pay cash.
         */
        double rate = 4.5;
        int price = 200000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("what is the loan rate now?");
        double rate1=scanner.nextDouble();

        if (rate1>rate){
            System.out.println(" do not by a house now");
        } else if (rate1<rate){
            System.out.println("what is the house price?");
            int price1 = scanner.nextInt();
            if (price1<price){
                System.out.println(" buy cash");
            }else {
                System.out.println("take a loan");
            }
        }

        }


    }


