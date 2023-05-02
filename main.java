package src;

import javax.sound.midi.Soundbank;
import java.text.NumberFormat;
import java.util.Scanner;

public class MortgagePayments {
    public static void main(String [] args) {

        System.out.print("Principal: ");
        Scanner scanner = new Scanner(System.in);
        int principal = scanner.nextInt();

        //rate
        System.out.print("Annual Interest Rate: ");
        Scanner scanner1 = new Scanner(System.in);
        float rate = (float) (scanner1.nextFloat()) / 100 /12;
        //Period
        System.out.print("Period(Month): " );
        Scanner scanner2 = new Scanner(System.in);
        short period = scanner2.nextShort();
        //Mortgage
        double result = rate*(Math.pow(1+rate,period)) / (Math.pow(1+rate,period)-1) * principal;
         String m = NumberFormat.getCurrencyInstance().format(result);
        System.out.println("Mortgage:" +m);

    }
