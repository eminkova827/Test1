package encapsulation;

import access.Product;

import java.util.LinkedList;

public class Person {
    private String name;
    private int  money;
    private LinkedList<Product> bagOfProducts = new LinkedList<>();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()){
        this.name = name;
    }else {
        System.out.println("ERROR;not name");}}

                

    public int getMoney() {         return money;
    }

    public void setMoney(int money) {
        if (money>=0){
        this.money = money;
    }else {
            System.out.println("ERROR money");}}


    public Person(String name, int money) {
        this.name = name;
        this.money = money;
        this.bagOfProducts = bagOfProducts;
    }
}