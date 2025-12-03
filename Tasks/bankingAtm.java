import java.util.Scanner;
import java.util.ArrayList;
public class bankingAtm { //STATIC VARIABLE(USED BY MANY FUNCTIONS)
    static int choice;
    static Scanner sc= new Scanner(System.in);
    static double balance=10000.00; //STARTING BALANCE 
    static ArrayList<String> history = new ArrayList<>();//HISTORY LIST
    public static void main(String args[]){
        
         
         double deposite;
         double withDraw;
         boolean isRunning = true;

        /* AUTHOR - ANUJ SINGH SENGAR
           DATE   - 03-12-25
           TIME   - 22:40              */
         
         
        //INTRO AND MENU
         while(isRunning){
         System.out.println("---------------------------");   
         System.out.println("THE PRIME BANKS");
         System.out.println("1-TRANSACTION HISTORY");
         System.out.println("2-SHOW BALANCE");
         System.out.println("3-DEPOSITE MONEY");
         System.out.println("4-WITHDRAW MONEY");
         System.out.println("5-LOGOUT");
         System.out.println("CHOOSE 1-5");
         System.out.println("---------------------------");
         choice = sc.nextInt();
         

     
        switch(choice){ //MENU CHOICE 
            case 1 -> printHistory(); //CALLING PRINTHISTORY FOR TRANSACTION HISTORY
            case 2 -> showBalance(); // FOR CURRENT BALANCE
            case 3 -> {
                System.out.println("---------------------------");
                System.out.println("HOW MUCH YOU WANT TO DEPOSITE");
                deposite=sc.nextDouble();
                deposite(deposite);//CALLING DEPOSITE FUNCTION TO DEPOSITE
                
            }
            case 4 -> {
                System.out.println("---------------------------");
                System.out.println("HOW MUCH YOU WANT TO WITHDRAW!!");
                withDraw=sc.nextDouble();
                withDraw(withDraw);//CALLING WITHDRAW FUNCTION TO DEPOSITE
                
            }
            case 5 -> {
                System.out.println("---------------------------");
                System.out.println("THANKS FOR COMMING ! LOGGING OUT !!");
                System.out.println("---------------------------");
                isRunning=false;//CODE STOP 
                }
                 
            default -> {
                System.out.println("---------------------------");
                System.out.println("INVALID CHOICE TRY AGAIN");
                
                }


        }
        
         
        }
         sc.close(); //close here as there is no use after thaat use at the end


    }
    static void printHistory() {//BASIC LOGIC OF FUNTIONS
        System.out.println("TRANSACTION HISTORY");
        if (history.isEmpty()) {
            System.out.println("NO TRANSACTION YET");
        } 
        else {
            for (String transaction : history) {
                System.out.println(transaction);
            }
            showBalance();

        }
        
    }
    
    static void showBalance(){//BASIC LOGIC OF FUNTIONS
        System.out.println("---------------------------");
        System.out.printf("YOUR CURRENT BALANCE IS $%.2f\n",balance);


    }
    static double deposite(double deposite){//BASIC LOGIC OF FUNTIONS
        if(deposite>0){
        balance+=deposite;
        history.add("DEPOSITED : $" + deposite);//TO UPDATE IN HISTORT
        showBalance();
        }
        else {
            System.out.println("INVALID AMOUNT TRY AGAIN");
            choice=3;
        }
        return balance;
        
    }
    static double withDraw(double withdraw){//BASIC LOGIC OF FUNTIONS
        if(withdraw>0 && withdraw<=balance){
        balance-=withdraw;
        history.add("WITHDRAW : $" + withdraw);//TO UPDATE IN HISTORY
        showBalance();
        }
        else if(withdraw>0 && withdraw>balance){
            System.out.println("NOT ENOUGH BALANCE!");
            showBalance();
        }
        else {
            System.out.println("INVALID AMOUNT TRY AGAIN!");
        }
        return balance;
        //sc.close(); like this at last within 
    }
    
    
    


}
