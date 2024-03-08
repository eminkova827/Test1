package HomeworksQA.HW5;

import OOP.Bread;
import OOP.Pet;

public class Dog extends Pets {
        private boolean isGood;

       public boolean isGood() {
        return isGood;
    }

    public void setGood(boolean good) {
        isGood = good;
    }

       // sled setter i getter this se smenq s set


       public Dog(String name, float weight, String size, boolean isMale, float years, boolean likeRawMeat, boolean isGood, PetBreed breed){
           super(name, weight, size, isMale, years, likeRawMeat); // nasledqwane wikame h=ka ot parrent klasa sys super ot glawniq klas pet
           // setName(name); //sled setter i getter
           // setWeight(weight);
            this.isGood = isGood;
           // this.isMale = isMale;
           // setAge(age);
        }


        //methods - cations/ functions

        public void bark () {
            System.out.println("Bau, bau");
        }

        public void run () {
            System.out.println(super.getName() + "is running");// name ot parent classa 4rez super
        }


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

    }





