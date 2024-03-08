package HomeworksQA.HW8;

import java.util.Scanner;

public class MaxNum {

    public static void main(String[] args) {
        numMax(2, 78, 95);
        numMax1(-2, -78, -95);
        nums();
    }

    private static int numMax(int num1, int num2, int num3) {
        int a = Math.max(num1, num2);
        int maxNum = Math.max(a, num3);
        System.out.printf("The max value of num1 =%d , num2 = %d and num3=%d is: %d", num1, num2, num3, maxNum);
        return maxNum;
    }

    private static int numMax1(int num1, int num2, int num3) {

        int maxNum = Math.max((Math.max(num1, num2)), num3);
        System.out.printf("\nMAX value of num1 =%d , num2 = %d and num3=%d is: %d\n\n", num1, num2, num3, maxNum);
        return maxNum;
    }

    private static int numMax2(int num1, int num2, int num3) {
        int maxNum = Math.max((Math.max(num1, num2)), num3);
        System.out.printf("\nMAX value of num 1 =%d , num 2 = %d and num 3 = %d is: %d\n", num1, num2, num3, maxNum);
        return maxNum;
    }
    public static void nums() {
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter num 1 = ");
        int num1 = input.nextInt();
        System.out.print("\nEnter num 2 = ");
        int num2 = input.nextInt();
        System.out.print("\nEnter num 3 = ");
        int num3 = input.nextInt();
        numMax2(num1, num2, num3);
    }

}
