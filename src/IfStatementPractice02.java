import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class IfStatementPractice2 {

    public static void main(String[] args) {
        //5. Write a Java program that keeps a number from the user and generates an integer
        // between 1 and 7 and displays the name of the weekday. Go to the editor

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number fro 1-7");
        int number=scanner.nextInt();

        if (number==1){
            System.out.println("its Monday");
        }else if (number==2){
            System.out.println("its Tusadat");
        }else if (number==3){
            System.out.println("its wednesday");
        }else if (number==4){
            System.out.println("its thursday");
        }else if (number==5){
            System.out.println("its friday");
        }else if (number==6){
            System.out.println("its saturday");
        }else if (number==7){
            System.out.println("its sunday");
        }else{
            System.out.println("invalid number");
        }



    }
}

