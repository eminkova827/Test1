package HomeworksQA.HW6;

import static HomeworksQA.HW6.Numbers.sumichkata;

public class TestNumbers {


    public static void main(String[] args) {

        int num1 = 47;
        int num2 = -5;
        int num3 = -89;
        Numbers sdf = new Numbers(num1, num2, num3);

        System.out.println("\n----sum 2 number----------");

        sdf.sum(num1, num2);
        System.out.println("\n------sum 3 numbers--------");

        sdf.sum(num1, num2, num3);

        System.out.println("\n------sumAverage--------");
        sdf.sumAver(num1, num2);
        System.out.println("\n------sumichka(sum(sum--------");

        // sumichka(sumichka(num1, num2), num1);

        System.out.println("sumichka = " + sumichka(sumichka(num1, num2), num3));

        System.out.println("\n------sumichka(sum(sum--------");

        // sumichka(sumichkata(num1, num2), num1);

        System.out.println("sumichkata = " + sumichkata(sumichkata(num1, num2), num3));

        // positive numbers

        System.out.println("\n++++++++++++++++++++\n");
        sdf.positiveNumber(num1, num2, num3);
        sdf.samenumbers(num1, num2, num3);

    }

    private static int sumichka(int i, int j) {
        return i + j;
    }






    //end
}
