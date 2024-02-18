package HomeworksQA.HW6;

public class Numbers {

    private int num1;
    private int num2;
    private int num3;

    public int getNum1() {
        return this.num1;
    }

    public void setNum1(int num1) {
        if (num1 >= 0) {
            this.num1 = num1;
        } else {
            System.out.println("num1 <0");
        }
    }

    public int getNum2() {
        return this.num2;
    }

    public void setNum2(int num2) {
        if (num2 > 0) {
            this.num2 = num2;
        } else {
            System.out.println("num2 <0");
        }
    }

    public int getNum3() {
        return this.num3;
    }

    public void setNum3(int num3) {
        if (num3 > 0) {
            this.num3 = num3;
        } else {
            System.out.println("num3 <0");
        }
    }

    // constructor

    public Numbers(int num1, int num2, int num3) {
        setNum1(num1);
        setNum2(num2);
        setNum3(num3);
    }
    // methods

    public void sum(int num1, int num2) {
        int summa = num1 + num2;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("\nSum: " + summa);
    }

    public void sum(int num1, int num2, int num3) {
        int summa = num1 + num2 + num3;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("\nSum: " + summa);
        // return num1+num2+num3;
    }

    public void sumAver(int num1, int num2) {
        int summa = num1 + num2;
        float avsum = (float) summa / 2;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.printf("Averagesum: %2f", avsum);
        // System.out.println("\nSum: " + summa);
    }

    public void positiveNumber(int num1, int num2, int num3) {

        if (num1 >= 0) {
            System.out.println(num1 + " as num1 IS POSITIVE");
        } else {
            System.out.println(num1 + " as num1 is NEGATIVE");
        }
        if (num2 >= 0) {
            System.out.println(num2 + " as num2 IS POSITIVE");
        } else {
            System.out.println(num2 + " as num2 is NEGATIVE");
        }
        if (num3 >= 0) {
            System.out.println(num3 + " as num3 IS POSITIVE");
        } else {
            // System.out.println(Integer.toString(num3) + " as num3 is NEGATIVE");
            System.out.println(num3 + " as  num3 is NEGATIVE");
        }

        System.out.printf("num1=%s , num2= %s, num3=%s", Integer.toString(num1), Integer.toString(num2),
                Integer.toString(num3));

    }

    public void samenumbers(int num1, int num2, int num3) {
        int a;
        a = num1;
        if (a == num2) {
            num1 = num2;
        } else {
            System.out.printf("\nnum1= (%d) and num2= (%d) are different numbers!", num1, num2);
            return;
        }
        if (a == num3) {
            System.out.printf("\nnum1(%d)=num2(%d)=num3(%d) = %d", num1, num2, num3, num3);
        } else {
            System.out.println("\nDifferent numbers" + num1 + num2 + num3);
        }
    }







    //end
}
