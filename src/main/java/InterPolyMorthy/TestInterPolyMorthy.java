package InterPolyMorthy;

public class TestInterPolyMorthy {
    public static void main(String[] args) {

/*//Company test = new Company(" Agora", " 01.01.2000", "1234567891");

        //test.printCompanyData();
        // System.out.println("------------------");*/

        System.out.println("\n-----------------");
Firma_ET test1 = new Firma_ET("Agora", "23.34.5","1234567890","Sofia","SHARO",2.00,2000);

test1.printCompanyData();
test1.viewProfit();

        System.out.println("--------factura details-------");
        test1.dataForClient();
        test1. dataSeller();
       test1.dataStock();
       test1.PaidDetails();

    }
}
