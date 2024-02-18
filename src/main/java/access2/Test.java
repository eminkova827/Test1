package access2;

import access.Product;

public class Test {

    public static void main(String[] args) {


    Product product = new Product();
    Soap soap = new Soap();

    //System.out.println(product.getProtectedName);
        System.out.println(product.publicName);
        //System.out.println(product.defName);// not possible



       // product.defaultMethod();
      //  product.callProtectedMethod();
        product.publicMethod();

}}
