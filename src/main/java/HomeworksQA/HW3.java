package HomeworksQA;

import java.awt.geom.Area;
import java.util.Arrays;
import java.util.Scanner;



public class HW3 {

    static double area(double a, double b) {
        return 2 * (a + b);
        //System.out.printf("area of rectangle is: %d", area);
    }
static int number(int a)
{
    return a%2;
}
    public static double face(double a, double b) {
        return a*b;}
    static void monthYear(int numMonth, String month)
    {
        System.out.printf("You have selected: %d. Month of the year is: %s .", numMonth, month);
    }

    public static void main(String[] args) {

    Scanner input= new Scanner(System.in);

    //The bigger value
   System.out.println("Enter value 1:");
    int value1 = input.nextInt();

    System.out.println("Enter value 2: ");
    int value2= input.nextInt();

        System.out.println("Enter value 3: ");
        int value3= input.nextInt();
        System.out.printf("value 1= %d, value 2= %d, value 3= %d.", value1, value2,value3);

        //The bigger value is?

        int bigValue;
        if (value1>value2 && value1>value3)
        { bigValue = value1;}
        else {
            if (value2 > value3)
            {
                bigValue = value2;
            }
            else
            {
                bigValue = value3;
            }
        }
        System.out.printf("The bigger value is: %d ", bigValue);


System.out.println(" \nEnter size aa of rectangular: ");
double aa= input.nextDouble();
        System.out.println(" \nEnter size bb of rectangular: ");
        double bb= input.nextDouble();

        double areaRectangle = area(aa,bb);
        System.out.printf("Area is : "+ areaRectangle);
        double faceRectangle = face(aa,bb);
        System.out.printf("\n Face of rectangle is : "+ faceRectangle);

        //4etno `islo
System.out.println("\n*******division by modulus**********\n");
System.out.println("\nEnter number to check: ");
int num = input.nextInt();
 int divModul = number(num);
 System.out.println("division by modulus = " +divModul);
 if (divModul == 0)
 {
     System.out.printf(" Entered number:%d is even", num);
 }
else
 {
     System.out.printf("Entered number:%d is odd ==> divModul = %d", num, divModul);
 }

//Month of Year

        int numMonth;
String month;
System.out.println("\n*********\nEnter number between 1 and 12 ,inclusive : ");

     numMonth = input.nextInt();
     System.out.println("numMonth = " + numMonth);

    // Output=f(input)

     switch (numMonth)
     {
         case 1:
             month = "January";
             monthYear(numMonth, month);
            break;
         case 2:
             month = "February";
             monthYear(numMonth, month);
             break;
         case 3:
             month = "March";
             monthYear(numMonth,month);
             break;
         case 4:
             month = "April";
             monthYear(numMonth,month);
             break;
         case 5:
             month = "May";
             monthYear(numMonth,month);
             break;
         case 6:
             month = "June";
             monthYear(numMonth,month);
             break;
         case 7:
             month = "July";
             monthYear(numMonth,month);
             break;
         case 8:
             month = "August";
             monthYear(numMonth,month);
             break;
         case 9:
             month = "September";
             monthYear(numMonth,month);
             break;
         case 10:
             month = "October";
             monthYear(numMonth,month);
             break;
         case 11:
             month = "November";
             monthYear(numMonth,month);
             break;
         case 12:
             month = "December";
             monthYear(numMonth,month);
             break;
         default:
             System.out.println("Entered number isn't between 1 and 12 inclusive!!!");
             System.out.println("You input is  number of Month = " + numMonth);
     }


}}
