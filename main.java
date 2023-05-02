package src;

import javax.sound.midi.Soundbank;
import java.text.NumberFormat;
import java.util.Scanner;

public class MortgagePayments {
    public static void main(String [] args) {

        // Principal
        Scanner scanner = new Scanner(System.in);
        int principal = 0;
        while (true){
            System.out.print("Principal($1K - $1M): ");
            principal = scanner.nextInt();
            if (principal>= 1000 && principal <= 1_000_000){
                break;
            }
            System.out.println("Enter number between  1k and 1m!");
        }

        //rate
        Scanner scanner1 = new Scanner(System.in);
        float rate = 0;
        while (true) {
            System.out.print("Annual Interest Rate: ");
            rate = scanner1.nextFloat();
            if (rate > 1 && rate <= 30) {
                rate = rate / 100 / 12;
                break;
            }
            System.out.println("Enter rate from 2 to 30 percentage!");
        }
        //Period
        Scanner scanner2 = new Scanner(System.in);
        short period = 0;

        while (true) {
            System.out.print("Period(Month): ");
            period = scanner2.nextShort();
            if (period > 1 &&  period < 360){
                break;
            }
            System.out.println("Enter period from 2 to 360 months!");
        }
        //Mortgage
        double result = rate*(Math.pow(1+rate,period)) / (Math.pow(1+rate,period)-1) * principal;
         String m = NumberFormat.getCurrencyInstance().format(result);
        System.out.println("Mortgage:" +m);

    }
}
