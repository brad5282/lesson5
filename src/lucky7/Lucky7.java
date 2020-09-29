package lucky7;

import java.util.Scanner;

public class Lucky7 {

    public static void main(String[] args) {
        Dice d1 = new Dice();
        Dice d2 = new Dice();
        double money, max;
        int tries= 0;
        int total=0;
        int bestroll=0;
        Scanner s = new Scanner(System.in);
        
        while (true) {
            System.out.println("How much do you want to gamble today? ");
            money = s.nextDouble();
            max = money;
            if (money < 0) {
                System.out.println("Invalid amount, we need to take something from you.");
            } else {
                break;
            }
        }
        System.out.format("$%.2f, eh? Good luck.", money);
            while (true){
                    d1.roll();
                    d2.roll();
                    total = (d2.getNumber()+d1.getNumber());
                    tries ++;
                    //determine win/loss
                    if(total == 7.00){
                        money+=4.00;  
                    }
                    else
                        money-=1.00;
                    
                   if(max < money){
                            max = money;
                            bestroll = tries;
                        }
                   if(money==0)break;
                }
                
               System.out.format("\nYou are broke after %d rolls", tries);
            System.out.format("\nYou should have quit after %d rolls whrn you had $%.2f", bestroll, max);
 
                    
            }
            
            
        }
        

    


