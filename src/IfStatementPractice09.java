import java.util.Scanner;

public class IfStatementPractice9 {

    public static void main(String[] args) {
        /*
Write a program to store a boolean value of whether user has diploma or not. If user has a diploma,
you should say congratulations, otherwise program should suggest to get a degree.
Then if user has a degree program should check a gpa score.
If gpa score is higher or equals to 3.5 → output should say “You are eligible for scholarship”,
 otherwise → “You should have studied harder” .

         */
        double score = 3.5;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you have a diploma YES or NO");
        String diploma = scanner.next();
        if (diploma.equalsIgnoreCase("yes")) {
            System.out.println("Congratulation");
            System.out.println("What is your score:");
            double score1 = scanner.nextDouble();

            if (score1 >= score) {
                System.out.println("You are eligible for scholarship");
            } else if (score1 < score) {
                System.out.println("you should studied harder");
            }

        }else{
                System.out.println("get a degree");
            }

        }

    }


