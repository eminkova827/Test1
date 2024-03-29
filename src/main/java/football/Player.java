package football;

public class Player {
    private String name;
    private Stats stats;

   /* public Player(String stats, int statrange) {
        super(stats, statrange);
    }*/
   public Player(String name, String stats, int statrange) {
       // super(stats, statrange);
        setName(name);
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("The name cannot be empty");
        }
    }

    public Stats getStats() {
        return this.stats;
    }

    public void setStats(Stats stats) {
        if (!stats.equals(null)) {
            this.stats = stats;
        } else {
            System.out.println("Stats must be given");
        }
    }

    // methods

    // end
}