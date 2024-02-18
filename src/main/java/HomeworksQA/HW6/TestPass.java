package HomeworksQA.HW6;

import java.util.Scanner;

public class TestPass {


    public static void main(String[] args) {

        String abc;
       System.out.println(
                "Please enter what you will for pasword and \nwe will tellyou if it's ok or no with wy no.\n Enter your future password:");

        Scanner input = new Scanner(System.in);

        System.out.println("--------------------------");

       for (int i = 1; i < 4; i++) {
            System.out.println("Enter word for pass.");

            Password password1 = new Password(input.next());
            System.out.println("-/-/-/-/-/-/");

            password1.checkPass();
        }


    }





    //end
}
