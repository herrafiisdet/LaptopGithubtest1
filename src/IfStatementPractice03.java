import java.util.Scanner;

public class IfStatementPractice03 {

    public static void main(String[] args) {
        /*if student completed more than 25 => great job
            if completed more than >20 => good job
            if completed more than >10 => ok job
            if competed more than >5 not good job
               */

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your score");
        int score= scanner.nextInt();

        if (score>=25){
            System.out.println("great job");
        }else if (score>=20){
            System.out.println("good job");
        } else if (score>=10) {
            System.out.println("OK job");
        } else if (score>=5) {
            System.out.println("bad boy :(");
        }

    }
}

