package HomeworksQA.HW9;

public class Test {
    public static void main(String[] args) {
        System.out.println("\n--------Company Data---------");
        Company viki = new Company("Victorya","33.09.2000","1234567890", "SOFIA", 20);
        viki.printCompany();
        viki.printCompanyData();


        System.out.println("\n--------Factura Details-------\n ------seller");

        Firma_ET viki1 = new Firma_ET("Agora", "23.34.5","1234567890","Sofia","SHARO",2.00,2000, 20);

        viki1.printCompany();

        viki1.viewProfit();
        System.out.println("\n-----client------");

        Client miki = new Client("Moni-99", "Sharo","5623789156", "Svoge", "cash");
        miki.dataForClient();

        System.out.println("\n-----warehoouse------");

        Stock prodi= new Stock( true, true);
        prodi.printStock();

        System.out.println("\n---------FACTURA---------");

        System.out.println("*\n****seler");
      viki1. dataSeller();
        System.out.println("\n*****Stock");
       viki1.dataStock();
        System.out.println("\n*****paidDetails");
       viki1.PaidDetails();
        System.out.println("\n*****client");
      miki.dataForClient();




    }
}
