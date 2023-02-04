import java.util.Scanner;

public class IfStatementPractice12 {
    public static void main(String[] args) {
        /*
        You are DMV representative and you need to ask customer their age.
        If they are 18 and older you will issue a driver licence to them,
        otherwise you will offer them to get a learners permit.
                 */

        int age = 18;

        Scanner scanner = new Scanner(System.in);
        System.out.println(" what is your age?");
        int input = scanner.nextInt();

        if (input>=age){
            System.out.println( " you will get a driver licence");
        }else{
            System.out.println("Sorry we cant issued a driver licence");
        }



    }


    }


