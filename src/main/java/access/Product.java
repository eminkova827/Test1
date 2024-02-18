package access;

public class Product {
    // can be accessed from any class in any package
    public String publicName;

    //class in this package; and subclass in different package(inheritance)
    protected String  protectedName;

    // //can be aacessed only from classses in the package
    String defName;
    //only from the current (this) cclass

    private String privateName;

    private void privateMethod(){
        System.out.println("Calling private method");
    }
void defaultMethod(){
    System.out.println("Calling default method");

}
    protected void protectedMethod(){
        System.out.println("Calling protected method");
    }

    public void publicMethod(){
        System.out.println("Calling private method");
    }


}
