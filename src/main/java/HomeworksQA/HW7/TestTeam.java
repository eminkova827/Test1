package HomeworksQA.HW7;

public class TestTeam {

    public static void main(String[] args) {

        Player lionel = new Player("Barcelona", "Lionel_Messi", 75, 85, 84, 92, 67);
        Player gerard = new Player("Barcelona", "Gerard_Pique", 95, 82, 82, 89, 68);
        Player gerard2 = new Player("Barcelona", "Gerard_Pique", 195, 82, 82, 89, 68);

        System.out.println("-----Part1 -----------");

        TeamDetails.TEAM("Barcelona");

        TeamDetails.addBarcelona(lionel, "Barcelona");
        TeamDetails.addBarcelona(gerard, "Barcelona");
        TeamDetails.removeBarcelona(gerard, "Barcelona");
        TeamDetails.rating("Barcelona");


        System.out.println("\n-----Part2 -----------");

        TeamDetails.TEAM("Barcelona");
        TeamDetails.addBarcelona(lionel, "Barcelona");
        TeamDetails.addBarcelona(gerard2, "Barcelona");
        TeamDetails.removeBarcelona(gerard2, "Barcelona");
        TeamDetails.rating("Barcelona");

        System.out.println("\n-----Part3 -----------");

        TeamDetails.TEAM("Barcelona");
        TeamDetails.rating("Barcelona");

    }
}
