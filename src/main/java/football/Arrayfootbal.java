package football;

public class Arrayfootbal {

    public static void main(String[] args) {

        String[][] Stats = new String[6][5];
        Stats[0][0] = "name";
        Stats[1][0] = "endurance";
        Stats[2][0] = "sprint";
        Stats[3][0] = "dribball";
        Stats[4][0] = "passing";
        Stats[5][0] = "shooting";
    }

    String[][] alabala = { { "name", "endurance","sprint","dribball","passing","shooting"},
            {"","","","","",""},
            {"","","","","",""},
            {"","","","","",""}};

  /*  for (int i = 0; i < alabala.length; i++)
      {
        for (int j=0; j<= alabala[i].length; j++){
            System.out.println(" elementite na masiwa sa:"+ alabala[i][j]);
        }}



        System.out.println("\n*****-----*******");
    public static void printStats(){
        String [][] str = new String[6][5];
        for (int i=0; i< str.length-1; i++){
            for (int j=0; j<= 1; j++){
            System.out.println(" elementite na masiwa sa:"+ str[i][j]);
        }}
    }*/
}