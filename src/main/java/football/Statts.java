package football;

public class Statts {

    private Stats enumstat;
    private String stats;

    private float statrange;

    public Stats getEnumstat() {
        return this.enumstat;
    }

    public void setEnumstat(Stats enumstat) {
        if (!enumstat.equals(null)){
        this.enumstat = enumstat;
    }else{System.out.println("Enter stat of player");}}

    public String getStats() {
        return this.stats;
    }

    public void setStats(String stats) {
        if (stats == "endurance" || stats == "sprint" || stats == "dribble" || stats == "passing"
                || stats == "shooting") {
            this.stats = stats;
        } else {
            System.out.println("No correct Stat");
            return;
        }
    }

    public float getStatrange() {
        return this.statrange;
    }

    public void setStatrange(float statrange) {
        if (statrange == 0 || statrange > 0.0 || statrange < 100.0 || statrange == 100) {
            this.statrange = statrange;
        } else {
            System.out.println("statrange is aout of range");
        }
    }

    public Statts(String stats, float statrange) {

        setStatrange(statrange);
        setStats(stats);

    }

    // methods

    public void printStats() {
        System.out.printf("stats:%s , stat = %s and statrange = %f ", enumstat, stats, statrange);
    }

    // end
}