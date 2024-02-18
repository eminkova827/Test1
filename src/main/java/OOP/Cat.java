package OOP;

public class Cat extends Pet {
private boolean isGoodHunter;


//setters and getters

    public boolean isGoodHunter() {
        return isGoodHunter;
    }

    public void setGoodHunter(boolean goodHunter) {
        isGoodHunter = goodHunter;
    }
//constructor
    public Cat(String name, float weight, boolean isMale, byte age, boolean isGoodHunter, Bread bread) {  // konstruktor za kotetop

super(name, weight, isMale, age, bread);
this.isGoodHunter = isGoodHunter;
}

@Override
   public void printData(){
        super.printData();
    System.out.println(isCatGoodHunter());
   }

    private String isCatGoodHunter () {
        if (isGoodHunter) {
            return "The cat is good Hunter";
        } else {
            return "Bad hunter";
        }
    }



}
