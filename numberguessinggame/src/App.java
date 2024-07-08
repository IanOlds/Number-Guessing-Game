import java.util.Scanner;
public class App {
    public static void guessingNumberGame ()
        {
            Scanner sc = new Scanner(System.in);
            int number = 1 + (int)(100 * Math.random());
            int  K = 10;
            int i , guess;
            System.out.println(
                "A number is chosen between 1-100 guess the number within 10 tries or die ");
                for (i = 0; i<K; i++){
                    System.out.println("guess the number loser:");
                    guess = sc.nextInt();
                    if (number == guess){
                        System.out.println("good job you live another day also ENGLISH OR SPANISH");
                        break;
                        }
                        else if (number < guess && i != K - 1){
                            System.out.println("The number is"
                            + "less than"
                            + guess);
                        }
                         else if (number > guess && i != K - 1){
                            System.out.println("The number is"
                            + "greater than"
                            + guess);
                    }
                }
                if (i == K){
                    System.out.println("Your out of guesses " + "expect a pipe bomb under your pillow enjoy the rest of you day and life ");
                    System.out.println("the number was " + number);
                }
        }
        public static void main(String arg[])
        {
            guessingNumberGame();
        }
}
