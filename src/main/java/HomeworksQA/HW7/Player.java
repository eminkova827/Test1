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


    private float PlayerSkills;
    private static String forTeamPlayer;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        String noName = "";
        if (!(name.isEmpty() || name.isBlank() || (name.equals(noName)))) {
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

        setName(name);
        setEndurance(endurance);
        setSprint(sprint);
        setDribble(dribble);
        setPassing(passing);
        setShooting(shooting);

    }


    // methods

    public static float overallPlayerSkill(Player player) {

        float overallPlayerSkill = Math
                .round((player.getEndurance() + player.getSprint() + player.getDribble() + player.getPassing() + player.getShooting()) / 5);

        forTeamPlayer = String.valueOf(overallPlayerSkill);
        return overallPlayerSkill;
    }

    // end
}
