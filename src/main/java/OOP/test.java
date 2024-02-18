package OOP;

public class test {
    public static void main(String[] args) {

Bread frenchBuldog = new Bread("frenchdog","playfull","stomach");
Bread ragDol = new Bread("ragDol", "Long fur", "stomach");

      Dog sharo1 = new Dog("Sharko1",50.456f, true, true, (byte) 6,frenchBuldog);
//sharo1.name = "sharo";

        Dog sharo = new Dog("Sharko", 50.456f, false, true, (byte) 5, frenchBuldog);
        Dog pes2 = new Dog("Klara", 34.566f,true,false, (byte) 3, frenchBuldog);

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
      System.out.println("You are the BEST");

      Cat pisan = new Cat("Pisan", 4.25f,true, (byte) 3,  true, ragDol) ;
pisan.eat();
pisan.printData();

    }

}
