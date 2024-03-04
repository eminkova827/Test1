package exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) throws IOException , CookieMonsterSadException{
//ReadFile.read("C:\\blhe\\blha.txt");
        try{
       // ReadFile.read("src/main/resources/tesxt.txt");//text.txt
            ReadFile.read("F:/test1.txt");//text.txt//4ete file test1.txt ot F://

        }catch (FileNotFoundException e){
            //do something ...
            System.out.println("Oooops, something went wrong");
        }catch (IOException e){
            //do something else, again
            System.out.println("Oooops, something went wrong");
        }finally {
            System.out.println(" I will be executed always people!!!!");
        }




        //proper exception
        System.out.print(" Enter a=");
Scanner scanner = new Scanner(System.in);
        int a= scanner.nextInt();
        System.out.print("Enter b = ");
        int b = scanner.nextInt();

        try{
            System.out.println("a/b = "+ a/b);
        }catch (ArithmeticException e){
            throw new CookieMonsterSadException(e.getMessage(),a);

    }
        scanner.close();
}}
