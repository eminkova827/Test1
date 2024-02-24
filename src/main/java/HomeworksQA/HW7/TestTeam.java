package HomeworksQA.HW7;

public class TestTeam {

    public static void main(String[] args) {

        Player Lionel = new Player("Barcelona", "Lionel_Messi", 75, 85, 84, 92, 67);
        Player Gerard = new Player("Barcelona", "Gerard_Pique", 95, 82, 82, 89, 68);
        Player Gerard2 = new Player("Barcelona", "Gerard_Pique", 456, 82, 82, 89, 68);

        System.out.println("-----Part1 -----------");

        TeamDetails.TEAM("Barcelona");
        Lionel.addBarcelona(Lionel, "Barcelona");
        Gerard.addBarcelona(Gerard, "Barcelona");
        Gerard.removeBarcelona(Gerard, "Barcelona");
        TeamDetails.rating("Barcelona");

        System.out.println("-----Part2 -----------");

        TeamDetails.TEAM("Barcelona");
        Lionel.addBarcelona(Lionel, "Barcelona");
        Gerard2.addBarcelona(Gerard2, "Barcelona");
        Gerard2.removeBarcelona(Gerard2, "Barcelona");
        TeamDetails.rating("Barcelona");

        System.out.println("-----Part3 -----------");

        TeamDetails.TEAM("Barcelona");
        TeamDetails.rating("Barcelona");



    }
}
