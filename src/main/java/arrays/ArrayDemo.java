package arrays;

public class ArrayDemo {

    public static void main(String[] args) {

        String[] someRandomSentences = { "First name", "Second name", "Next one", "Last name" };

        int[] intArray = new int[20];

        System.out.println(someRandomSentences[3]);

        // System.out.println(someRandomSentences);// print java.lang.String.. w
        // statichnata pamet obekta
        for (int i = 0; i <= someRandomSentences.length - 1; i++) {
            System.out.println(someRandomSentences[i]);
        }
        System.out.println("**********");
        for (int i = 0; i <= intArray.length - 1; i++) {
            intArray[i] = i * 3;
            System.out.println(intArray[i]);
        }
        System.out.println(someRandomSentences[3]);// pishe posledniq element , kojto e 4etwyrti no na mqsto nomer 3 s
        // naГ lo 0
        System.out.println(someRandomSentences[someRandomSentences.length - 1]);
        System.out.println(someRandomSentences.length);// dawa dylginata na msasiwa

        for (String sentence : someRandomSentences) {
            System.out.println("Current line semtence is: " + sentence);
        }

        for (int number : intArray) {
            System.out.println("Current element is: " + number);
        }

        // two dimentional array
        int[][] _2dArray = {
                { 9, 45, 67 },
                { 54, 23, 1 },
                { 34, 2, 3, 56, 87 } };

        // print elements by indexes

        for (int i = 0; i <= _2dArray.length - 1; i++) {
            for (int j = 0; j <= _2dArray[i].length - 1; j++) {
                System.out.printf("\nCurrent index is: %d%d . and the lement is: %d. ", i, j, _2dArray[i][j]);
            }
        }
        System.out.println("\n*****-----*******");
    }







    //end
}
