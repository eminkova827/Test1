package InterPolyMorthy;

import java.time.LocalDate;
import java.util.Scanner;

public class asas {
    Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        LocalDate.now();

        Scanner input = new Scanner(System.in);

        System.out.println("How  will be payed: cash/ bank/ card: ");
        String payDetails = input.nextLine();
        if ((payDetails.equals("cash") ||  payDetails.equals("bank") || payDetails.equals("card"))){

            System.out.printf(" The stock wil be payed with : %s", payDetails);}
        else{
            System.out.println("Incorrect payment method!!!");
    }
}}
