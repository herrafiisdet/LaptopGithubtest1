import java.util.Scanner;

public class loops {

    public static void main(String[] args) {

        int a=1;
        while (a<10){

            System.out.println("i need to learn java");
            a++;
        }

        System.out.println("****************************");

        // do while
        int b=0;
        do {
            System.out.println("lets learn java");
            b++;
        }while (b<=3);

        System.out.println("////////////////////////////");
        // test
/*
        Scanner scanner=new Scanner(System.in);
        String answer;
        do {
            System.out.println("do you understand java?");
                answer=scanner.nextLine();
            } while (!answer.equalsIgnoreCase("yes"));
        System.out.println("good");
*/

        //tst2

        System.out.println("-----------------------------");

        //do you love music
        //no its okay
        // yes  you are great


        Scanner scanner1=new Scanner(System.in);
        String answer1;
        do {
            System.out.println("do you like music");
            answer1=scanner1.nextLine();
        } while (!answer1.equalsIgnoreCase("yes"));

        System.out.println("great");





        /*

        Scanner scanner=new Scanner(System.in);
        System.out.println("do you understand loops?");
        String answer=scanner.next();
        do {
            System.out.println("practice more loops");
        }while (!answer.equalsIgnoreCase(answer));

         */
    }
}
