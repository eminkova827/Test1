package Stect_Queue;

import java.sql.SQLOutput;
import java.util.Stack;

public class StackAndQueue {

    public static void main(String[] args) {
        Stack<String> kitchenDrawer = new Stack<>();
        kitchenDrawer.push("Pan");
        kitchenDrawer.push("Dish");
        kitchenDrawer.push("Fork");

        System.out.println(kitchenDrawer);
        System.out.println(kitchenDrawer.pop());//maha s posledniq dobawen - fork
        System.out.println(kitchenDrawer);
        System.out.println(kitchenDrawer.peek());//samo izpiswa naj-gorniq element
        System.out.println(kitchenDrawer);
        kitchenDrawer.pop();
        System.out.println("****"+ kitchenDrawer);
        kitchenDrawer.push("Dish");
        System.out.println("****"+ kitchenDrawer);
        kitchenDrawer.add(1, "PAper");
        System.out.println(kitchenDrawer);
        int s = kitchenDrawer.size();
        System.out.println(("size of kitchen = " +s));
    }


}
