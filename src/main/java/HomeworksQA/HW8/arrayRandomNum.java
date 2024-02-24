package HomeworksQA.HW8;
import java.util.Random;
import java.util.Scanner;


import static java.lang.Math.random;

public class arrayRandomNum {
    public static void main(String[] args) {


     System.out.println("--------random with bounds---------");
    fillArray(5);

}

public static void fillArray(int a) {
    Random random = new Random();
    int[] randomNum = new int[a];
    System.out.println("elementite na masiwa sa:");
    for (int i = 0; i <= a - 1; i++) {
        int b= random.nextInt(1,950);
        randomNum[i] = b;
        System.out.println("Elelment: " + i + " of array is: " + randomNum[i]);

    }

}

public static void nums() {
    Scanner input = new Scanner(System.in);
    System.out.print("\nEnter size of array with random values = ");
    int arraySize = input.nextInt();

    fillArray(arraySize);

}


}
