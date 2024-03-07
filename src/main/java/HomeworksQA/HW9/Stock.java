package HomeworksQA.HW9;

import java.util.Scanner;

public class Stock {
    Scanner input = new Scanner(System.in);
    private static String product;
    private Prodi prodi;
    private boolean available= true;
    private static double unitPrice;
    private static int quantity;// тодо

    public static int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public static double getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(double finalPrice) {
        this.finalPrice = finalPrice;
    }

    private static double finalPrice;

    private boolean warehouse = true;


    public Prodi getProdi() {
        return this.prodi;
    }

    public void setProdi(Prodi prodi) {
       if (prodi != null){
            this.prodi = prodi;
        }else{System.out.println("Enter stat of player");
       }
    }


    public static String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        if (product.equals("APPLE") || product.equals("PINEAPPLE") ||product.equals("KIWI")){
        this.product = product;
    }else {
            System.out.println(" No such product for sell or product not available!!!");
        }
    }


    public static double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if (product == "APPLE" || product == "PINEAPPLE" || product == "KIWI" ){
            this.unitPrice = unitPrice;
    }else {System.out.println(" No such product for sell or product not available!!!");
        }
    }

    public Stock(boolean warehouse, boolean available, double unitPrice) {
               this.warehouse= warehouse;
        this.available = available;
        setUnitPrice(unitPrice);
    }
    public Stock(boolean warehouse, boolean available) {
        this.warehouse = warehouse;
        this.available = available;
    }


    public void selectProduct(){
        System.out.print(" Enter 1 for APPLE, 2 for PINEAPPLE, 3 for KIWI : ");
        int x = input.nextInt();
                        switch (x) {
                    case 1:
                        setProduct("APPLE");
                        setUnitPrice(2.35);
                        System.out.printf(" We have %s for you, at price without DDS: %.2f .", getProduct(), getUnitPrice());
                        System.out.print("  Enter how much pieces you wish : ");
                        quantity = input.nextInt();
                        break;
                    case 2:
                        setProduct("PINEAPPLE");
                        setUnitPrice(4.75);
                        System.out.printf(" We have %s for you, at price without DDS: %.2f .", getProduct(), getUnitPrice());
                        System.out.print("  Enter how much pieces you wish : ");
                        quantity = input.nextInt();
                        break;
                    case 3:
                        setProduct("KIWI");
                        setUnitPrice(2.15);
                        System.out.printf(" We have %s for you, at price without DDS: %.2f .", getProduct(), getUnitPrice());
                        System.out.print("  Enter how much pieces you wish : ");
                        quantity = input.nextInt();
                        break;
                default:
                System.out.println("Something went WRONG. Not available choice.\n The program can't generate empty INVOICE!!!");
                    throw new IllegalStateException("Unexpected value: " + x);
                               }
    }

    public void printStock(){
        selectProduct();

        System.out.printf(" You  have selected  %d kg %s , at price: %.2f", this.quantity, getProduct(),getUnitPrice());
finalPrice = quantity *getUnitPrice();

        System.out.println(" Without DDS You must pay: " + getFinalPrice() +" BGN");
    }

}
