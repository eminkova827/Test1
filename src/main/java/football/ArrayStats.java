package football;

public class ArrayStats {
    public static void main(String[] args) {



    String[][] Stats = new String[6][5];
    Stats[0][0] = "name";
    Stats[1][0] = "endurance";
    Stats[2][0] = "sprint";
    Stats[3][0] = "dribball";
    Stats[4][0] = "passing";
    Stats[5][0] = "shooting";




    String[][] alabala = { { "name", "endurance","sprint","driball","passing","shooting"},
            {"","","","","",""},
            {"","","","","",""},
            {"","","","","",""}};
        System.out.print(" elementite na masiwa sa:\n");
    for (int i = 0; i < alabala.length-1; ++i)
    {
        System.out.printf("\n red nomer: %d: ", i);
        for (int j=0; j<= alabala[i].length-1; ++j){
            System.out.print( alabala[i][j] + "; ");
        }
    }

    // pylnq masiwa
        System.out.println("\ndddddddddddddddd");


        for (int i= 0; i <= alabala.length-2; ++i){
           for (int j=0; j<= alabala[i].length-2; ++j) {
            alabala[i+1][j+1] = "f";        }}


        for (int i= 0; i< alabala.length; ++i){
            System.out.printf("\n red nomer:  %d = ", i);
            for (int j=0; j< alabala[i].length; ++j) {

                System.out.print(alabala[i][j] + " (-); ");
            }}




       /* System.out.println("\n------------------\n");
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        for (int i = 0; i < myNumbers.length; ++i) {
            for(int j = 0; j < myNumbers[i].length; ++j) {
                System.out.print(myNumbers[i][j] +"; ");
            }
        }*/

}}

