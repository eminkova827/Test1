package HomeworksQA;

import java.util.Scanner;

//import static java.awt.SystemColor.text;



public class HW2 {
    public static void main(String[] args) {
        // define a scanner
        Scanner input = new Scanner(System.in);

        // string 1
        System.out.println("Enter some words:");
        String string1 = input.nextLine();
        System.out.println("strin1: "+ string1);

// String2
        System.out.println("Enter some other words:");
        String string2 = input.nextLine();
        System.out.println("strin2: "+ string1);
        int str1= string1.length();
        int str2 = string2.length();
        // Lengths of strings:
        System.out.println("string1 has Length :" + str1);
        System.out.println("string2 has Length :" + str2);
        // Comparison of strings
        boolean nodifferent = true;
        if ( str1 == str2)
        { System.out.println("If Length of str1 is = str2's Length ? : " +nodifferent);}
        else
        {
        // System.out.println("Strin1' length is different of string2's length \nString1 is %d symbols.  And String2 is %d symbols:"+ string1.length(), string2.length());
          System.out.println( "The length of the entwered strings are different strings");

          // concatenation of strin1 i string2
          String allStrings = string1 + " " + string2;
          System.out.println("string1||string2: ");
          System.out.println(allStrings);

          // Replacement of substring
          String firstString = "My name is <test>";
          System.out.println("Original string is: " +firstString);
           System.out.println("After replacment of \"test\" :" +firstString.replace("test", "Eleonora"));

          /* // count words in string
            int count = 0;
            for (int i=0; i<=firstString.length(); i++)
            {
                //if (firstString.charAt(i) !=' ')
                    count++;
            }
            System.out.println("count= " + count + " symbols.");*/

            /// dumi a ne simwoli

            System.out.println("Enter some words: ");
           String readString = input.nextLine();
            int countWords = readString.split("\\s").length;

            System.out.printf("You entered exactly: = %d, words",countWords);
        }

    }
}
