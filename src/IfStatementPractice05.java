import java.util.Scanner;

public class IfStatementPractice5 {

    public static void main(String[] args) {
        /*
     Create a Java program and name it Temperature Check. Create variable to store temperature.
     Your program should check if temperature is below 32 then it should print “Water will freeze with temperature ”,
     otherwise “Water will NOT freeze with temperature ”.
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the temperature");
        int temp=scanner.nextInt();

        if (temp<=32){
            System.out.println("Water will freeze with temperature");
        }else{
            System.out.println("Water will NOT freeze with temperature");
        }
    }
    }


