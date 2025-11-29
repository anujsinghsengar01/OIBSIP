import java.util.Scanner;
import java.util.Random;
public class GuessGame{
    public static void main(String args[]){

        Random rand= new Random();
        Scanner sc= new Scanner(System.in);
        int randomNumber = rand.nextInt(1,101); // to get random number btw 1 to 100
        int guess=101; // Just to initialize (as random num cannt be 101
        
        int attempts = 10;  // max attempts to guess 
        System.out.println(randomNumber); //cheat code 
        System.out.println("GUESS THE NUMBER BTW 1-100");

        while(guess!=randomNumber && attempts!=0){
            
            guess= sc.nextInt();
            attempts--;
        
            if(guess>randomNumber){
                System.out.println(" GUESS WAS HIGGER !! TRY AGAIN ");
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
