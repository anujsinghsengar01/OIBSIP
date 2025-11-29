import java.util.Scanner;
import java.util.Random;
public class GuessGame{
    public static void main(String args[]){

        Random rand= new Random();
        Scanner sc= new Scanner(System.in);
        int randomNumber = rand.nextInt(1,101); // to ger random number btw 1 to 100
        System.out.println("GUESS THE NUMBER BTW 1-100");
        
        int guess= sc.nextInt(); // user in
        
        int attempts = 10;  // max attempts to guess 
        System.out.println(randomNumber); 

        while(guess!=randomNumber && attempts!=0){
            
            System.out.println("GUESS THE NUMBER BTW 1-100");
            guess= sc.nextInt();
            attempts--; // WRONG GUESS 
            

            if(guess>randomNumber){
                System.out.println(" GUESS WAS HIGGER !! ");
            }
            else {
                System.out.println(" GUESS WAS LOWER !! "); 
            }
            System.out.println("YOU HAVE "+attempts+" ATTEMPTS LEFT !");
              
        }
        if(attempts==0){
            System.out.println("YOU LOSE ! NUMBER WAS "+ randomNumber); // ALL ATTEMPTS USED 
        }
        else {
            System.out.println("YOU WIN YOU GUESSED THE NUMBER"+randomNumber); // SUCCESSFULLLY GUESED THE NUMMBER
            System.out.println("YOU HAVE USED "+(11-attempts)+" ATTEMPTS TO ANS !"); //ATTEMPTS TOOK
            System.out.println("YOUR SCORE IS : " +(attempts+1)*10+" POINTS ! "); //SCORE

        }


    
        sc.close();


    }
}
