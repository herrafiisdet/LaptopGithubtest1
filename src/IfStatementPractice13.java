import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class IfStatementPractice13 {
    public static void main(String[] args) {
        /*
        Create a Java program that will ask user to input city and temperature.
        Your program should convert Fahrenheit into celsius and print “The temperature is the city  is ”
        C= f-32/1.8
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println(" what is your city?");
        String city = scanner.next();
        System.out.println("what is the temperature?");
        int tempFah = scanner.nextInt();
        System.out.println("The temperature is "+ (tempFah-32)/1.8 + " C");

    }


    }


