package lucky7;

import java.util.Scanner;

public class Lucky7 {

    public static void main(String[] args) {
        Dice d = new Dice();
        double money;
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("How much do you want to gamble today? ");
            money = s.nextDouble();
            if (money < 0) {
                System.out.println("Invalid amount, we need to take something from you.");
            } else {
                break;
            }

        }
        System.out.format("$%.2f, eh? Good luck.", money);

    }

}
