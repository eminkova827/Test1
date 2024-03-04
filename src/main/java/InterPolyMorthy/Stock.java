package InterPolyMorthy;

public class Stock {

    String productName = "apple"; //for example;
    double priceForOne;

    public enum Products {
        APPLE(10),
        KIWI(20),
        PINEAPPLE(25);
        private int value;
        private String selectProduct;
        private Products(int value) {
            this.value = value;
        }
        private Products(String selectProduct){
            this.selectProduct=selectProduct;}

        public int getValue() {
            return this.value;
        }
        public String getSelectProduct(){
            return this.selectProduct;
        }
    }

    public Stock(String productName, double priceForOne, String Products) {
        this.productName = productName;
        this.priceForOne = priceForOne;
        //this.Products = Products;
    }


    //end
}
