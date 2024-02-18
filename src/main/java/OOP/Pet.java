package OOP;

public class Pet {
    //instance variable
    private String name;
    private float weight;

    private boolean isMale;
    private byte age;
    private Bread bread; // h-ka ot referenten tip - slovna , systawna -  poroda  COMPOSOSOIN


    //getters+seters
    public String getName() {
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
    }

       public boolean isMale() { return isMale;} //mahame go zastoto e nepomenqnemo- kakwoto se zadade takowa

    public void setMale(boolean male) {
        isMale = male;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    //setter getter za bread

    public Bread getBread() {
        return bread;
    }

    public void setBread(Bread bread) {
        if (!bread.equals(null)){
        this.bread = bread;
    } else {
            System.out.println("ERROR: no data entered for BREAD");}}


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
    public Pet(String name, float weight,  boolean isMale, byte age, Bread bread){

        setName(name); //sled setter i getter "set" ane "this"
        setWeight(weight);
        this.isMale = isMale;
        setAge(age);
        setBread(bread);
    }


    public void eat () {
        System.out.println(name + " is eating.");
    }


    private String isPetMale () {
        if (isMale) {
            return "The dog is male";
        } else {
            return "the dog is female";
        }
    }

    public void printData () {
        //  System.out.printf("The name is: %s, It wegth is: %.2f, $s, %s. It is %d year(s) old", name, weigth, isDogGood(), isDogMale(), age);
        System.out.printf("The name is: %s, It wegth is: %.2f, $s, %s.", name, weight, isPetMale(), age);
    }


    //end
}
