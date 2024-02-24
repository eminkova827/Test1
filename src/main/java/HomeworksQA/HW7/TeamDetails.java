package HomeworksQA.HW7;

import java.util.LinkedList;
import java.util.Scanner;

public class TeamDetails extends Player{
    static Scanner input = new Scanner(System.in);
   public String teamName;
    private Player player;

    public String getTeamName() {
        return teamName;
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
        super(teamName);
        setTeamName(teamName);
    }


    // methods

    public void addPlayer(Player player) {

        Barcelona.add(player.getName());
       // System.out.println("Team has: " + Barcelona);

    }

    public static void TEAM(String teamName) {
        String word = "Barcelona";
        if (teamName.equals(word)) {
            Barcelona.clear();
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
            for (float element : PlayerRating)
                sum = sum + element;
            if (sum>0){
            float teamRate = sum / PlayerRating.size();
            System.out.printf("\nBarcelona - %.0f", teamRate);}
            else{System.out.println("Barcelona - 0" );}
            //System.out.println("RATING List: " + Player.PlayerRating);
           // System.out.println("RATING = " + teamRate);
        } else {
            System.out.printf("Team %s does not exist. ", teamName);
        }

    }

//Add player

    public static void addBarcelona(Player player, String teamName) {

        String word = "Barcelona";
        if (teamName.equals(word)) {
            checkSkills(player);
            //
            Barcelona.add(player.getName());
            PlayerRating.add(overallPlayerSkill(player));
            checkIfAdd(player);
            //visualization of addPlayer
            // System.out.println("Added: " + player.getName());
            // System.out.println("EKIP: " + Barcelona);
            // System.out.println("RAITING: " + PlayerRating);

            ratingTeamAddingPlayer(player);

        } else {
            System.out.printf("Team %s does not exist.", teamName);
        }

    }

    public static void removeBarcelona(Player player, String teamName) {

        if (Barcelona.isEmpty()) System.out.println("Empty team. !!!!!");
        else {
             if (!Barcelona.contains(player.getName())){
                System.out.printf("Player %s is not in Barcelona team.", player.getName());

            } else {

                Barcelona.remove(player.getName());
                PlayerRating.remove(overallPlayerSkill(player));

                //visualization of remove method
                // System.out.println("Removed: " + player.getName());
                // System.out.println("EKIP: " + Barcelona);

                ratingTeamRemovingPlayer(player);}

        }

    }

    public static void ratingTeamRemovingPlayer(Player player) {
        overallPlayerSkill(player);
        float sum = 0;
        //PlayerRating.remove(overallPlayerSkill(player));

        for (float element : PlayerRating)
            sum = sum + element;
        float teamRate = sum / (PlayerRating.size());
        //System.out.println("Barcelona - " + teamRate);
        //System.out.println("RATING List: " + PlayerRating);
        // System.out.println("RATING = " + teamRate);
    }

    public static void ratingTeamAddingPlayer(Player player) {
        overallPlayerSkill(player);
        float sum = 0;
        // PlayerRating.add(overallPlayerSkill(player));

        for (float element : PlayerRating)
            sum = sum + element;
        float teamRate = sum / (PlayerRating.size());
        //System.out.println("Barcelona - " + teamRate);
        // System.out.println("RATING List: " + PlayerRating);
        // System.out.println("RATING = " + teamRate);

    }



    ////

    public static void checkSkills(Player player){

        if ((player.getEndurance() < 0 || player.getEndurance() > 100)) {
            System.out.println("ENDURANCE should be between 0 and 100.");
        }else{
            if ((player.getSprint() < 0 || player.getSprint() > 100)) {
                System.out.println("SPRINT should be between 0 and 100.");
            }else{
                if ((player.getDribble() < 0 || player.getDribble() >100)) {
                    System.out.println("DRIBBLE should be between 0 and 100.");
                }else{
                    if ((player.getPassing() < 0 || player.getPassing() > 100)) {
                        System.out.println("SPRINT should be between 0 and 100.");
                    }else{
                        if ((player.getShooting() < 0 || player.getShooting() > 100)) {
                            System.out.println("SHOOTING should be between 0 and 100.");
                        }}}}
        }}

    //
    public static void checkIfAdd(Player player){
        for (int i = 0; i < Barcelona.size(); i++) {
            // String nameElement = (player.getName());
            if ((player.getEndurance() < 0 || player.getEndurance() > 100)||(player.getSprint() < 0 || player.getSprint() > 100)||player.getDribble() < 0 || player.getDribble() >100|| player.getPassing() < 0 || player.getPassing() > 100 || player.getShooting() < 0 || player.getShooting() > 100) {
                // System.out.printf("Player %s cannot be added. \n", player.getName());
                Barcelona.remove(player.getName());
                PlayerRating.remove(overallPlayerSkill(player));
            }   }
    }









    // end
}
