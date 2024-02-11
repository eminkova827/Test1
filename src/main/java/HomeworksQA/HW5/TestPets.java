package HomeworksQA.HW5;

public class TestPets {

    public static void main(String[] args) {
        System.out.println("please enter data for PrrotBreed  as :breedName, colors, handEat/nohandEat, speak/npspeak, playfull:");

        //public ParrotBreed (String breedName, String colors,boolean handEat, boolean speak, boolean playfull)
        PetBreed ara = new PetBreed("Parrot","Ara", "colored", true, true,true, " Brazil");
      PetBreed cacadu = new PetBreed("Parrot","CAcadu", "white", false, false, true, " Africa");


        System.out.println("\n****----ARA----*****");
        Pets momo = new Pets( "Momo",1.22f, "big", true,  38, true);
        momo.printData();System.out.println("\n**-*-*-*-*-**");
        ara.printBreed();System.out.println("\n**-*-*-*-*-**");
        momo.eat();


        System.out.println("\n**-*-*-*-*-**");
        Pets momo1 = new Pets("Sasha", 0.3f, "litlle", false, 23,false);

        System.out.println("\n**********-----CACADU-----******");

        momo1.printData();System.out.println("\n**-*-*-*-*-**");
        cacadu.printBreed();System.out.println("\n**-*-*-*-*-**");
        momo1.eat();

        System.out.println("\n**-*-*-*-*-**");

        //printBreed();


}}
