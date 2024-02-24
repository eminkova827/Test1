package HomeworksQA.HW7;

import java.util.LinkedList;
import java.util.Scanner;

public class TeamDetails {

    static Scanner input = new Scanner(System.in);

    public String teamName;

    private Player player;



    public String getTeamName() {
        return this.teamName;
    }

    public void setTeamName(String teamName) {
        String noName= " ";
        if (!(teamName.isEmpty() || teamName.isBlank() || (teamName.equals(noName)))) {
            this.teamName = teamName;
        } else {
            System.out.println("The Team's name cannot be empty");
        }
    }



    static LinkedList<String> Barcelona = new LinkedList<>();


    public Player getPlayer() {
        return this.player;
    }

    public void setPlayer(Player player) {
        if (!player.equals(null)) {
            this.player = player;
        } else {
            System.out.println("Please enter Player's data.");
        }
    }

    // constructor

    public TeamDetails(String teamName) {
        super();
        setTeamName(teamName);
    }


    // methods

    public void addPlayer(Player player) {

        Barcelona.add(player.getName());
        System.out.println("Team has: " + Barcelona);

    }

    public static void TEAM(String teamName) {
        String word = "Barcelona";
        if (teamName.equals(word)) {
            Player.Barcelona.clear();
            Player.PlayerRating.clear();
            //System.out.println(Barcelona);
           // System.out.println(Player.PlayerRating);
        } else {
            System.out.printf("Team %s does not exist.", teamName);
        }

    }

    public static void rating(String teamName) {
        String word = "Barcelona";
        if (teamName.equals(word)) {
            float sum = 0;
            for (float element : Player.PlayerRating)
                sum = sum + element;
            if (sum>0){
            float teamRate = sum / (Player.PlayerRating.size());
            System.out.println("Barcelona - " + teamRate);}
            else{System.out.println("Barcelona - 0,0" );}
            //System.out.println("RATING List: " + Player.PlayerRating);
           // System.out.println("RATING = " + teamRate);
        } else {
            System.out.printf("Team %s does not exist. ", teamName);
        }

    }




    // end
}
