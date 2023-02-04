import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class IfStatementPractice14 {
    public static void main(String[] args) {
        /*
        Create a Java program that will ask if user has a credit card or not.
        If you user does not have a credit card then offer them.
        If they do have one ask what is balance on the card?
        If balance of the card is larger than 1000, tell them to pay off immediately,
        otherwise you can tell them that they can spend more.
                 */
        Scanner scanner = new Scanner(System.in);
        System.out.println(" do you have a credit card?");
        String inputcard=scanner.next();

        if (inputcard.equalsIgnoreCase("no")){
            System.out.println(" do you need one");
        }
        if (inputcard.equalsIgnoreCase("yes")){
            System.out.println("what is the balance ");
            int balance=scanner.nextInt();

            if (balance>100){
                System.out.println("please pay off immediately");
            }else {
                System.out.println(" you can spend more");
            }

        }




    }


    }


