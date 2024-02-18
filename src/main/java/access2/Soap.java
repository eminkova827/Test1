package access2;

import access.Product;

public class Soap extends Product {

    public String getProtectedName(){
        return super.protectedName;

}
    public void callProtectedMethod(){
        super.protectedMethod();
    }
}
