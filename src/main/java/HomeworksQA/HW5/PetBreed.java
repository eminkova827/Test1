package HomeworksQA.HW5;

public class PetBreed {

   private String breedType;
    private  String breedName;
    private String colors;
    private boolean handEat;
    private boolean speak;
    private boolean playfull;

    private String placeOfOrigin;


   public String getBreedType() { return breedType;}

    public void setBreedType(String breedType) {
        if (!breedType.isEmpty()){
        this.breedType = breedType;
    } else {
            System.out.println("ERROR: No type of pet.");}}

    public String getBreedName() {return breedName; }

    public void setBreedName(String breedName)
    {
        if (!breedName.isEmpty())
        {
            this.breedName = breedName;
        } else
        {
            System.out.println("ERROR: Invalid input for BreedName");
        }
    }

        public String getColors() { return colors; }

        public void setColors(String colors) {
        this.colors = colors;  }


    public void setHandEat(boolean handEat) { this.handEat = handEat; }


    public void setSpeak(boolean speak) {this.speak = speak; }


    public void setPlayfull(boolean playfull) { this.playfull = playfull; }


    public void setPlaceOfOrigin(String placeOfOrigin) {
        if (!placeOfOrigin.isEmpty()){
            this.placeOfOrigin = placeOfOrigin;
        } else {
            System.out.println("ERROR: no data for Country of origin.");}}


    //construcros for ParrotBreed

    public PetBreed(String breedType, String breedName, String colors, boolean handEat, boolean speak, boolean playfull, String placeOfOrigin)
    {
        setBreedType(breedType);
        setBreedName(breedName);
        setColors(colors);
        setHandEat(handEat);
        setSpeak(speak);
        setPlayfull(playfull);
        setPlaceOfOrigin(placeOfOrigin);
    }

    public  void printBreed(){

        System.out.printf("breedName = %s is breedType = %s with colors = %s , handEat = %s,  opportunity to speak= %s ,playfull = %s. Region of origin is %s",
                breedName,breedType, colors, handEat, speak, playfull, placeOfOrigin);
    }

}






