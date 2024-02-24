package HomeworksQA.HW7;

import java.util.LinkedList;
import java.util.Scanner;

public class Player {
    Scanner input = new Scanner(System.in);
    private String name;
    private float endurance;
    private float sprint;
    private float dribble;
    private float passing;
    private float shooting;

   // private Stats stats;
    public float PlayerSkills;
    private String forTeamPlayer;
    public String teamPlayer;
    public String teamName;
    public String teamRezult;

    public float overallPlayerSkill;
    // private LinkedList<Player> Barcelona = new LinkedList<>();
    public static LinkedList<String> Barcelona = new LinkedList<>();
    public static LinkedList<Float> PlayerRating = new LinkedList<>();

    public String getTeamName() {
        return this.teamName;
    }

    public void setTeamName(String teamName) {
        if (!(teamName.isEmpty() || teamName.isBlank() || teamName == null)) {
            this.teamName = teamName;
        } else {
            System.out.println("The Team's name cannot be empty");
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        String noName = "";
        if (!(name.isEmpty() || name.isBlank() || name.equals(noName))) {
            this.name = name;
        } else {
            System.out.println("The name cannot be empty");
        }
    }





    public float getEndurance() {
        return this.endurance;
    }

    public void setEndurance(float endurance) {
        if ((endurance >= 0 || endurance <= 100)) {
            this.endurance = endurance;
        } else {
            System.out.println("Endurance should be between 0 and 100.");
return;
        }
    }

    public float getSprint() {
        return this.sprint;
    }

    public void setSprint(float sprint) {
        if (sprint >= 0 || sprint <= 100) {
            this.sprint = sprint;
        } else {
            System.out.println("Sprint should be between 0 and 100.");

        }
    }

    public float getDribble() {
        return this.dribble;
    }

    public void setDribble(float dribble) {
        if (!(dribble < 0 || dribble > 100)) {
            this.dribble = dribble;
        } else {
            if (dribble < 0) {
                this.dribble = 0;
            }
            if (dribble > 100) {
                this.dribble = 100;
            }
            System.out.println("Dribble should be between 0 and 100.");

        }
    }

    public float getPassing() {
        return this.passing;
    }

    public void setPassing(float passing) {
        if (!(passing < 0 || passing > 100)) {
            this.passing = passing;
        } else {
            System.out.println("Passing should be between 0 and 100.");

        }
    }

    public float getShooting() {
        return this.shooting;
    }

    public void setShooting(float shooting) {
        if (!(shooting < 0 || shooting > 100)) {
            this.shooting = shooting;
        } else {
            System.out.println("Shooting should be between 0 and 100.");

        }
    }
    // constructor

    public Player(String name, float endurance, float sprint, float dribble, float passing, float shooting) {
        setName(name);

        setEndurance(endurance);
        setSprint(sprint);
        setDribble(dribble);
        setPassing(passing);
        setShooting(shooting);

    }

    public Player(String name, Object object) {
        setName(name);
        this.PlayerSkills = (float) object;

    }

    public Player(String teamname, String name, float endurance, float sprint, float dribble, float passing,
                  float shooting) {
        setTeamName(teamname);
        setName(name);
        setEndurance(endurance);
        setSprint(sprint);
        setDribble(dribble);
        setPassing(passing);
        setShooting(shooting);

    }

    public Player(String teamname) {
        setName(name);

    }

    // methods

    public float overallPlayerSkill(Player player) {

        float overallPlayerSkill = Math
                .round((getEndurance() + getSprint() + getDribble() + getPassing() + getShooting()) / 5);
        // PlayerSkills = overallPlayerSkill;
        forTeamPlayer = String.valueOf(overallPlayerSkill);


        return overallPlayerSkill;
    }

    // Danni za edin igrach
    public String teamPlayer() {
        // teamPlayer = getName() + " - " + forTeamPlayer;
        teamPlayer = getName() + " - " + forTeamPlayer;
        // System.out.println("\nFor team : " + teamName + " player's information: " +
        // teamPlayer);
        System.out.println("\n\n\t" + teamPlayer);
        return teamPlayer = getName() + forTeamPlayer;

    }

    // danni za tima i srednite umeniq
    public String playerRating() {
        teamRezult = getTeamName() + " - " + forTeamPlayer;
        // System.out.println("\nFor team information: " + teamRezult);
        return teamRezult = getTeamName() + forTeamPlayer;

    }

    // Adding player to team list


    public void addBarcelona(Player player, String teamName) {
        // System.out.println("Enter name of team:");
        // String teamName = input.nextLine();
       // checkPSkills(player);//
      //  System.out.println("teamName = " + teamName);
        String word = "Barcelona";
        if (teamName.equals(word)) {
            checkSkills(player);
            //checkIfAdd(player);

            //
            player.Barcelona.add(player.getName());
            //visualization of addPlayer
           // System.out.println("Barcelona has: ");
           // System.out.println("Added: " + player.getName());
            System.out.println("EKIP: " + Barcelona);

            ratingTeamAddingPlayer(player);

        } else {
            System.out.printf("Team %s does not exist.", teamName);
        }

    }

    public void removeBarcelona(Player player, String teamName) {

        if (Barcelona.size() <= 0) {

            System.out.println("Empty team. !!!!!");
        } else {
           // System.out.println("Team has players. !!");
        }
        for (int i = 0; i < Barcelona.size(); i++) {
            String nameElement = (player.getName());
            if (nameElement != player.getName()) {

                System.out.printf("Player %s is not in %s team.", player.getName(), Barcelona);
                break;
            } else {

                Barcelona.remove(player.getName());
                //visualization of remove method
               // System.out.println("Barcelona has: ");
              //  System.out.println("Removed: " + player.getName());
              //  System.out.println("EKIP: " + Barcelona);

                ratingTeamRemovingPlayer(player);
            }
        }

    }

    public void ratingTeamRemovingPlayer(Player player) {
        overallPlayerSkill(player);
        float sum = 0;
        PlayerRating.remove(overallPlayerSkill(player));

        for (float element : PlayerRating)
            sum = sum + element;
        float teamRate = sum / (PlayerRating.size());
        //System.out.println("Barcelona - " + teamRate);
        //System.out.println("RATING List: " + PlayerRating);
       // System.out.println("RATING = " + teamRate);
    }

    public void ratingTeamAddingPlayer(Player player) {
        overallPlayerSkill(player);
        float sum = 0;
        PlayerRating.add(overallPlayerSkill(player));

        for (float element : PlayerRating)
            sum = sum + element;
        float teamRate = sum / (PlayerRating.size());
      //  System.out.println("Barcelona - " + teamRate);
       // System.out.println("RATING List: " + PlayerRating);
       // System.out.println("RATING = " + teamRate);

    }



        ////

    public void checkSkills(Player player){

        if ((player.getEndurance() < 0 || player.getEndurance() > 100)) {
          System.out.println("ENDURANCE should be between 0 and 100.");
        }else{
            if ((player.getSprint() < 0 || player.getSprint() > 100)) {
                System.out.println("SPRINT should be between 0 and 100.");return;
            }else{
                if ((player.getDribble() < 0 || player.getDribble() >100)) {
                    System.out.println("DRIBBLE should be between 0 and 100.");return;
                }else{
                    if ((player.getPassing() < 0 || player.getPassing() > 100)) {
                        System.out.println("SPRINT should be between 0 and 100.");return;
                    }else{
                        if ((player.getShooting() < 0 || player.getShooting() > 100)) {
                            System.out.println("SHOOTING should be between 0 and 100.");return;
                        }}}}
        }}

    //
    public void checkIfAdd(Player player){
        for (int i = 0; i < Barcelona.size(); i++) {
            String nameElement = (player.getName());
            if ((player.getEndurance() < 0 || player.getEndurance() > 100)||(player.getSprint() < 0 || player.getSprint() > 100)||player.getDribble() < 0 || player.getDribble() >100|| player.getPassing() < 0 || player.getPassing() > 100 || player.getShooting() < 0 || player.getShooting() > 100) {
                System.out.println(" Player cannot be added. ");
                break;   }   }
    }







    // end
}
