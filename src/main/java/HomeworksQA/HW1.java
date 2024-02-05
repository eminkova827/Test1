package HomeworksQA;

import java.util.Scanner;

public class HW1 {

    public static void main(String[] args) {
        //Enter name
        System.out.println("Enter name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Name is: " + name);
        //enter hoby
        System.out.println("Enter hoby: ");

        String hoby = input.nextLine();
        System.out.println(name +" has  hoby: " + hoby);


    }
}
