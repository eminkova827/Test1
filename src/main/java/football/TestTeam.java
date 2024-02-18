package football;

public class TestTeam {
    public static void main(String[] args) {

        printStats(Stats.ENDURANCE);

        Statts teststat = new Statts("sprints", 50);

        teststat.printStats();
        // Statts teststat1 = new Statts("sprint", 50);
        // teststat1.printStats();

    }

    public static void printStats(Stats stats) {
        System.out.println("the selected stat i " + stats);
    }

}