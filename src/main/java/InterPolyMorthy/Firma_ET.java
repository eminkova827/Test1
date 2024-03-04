package InterPolyMorthy;


import java.time.LocalDate;
import java.util.Objects;
import java.util.Scanner;

import static InterPolyMorthy.Company.getName;
import static InterPolyMorthy.Factura.*;


public class Firma_ET extends Company {
    private String nameBoss;
    private double initialCapital;
    private double actualCapital;
   private double profit;
   private String clientName;

   private String clientMOL;
   private String payDetails;

   public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        if(!clientName.isEmpty()){
            this.clientName = clientName;
        }else{
            System.out.println("Enter client name!!");
        }}

    public String getClientMOL() {
        return clientMOL;
    }

    public void setClientMOL(String clientMOL) {
        if(!clientMOL.isEmpty()){
            this.clientMOL = clientMOL;
        }else {
            System.out.println("Enter client MOL name!!");
        }

    }

    public String getPayDetails() {
        return payDetails;
    }

    public void setPayDetails(String payDetails) {
        String a="card";
        String b= "bank";
        String c= "cash";
        if(Objects.equals(payDetails, a) || Objects.equals(payDetails, b) || Objects.equals(payDetails, c)){
            this.payDetails = payDetails;

        }else {
            System.out.println("Incorrect method for payment");
        }}

    Scanner input = new Scanner(System.in);


    public String getNameBoss() {
        return nameBoss;
    }

    protected void setNameBoss(String nameBoss) {
        if(!nameBoss.isEmpty()){
        this.nameBoss = nameBoss;
    }else{
            System.out.println("The name of Big Boss is empty!!!");
        }}

    public double getInitialCapital() {
        return initialCapital;
    }

    protected void setInitialCapital(double initialCapital) {
        if (initialCapital>=2.00){
        this.initialCapital = initialCapital;
    }else{
            System.out.println("No data for initial capital. The lay ask(Чл. 117. (1) ) minimum 2 BGN");
        }}

    public double getActualCapital() {
        return actualCapital;
    }

    public void setActualCapital(double actualCapital) {
        if (! String.valueOf(actualCapital).isEmpty()){
        this.actualCapital = actualCapital;
    }else{
            System.out.println("Enter actual capital!!!");
        }}

    public Firma_ET(String name, String startDate, String bulstat,String city, String nameBoss, double initialCapital, double actualCapital,String clientName,String clientMOL, String payDetails) {
        super(name, startDate, bulstat, city);
        setNameBoss(nameBoss);
        setInitialCapital(initialCapital);
        setActualCapital(actualCapital);
        //setClientName(clientName);
        //setClientMOL(clientMOL);
        //setPayDetails(payDetails);
    }
    public Firma_ET(String name, String startDate, String bulstat,String city, String nameBoss, double initialCapital, double actualCapital) {
        super(name, startDate, bulstat, city);
        setNameBoss(nameBoss);
        setInitialCapital(initialCapital);
        setActualCapital(actualCapital);

    }

       public  double viewProfit(){
        profit = getActualCapital()-initialCapital;
           System.out.println("\nProfit = " + profit);
       return profit;
    }

    @Override
    public void printCompanyData() {
        System.out.printf(" \nCompany name - %s \n   BULSTAT: %s \n City : %s",getName(), getBulstat(), getCity() );
        System.out.printf(" \nName of Boss - %s \n Initial capital - %.2f \n actual capital - %.2f ",getNameBoss(), getInitialCapital(), getActualCapital());
    }





@Override
   public void dataForClient() {

        System.out.println("\nENTER INFORMATION FOR THE CLIENT: ");
        System.out.print("\nEnter CLIENT Company Name: ");
        clientName =  input.nextLine();

        System.out.print("Enter CLIENT'S Company MOL Name: ");
      clientMOL = input.nextLine();

        System.out.print("How  will be payed: cash/ bank/ card: ");
          payDetails = input.nextLine();
         if ((payDetails.equals("cash") ||  payDetails.equals("bank") || payDetails.equals("card"))){

        System.out.printf("Client Company name is: %s %n client's MOL names is: %s %n The stock wil be payed with : %s", clientName, clientMOL,payDetails);}
          else{
              System.out.println("Incorrect payment method!!!");
          }
       // System.out.printf("Client Company name is: %s %n client's MOL names is: %s %n The stock wil be payed : %s", clientName, clientMOL,payDetails);
    }




    @Override
    public void dataStock() {
      //  System.out.printf(" Name of product: %S \n merka:kg \n quantity:%d \n price for 1:%d \n DDS - -%b",productName,quantity,priceForOne,true );

       // int dds = input.nextInt();

      //  System.out.printf("\n Name of product: %s  \n  quantity:%d \n price for 1 kg :%.2f  with  DDS (%)=  %d ", productName,quantity,priceForOne,DDS);
        System.out.printf("\n Name of product: %s  ",productName);
        System.out.printf("\n Quantity:%d kg",quantity);
        System.out.printf("\n Price for 1 kg :%.2f BGN ",priceForOne);
        System.out.printf("\n DDS =  %d  ", DDS);
    }


    @Override
    public void dataSeller() {

        System.out.printf(" Type of document - %s   № %d / %s", typeDocument, numFact(), dateOfCreation);
        System.out.println(" \n\bDATA FOR SELLER:" );
       // System.out.println(" №  "+ numFact());
        System.out.printf("Company name - %s %n   BULSTAT: %s %n City : %s %n MOL : %s",getName(), getBulstat(), getCity(), getNameBoss() );

    }

@Override
   public int numFact(){
       int number =0;
      return ++number;

    }

    @Override
        public void PaidDetails() {
        //dataStock();
        double finalPrice = quantity*priceForOne;
        finalPrice = finalPrice*1.20;
        System.out.println("\nFinal Price - "+ finalPrice+ " BGN");


    }

@Override
public void printDataForClient(){
    System.out.println("\t\bDATA FOR CLIENT:");
    System.out.printf("Client Company name is: %s %n client's MOL names is: %s %n The stock wil be payed with : %s", getClientName(), getClientMOL(),getPayDetails());
    System.out.println(" \nDate: "+ LocalDate.now());

}


  /* public int dds(){
    //   return   dds; //To do
    }*/
   //end
}
