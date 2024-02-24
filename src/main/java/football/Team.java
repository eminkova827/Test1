package football;

import java.util.ArrayList;
import java.util.LinkedList;

public class Team extends Player{

    private String teamName;
    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        if(!teamName.isEmpty()){
        this.teamName = teamName;
    }else{
            System.out.println("Error: empty name");}}

    

    private LinkedList<Player> footballteam = new LinkedList<>();
   
   
    ArrayList<String> cars = new ArrayList<String>();

    public Team(String teamName, String name, String stats, int statrange) {
        super(name, stats, statrange);
    }
    
    public static void addPlayer(Player name){
        //LinkedList<Player> team = new LinkedList<>();
       // boolean add = team.add(player.getName());
        ArrayList<String> teams = new ArrayList<String>();
        teams.add("name");
        teams.add("BMW");
        System.out.println(" List team" +teams);
        
    }
    
}