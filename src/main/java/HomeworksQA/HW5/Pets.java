package HomeworksQA.HW5;

public class Pets {
//characteristics - fields
    private static String name;
    private static String size;// big or littel
    private static boolean isMale;

      private static float weight;
      private static float years;
    private boolean likeRawMeat;

//getters and setters

    public String getName() {return name;}

    public void setName(String name) {
        if (!name.isEmpty()) {this.name = name; }
        else {
            System.out.println("Error: no NAme entered!!!");}}

    public String getSize() {return size; }

    public void setSize(String size) {
        if (!size.isEmpty()) {this.size = size; }
        else {
            System.out.println("ERROR: no size entered.!!!!");
        }}

    public void setMale(boolean male) {
        isMale = male;
    }

    public float getWeight() { return weight; }

    public void setWeight(float weight) {
        if (weight> 0){ this.weight = weight;}
        else {
            System.out.println("ERROR: no weight is enetred!!");
        }}

    public float getYears() { return years; }

    public void setYears(float years) {
        if (years>0) { this.years = years;}
        else {
            System.out.println("ERROR: The Parrot maybe is not existing at the moment. Enter  how yang is please !!!!");
        }
    }

    public boolean isLikeRawMeat() { return likeRawMeat; }

    public void setLikeRawMeat(boolean likeRawMeat) {
        if (likeRawMeat){
            this.likeRawMeat = likeRawMeat;
        }else {
            System.out.println("ERROR:Don.t like Meat???");}}



    // constructor

           public Pets(String name, float weight, String size,  boolean isMale, float years, boolean likeRawMeat){

        setName(name); //sled setter i getter "set" ane "this"
        setWeight(weight);
        this.isMale = isMale;
        setSize(size);
        setYears(years);

        setLikeRawMeat(likeRawMeat);
    }


    //methods
    public  void printData( )
    {
        System.out.printf("This Pet has name: %s, size: %s, sex: %s, weight: %2f and is %f years old." , name, size, isMale(), weight, years);
        System.out.println("\nLike eat raw meat? =+>"+ likeRawMeat);

    }

    private String isMale() {
        if (isMale) {
            return "The pet is male";
        } else {
            return "The pet is female";
        }
    }

    public void eat(){
        System.out.println(" This Pet is eating well!!!");
    }

    private String LikeRawMeat() {
        if (!likeRawMeat) {
            return "This kind of Pet like to eat raw meat";
        } else {
            return "TThis kind of Pet NOT eat raw meat";
        }
    }
}
