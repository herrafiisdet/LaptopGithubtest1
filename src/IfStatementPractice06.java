import java.util.Scanner;

public class IfStatementPractice6 {

    public static void main(String[] args) {
        /*
        Create a Java program and declare int variable that will hold a month.
        Based on the value of the variable your program should print the name of the month.
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number of the month 1-12");
        int month=scanner.nextInt();

        if (month==1){
            System.out.println("Its January");
        }  else if (month==2) {
            System.out.println("Its February");
        }  else if (month==3) {
            System.out.println("its March");
        }  else if (month==4) {
            System.out.println("its April");
        }  else if (month==5) {
            System.out.println("its May");
        }  else if (month==6) {
            System.out.println("its June");
        }  else if (month==7) {
            System.out.println("its July");
        }  else if (month==8) {
            System.out.println("its August");
        }  else if (month==9) {
            System.out.println("its September");
        }  else if (month==10) {
            System.out.println("its October");
        }  else if (month==11) {
            System.out.println("its November");
        }  else if (month==12) {
            System.out.println("its December");
        }else {
            System.out.println("you entered the wrong number");
        }

    }
}



