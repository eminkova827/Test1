package Uroci;

import java.util.Arrays;

public class Uroc1 {
    int x=5;
    String xx= "ab";
    double y = 23.45;
    int f=789;
static void pishiImenata(String name){
    System.out.println(name + "vagen gostenin");
}
    public static void main(String[] args) {

        Uroc1 myObj = new Uroc1();
        System.out.println(myObj.x);

        Uroc1 obekt1 = new Uroc1();
        Uroc1 obekt2 = new Uroc1();
        System.out.println(obekt1.xx);
        System.out.println(obekt2.y);

        Uroc1 trytttt = new Uroc1();
        trytttt.y = 234;
        System.out.println(trytttt.y);
         trytttt.y = 66;
        System.out.println(trytttt.y);

        pishiImenata("Eleonora ");
        pishiImenata("Ori ");
    }
    }

