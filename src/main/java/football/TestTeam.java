package football;

import java.sql.SQLOutput;
import java.util.Scanner;

//import static HomeworksQA.HW7.TeamDetails.input;
import static football.Team.addPlayer;

public class TestTeam {
    public static void main(String[] args) {

       //printStats(Stats.ENDURANCE);

      // Statts teststat = new Statts( "ENDURANCE", 50);
        //Statts asi = new Statts( "PASSING", 67);

       // teststat.printStats();
       // asi.printStats();
     //   Player sisi = new Player("Silvia", "Passing", 78);
        //Player bobo = new Player("Bobi","shoot", 30);
        // Statts teststat1 = new Statts("sprint", 50);
        // teststat1.printStats();
        //addPlayer(sisi);
        //addPlayer(bobo);
        Scanner input = new Scanner(System.in);
        int a;
        int b;
        System.out.println(": enter a:");
        a = input.nextInt();
        System.out.println(": enter b:");
        b = input.nextInt();
        if (!(a<0 ||a>100)&&(b<0 || b>100)){
            System.out.println("korekt a.b");
            }else{
            System.out.println("inkorekt a");}}




}