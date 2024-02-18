package HomeworksQA.HW5;

import OOP.Bread;
import OOP.Pet;

public class Dog extends Pets {
    //instance variable or characteristics:
    /*private String name;
    private float weight;*/
    private boolean isGood;



    /* private boolean isMale;
    private byte age;*/




   /* public String getName() {
        return name;
    }


    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("ERROR: Invalid i9nput for name");
        }}

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }*/

    public boolean isGood() {
        return isGood;
    }

    public void setGood(boolean good) {
        isGood = good;
    }

   /*public boolean isMale() { return isMale;} //mahame go zastoto e nepomenqnemo- kakwoto se zadade takowa

    public void setMale(boolean male) {
        isMale = male;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }*/




        //setters and getters- rabotqt s poletata


//constructor

    /*public Dog(String name, float weigth, boolean isGood, boolean isMale, byte age) {

        this.name = name; //tekustoto
        this.weigth = weigth;
        this.isGood = isGood;
        this.isMale = isMale;
        this.age = age;
    }*/

        // sled setter i getter this se smenq s set


   // public Pets(String name, float weight, String size,  boolean isMale, float years, boolean likeRawMeat){
       public Dog(String name, float weight, String size, boolean isMale, float years, boolean likeRawMeat, boolean isGood, PetBreed breed){
           super(name, weight, size, isMale, years, likeRawMeat); // nasledqwane wikame h=ka ot parrent klasa sys super ot glawniq klas pet
           // setName(name); //sled setter i getter
           // setWeight(weight);
            this.isGood = isGood;
           // this.isMale = isMale;
           // setAge(age);
        }


//default constructor; w momwneta na dobawqne n acustom defoultniq iz4ezwa ko ne sme go dobawili izri`no kakto sledwa:
      //  public Dog() {  }

        //methods - cations/ functions

        public void bark () {
            System.out.println("Bau, bau");
        }

        public void run () {
            System.out.println(super.getName() + "is running");// name ot parent classa 4rez super
        }

       // public void eat () { System.out.println(name + "is eating."); }

        /*public void printData () {      //  System.out.printf("The name is: %s, It wegth is: %.2f, $s, %s. It is %d year(s) old", name, weigth, isDogGood(), isDogMale(), age);
            System.out.printf("The name is: %s, It wegth is: %.2f, $s, %s.", name, weight, isGood(), isMale(), age);
        }*/



public void printData(){
    super.printData();
    System.out.println(isDogGood());// wikame specifi4noto za ku4eto
}


    private String isDogGood () {
            if (isGood) {
                return "The dog is good";
            } else {
                return "Bad dog";
            }
        }



//end
    }





