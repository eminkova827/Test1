package football;

public class alabala {
    public static void main(String[] args) {


    int[][] a = {
            {1, -2, 3},
            {-4, -5, 6, 9},
            {7},
    };

        for (int i = 0; i < a.length; ++i) {
        for(int j = 0; j < a[i].length; ++j) {
            System.out.print( a[i][j]+ "; ");
        }
    }
        System.out.println("_---------------------");


}
    public static void printStats(String[][] str) {
       // String[][] str;
        for (int i = 0; i < str.length - 1; i++) {
            for (int j = 0; j <= 1; j++) {
                System.out.println(" elementite na masiwa sa:" + str[i][j]);
            }
        }


    }}

