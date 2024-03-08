package HomeworksQA.HW8;

import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(Math.divideExact(120, 60));

        // Heronova formula za lice na triygylnik
        // S=sqrt(p(p-a)(p-b)(p-c))
        // p=(a+b+c)/2
        // Math.sqrt(double a)
        // Math.devideExact(int x, int y)

        System.out.println("Math.sqrt(63) =  " + Math.sqrt(63));

        nums();
    }
    private static double triangleHeron(double num1, double num2, double num3) {
        // double p = Math.divideExact((int) (num1 + num2 + num3), 2); izmestwa
        // rezultata
        double p = (num1 + num2 + num3) / 2;
        // System.out.println("p = (num1 + num2 + num3) / 2 is ==>> " + p);
        double pp = (double) p * (p - num1) * (p - num2) * (p - num3);
        // System.out.println("pp= p * (p - num1) * (p - num2) * (p - num3) is ==>> " +
        // pp);

        double areaTriangle = Math.sqrt(pp);
        // System.out.println("Area_triangle = sqrt(pp) " + areaTriangle);

        System.out.printf("\nFor num1 = %.2f, num 2=%.2f and num 3=%.2f  ==>> AREA TRIANGLE = %.2f",
                num1, num2, num3,
                areaTriangle);
        System.out.println("\nHeron by details:  \n");
        System.out.println("p = (a + b + c) / 2 is ==>> " + p);
        System.out.println("pp= p * (p - a) * (p - b) * (p - c) is ==>> " + pp);
        System.out.println("Area_triangle = sqrt(pp) " + areaTriangle);

        return Math.sqrt(pp);
    }

    public static void nums() {
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter a = ");
        double num1 = input.nextDouble();
        System.out.print("\nEnter b = ");
        double num2 = input.nextDouble();
        System.out.print("\nEnter c = ");
        double num3 = input.nextDouble();

        triangleHeron(num1, num2, num3);

    }

}
