package HomeworksQA.HW9;

public class Test  {
    public static void main(String[] args) {
        System.out.println("\n--------Company Data---------");
        Company viki = new Company("Victorya","33.09.2000","1234567890", "SOFIA", 20);
        viki.printCompany();
        viki.printCompanyData();


        System.out.println("\n-------------Factura Details-------");
        System.out.println("\n---------------seller---------------");

        Firma_ET viki1 = new Firma_ET("Agora", "23.34.5","1234567890","Sofia","SHARO",2.00,2000, 20);

        viki1.printCompany();

        viki1.viewProfit();
        System.out.println("\n-----client------");

        Client miki = new Client("Moni-99", "Sharo","5623789156", "Svoge", "cash");
        miki.dataForClient();

        System.out.println("\n-----warehoouse------");

        Stock prodi= new Stock( true, true);
        //prodi.printStock();
        try{ prodi.printStock();}
        catch (Exception e) {
            System.out.println("Something went wrong. Not available choice.\n Try again!!!.The program will exit");
        return;}

        System.out.println("\n---------FORM: INVOICE---------");

       viki1.printInvoice();
        System.out.println("\n---------SELLER----------\n");
      viki1. dataSeller();
        System.out.println("\n---------GOODS-----------\n");
      viki1.dataStock();

        System.out.println("\n-------PAYDETAILS-------\n");
       viki1.PaidDetails();
        System.out.println("\n---------CLIENT----------\n");
      miki.dataForClient();
        System.out.println("\n-------------------------\n");


        System.out.println("*******");

//viki1.printInvoice();
//viki1.printInvoice();
//viki1.printInvoice();



    }
}
