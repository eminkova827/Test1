package HomeworksQA.HW5;

public class Parrot extends Pets{
    private PetBreed breed;

//private boolean likeRawMeat;


//setters and getters

    public PetBreed getBreed() { return breed;}

    public void setParrotBreed(PetBreed breed) {
        if (breed != null){  this.breed = breed;
            System.out.println(" ParrotbREED= ");}
        else {
            System.out.println("ERROR: no data for breed");
        }}






//    public boolean isLikeRawMeat() { return likeRawMeat; }
//
//    public void setLikeRawMeat(boolean likeRawMeat) {
//        if (likeRawMeat){
//        this.likeRawMeat = likeRawMeat;
//    }else {
//            System.out.println("ERROR: Like RAw Meat???");}}


// constructor za Parrot

    public Parrot(String name, float weight, String size,  boolean isMale, float years, boolean likeRawMeat, PetBreed breed ){
        super(name, weight, size, isMale, years, likeRawMeat); // nasledqwane wikame h=ka ot parrent klasa sys super ot glawniq klas pets

       // setLikeRawMeat(likeRawMeat);


    }
//metods
    public void likeRawMeat(){
        System.out.println("Parrot like to eat raw meat");
    }



    public void printData(){
        super.printData();
        System.out.println(" Parrot is: " + breed);
       // System.out.println(LikeRawMeat());// wikame specifi4noto za papagala

    }
//    private String LikeRawMeat() {
//        if (!likeRawMeat) {
//            return "The Parrot like to eat raw meat";
//        } else {
//            return "The PArrot NTO eat raw meat";
//        }
//    }




    //end
}
