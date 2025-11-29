import java.util.Scanner;
import java.util.Random;
public class GuessGame{
    public static void main(String args[]){

        Random rand= new Random();
        Scanner sc= new Scanner(System.in);
        int randomNumber = rand.nextInt(1,101); // to get random number btw 1 to 100
        int attempts = 10;  // max attempts to guess 
        int guess = 101; // just to initialize (as random num cannot be 101)
        System.out.println(randomNumber); //cheat code 


        //  INTRODUCTON AND RULES
        System.out.println("==========================================");
        System.out.println("          🎯 WELCOME TO GUESS-GAME 🎯");
        System.out.println("==========================================");
        System.out.println("👋 Hello Player!");
        System.out.println(" I have selected a secret number between 1 - 100.");
        System.out.println(" You have 10 attempts to guess it correctly.");
        System.out.println(" Points Based On Attempts.");
        System.out.println(" Hints: I will tell you if your guess is TOO HIGH or TOO LOW.");
        System.out.println("==========================================");
        System.out.println("👉 GAME STARTS NOW...  All the best!");
        System.out.println("==========================================\n");
        System.out.println("GUESS THE NUMBER BTW 1-100");

        while(guess!=randomNumber && attempts!=0){
            
            guess= sc.nextInt();
            attempts--;
        
            if(guess>randomNumber){
                System.out.println(" GUESS WAS HIGHER !! TRY AGAIN ");
                System.out.println("YOU HAVE "+attempts+" ATTEMPTS LEFT !");
                
            }
            else if(guess<randomNumber){
                System.out.println(" GUESS WAS LOWER !! TRY AGAIN "); 
                System.out.println("YOU HAVE "+attempts+" ATTEMPTS LEFT !");
            }
            
              
        }
        if(attempts==0 && guess!=randomNumber){
            System.out.println("YOU LOSE ! NUMBER WAS "+ randomNumber); // ALL ATTEMPTS USED (wrong guess)
        }
        else {
            System.out.println("YOU WIN YOU GUESSED THE NUMBER : "+randomNumber); // SUCCESSFULLLY GUESED THE NUMMBER
            System.out.println("YOU HAVE USED "+(10-attempts)+" ATTEMPTS TO ANS !"); //ATTEMPTS TOOK
            System.out.println("YOUR SCORE IS : " +(attempts+1)*10+" POINTS ! "); //SCORE

        }


    
        sc.close();


    }
}
