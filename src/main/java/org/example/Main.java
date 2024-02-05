package org.example;
import javax.print.attribute.standard.OrientationRequested;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        for (int i=0; i<=5; i++)
        {
            System.out.println(i);
        }

        for ( int i=0; i<=12; i +=2)
        {  System.out.println(i);}

        /*for ( int i=0; i<=12; i +=3)
        {  System.out.println(i);}*/

        //outer loops + inner loops
        for (int i=0; i<=2; i++) {
            System.out.println("Outer: " + i);

            //inner loops
            for (int j = 1; j <= 3; j++) {
                System.out.println(" Inner: " + j);
            }
        }
// Length of string
        String abc = "abcdefgh";
        System.out.println(abc.length());

        String[] cars= {"Volvo", "BMV", "OPEL", "FORD"};
        for (String i :cars) { System.out.println(i);}

        //Java break
        for (int i=0; i<=100; i++)
        {
            if (i == 46)
            {
                break;
            }
            System.out.println(i);
        }

        // while break
        int i=0;
        while (i<=5) {
            System.out.println(i);
                i++;
        if (i == 3) {
            break;}
        }
        // preskacha 4
        int ii = 0;
        while (ii < 10) {
            if (ii == 4) {
                ii++;
                continue;
            }
            System.out.println(ii);
            ii++;
        }
System.out.println("**********\n");
        int k=0;
        while (k<=45)
        {
         if (k ==5) {
             k++;
         }
            System.out.println(k);
        k++;
        }
        System.out.println("Your name is:  ");
       Scanner in = new Scanner(System.in);
       String name = in.nextLine();
       System.out.println("Вие се казвате : " + name);

       Scanner readConsole = new Scanner(System.in);
       System. out.println("Slary: ");
       Double  salary = readConsole. nextDouble();
       System.out.println("Your salary is :  " + salary);

       System.out.println("--------------");
       System.out.println(" Въведи Име, възраст и заплата");
       Scanner test = new Scanner(System.in);
       String nname = test.nextLine();
       int aage = test.nextInt();
       double ssalary = test.nextDouble();
        System.out.println("Age: "+ aage);
        System.out.println("Salary: "+ ssalary);





        //end
        }
    }

