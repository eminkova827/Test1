package beginOOP;

import OOP.Dog;

public class beginTest {

    public static void main(String[] args) {
        beginDog sharo1 = new beginDog("Sharko1",50.456f, true, true, (byte) 6);

        System.out.println("***************");
       beginDog sharo = new beginDog("Sharlina", 50.456f, false, true, (byte) 5);
        sharo1.printData();
        System.out.println("\n***************");
        sharo.printData();

       // beginDog sharo = new beginDog("Sharko", 50.456f, false, true, (byte) 5);
        beginDog pes2 = new beginDog("Klara", 34.566f,true,false, (byte) 3);
        // sharo.name= "Sharo"; //dadohme ime na pesa sharo

        sharo.bark();
        sharo.run();
        sharo.eat();
        // sharo.name = "Pesho";
        //  System.out.println(sharo.name);
        pes2.bark();
        pes2.eat();
        pes2.run();
        pes2.printData();
        sharo1.printData();


    }
}
