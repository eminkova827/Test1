package HomeworksQA;

import java.util.Arrays;
import java.util.Scanner;

public class HW4 {

    static void printN(int N)
    {
        System.out.printf("Number from 1 to N=  %d", N);
        for (int i=1; i<=N; i++)
        {
            System.out.printf("\n %d", i);
        }
    }

    // %modul
    static void divModul(int m, int N) {
        System.out.printf(" For divModul at m=%d, and N=%d. ", m, N);
        System.out.println("Numbers with div by module  !=0 are:");
        for (int i = 1; i <= N; i++) {
            if (i % m != 0) {
               System.out.println(i);
            }
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//test scanner
      //  System.out.println("a=");
      //  int a= input.nextInt();5
        System.out.println("\n*******Array*******\n");

int [] num=  {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        System.out.println("Original element of Array: ");
for (int i=0; i<=num.length-1; i++)
{ System.out.printf("\nelement:[%d]=%d", i, num[i]);}

//clone original array to use in p.2
        int[] numNew = num.clone();


// index*5 = new value:
        System.out.println("\n ***********\n\nIndex*5 = new value of Array's elements: ");


        for (int i=0; i<=num.length-1; i++)
        { num[i] = i*5;
            System.out.printf("\nelement:[%d]=%d", i, num[i]);}


//average of values
        System.out.println("\n ***********\n\nAverage value of Array's elements: ");
        //int[] numNew;

        int sum=0;
        int elementi;
        for (int i= 0; i<=numNew.length-1; i++)
        { System.out.println("numNew="+numNew[i]);
            sum+=numNew[i];}
        float avgSum=(float)sum/(numNew.length);
        elementi = numNew.length;
        System.out.printf("elemnti=%d ", elementi);
        System.out.printf("sum= %d,  averSum = %.3f .", sum, avgSum);
/*int d=210/20;
float f= 210;
int l=20;
 float dd=(float)(f/l);
        System.out.printf("d=%d, dd=%f ", d, dd);*/

        // point3
        System.out.println("\n**********\n\nenter size of array : ");
        int size= input.nextInt();
        //int[] sizeArray=new int[10];
        int[] sizeArray = new int[size];
int even =0; //4etno
int odd=0; //ne4etjno

        for (int i=0; i<= size-1; i++)
        {
            System.out.printf("enter value[%d] of array: ",i);
            sizeArray [i] = input.nextInt();

        }
        // view new array
        for (int i=0; i<= size-1; i++)
        {
            System.out.printf("\nentered value [%d] of array is: %d", i, sizeArray[i]);

            if (sizeArray[i]%2==0)
            {even +=sizeArray[i];}
            else {odd +=sizeArray[i];}

        }
        System.out.printf(" \nSumm of even numbers in array is: %d", even);
        System.out.printf(" \nSumm of odd numbers in array is: %d", odd);

        //write number from 1 to N (N param)
int N;
System.out.println("\nEnter number N= ");
N= input.nextInt();
printN(N);
// Number with %3=0 and %7=0
       // int m3, m7 ;
        System.out.println("\n************%3 and %7********");
       for (int i=1; i<=N; i++)
        {
            if (i % 3 !=0)
            {
            System.out.println(i);
             }
        }
        for (int i=1; i<=N; i++)
        {
            if (i % 7 != 0)
            System.out.println(i);
        }
        divModul(3,N);
        divModul(7,N);
        //Fabonachi

        System.out.println("******Fabonachi*********");
        int af = 0;
        int bf = 1;
        int cf = af + bf;
        System.out.println("af= " + af);
        System.out.println("bf= " + bf);
        System.out.println("cf=af+bf =  " + cf);


        int fN = 11;//how numbers of Fibonachi will be calculated;

        int[] fibonachi = new int[fN+1];
        fibonachi[0] = 0;
        System.out.println("*Fibonachi Numbers");

        for (int ii = 1; ii <= fN; ii++) {

            cf = af + bf;
            System.out.printf("\ncf(%d)= %d", ii, cf);

            fibonachi[ii] = cf;
            System.out.printf("\nFibonachi [%d]=cf(%d)= %d", ii,ii, fibonachi[ii]);

            af = bf;
            System.out.printf("\naf(%d)= %d", ii+1, af);

            bf = cf;
            System.out.printf("\nbf(%d)= %d", ii+1, bf);
        }

        System.out.println("\n********allFibonachi in array*******");

        for (int jj = 0; jj <= fibonachi.length - 1; jj++) {
            // fibocheli[jj] = cf;
            System.out.printf("\nfibonachi [%d]= %d", jj, fibonachi[jj]);
        }

        //end
          }
    }

