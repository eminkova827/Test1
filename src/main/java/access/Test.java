package access;

public class Test {
    public static void main(String[] args) {

        Product product = new Product();

        System.out.println(product.protectedName);
        System.out.println(product.publicName);
        System.out.println(product.defName);



        product.defaultMethod();
        product.protectedMethod();
        product.publicMethod();
    }
}
