package HomeworksQA.HW9;

//import static com.sun.org.apache.xml.internal.serializer.Version.getProduct;

import static HomeworksQA.HW9.Client.getPayDetails;
//import static InterPolyMorthy.Factura.dateOfCreation;

import java.time.LocalDate;

public class Firma_ET extends Company implements Factura{


    private String nameBoss;
    private double initialCapital;
    private double actualCapital;
    private double profit;



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

    public Firma_ET(String name, String startDate, String bulstat,String city, String nameBoss, double initialCapital, double actualCapital, int DDS) {
        super(name, startDate, bulstat, city, DDS);
        setNameBoss(nameBoss);
        setInitialCapital(initialCapital);
        setActualCapital(actualCapital);

    }
    public double viewProfit(){
        profit = getActualCapital()-getInitialCapital();
        System.out.println("\nProfit = " + this.profit);
        return this.profit;
    }





    @Override
    public void dataForClient() {

    }

    @Override
    public void printDataForClient() {
        dataForClient();
    }

    @Override
    public void dataStock() {

        System.out.printf(" You  have selected  %d kg %s , at price: %.2f", Stock.getQuantity(), Stock.getProduct(),Stock.getUnitPrice());


        System.out.println(" You must pay: " +Stock.getFinalPrice()*(1+((double)getDDS())/100) +" BGN");
       // System.out.println("all product "+ Stock.getFinalPrice());
        //System.out.println("DDS - "+ (double)getDDS()/100);
        //System.out.println("+DDS - "+ Stock.getFinalPrice()*((double)getDDS())/100);

    }

    @Override
    public void dataSeller() {
        System.out.printf(" INVOICE  № %d / %s", numFact(), LocalDate.now());
        System.out.println(" \n\bDATA FOR SELLER:" );
        // System.out.println(" №  "+ numFact());
       // System.out.printf("Company name - %s %n   BULSTAT: %s %n City : %s %n MOL : %s",getName(), getBulstat(), getCity(), getNameBoss() );

        System.out.printf(" Company name - %s %n  BULSTAT BG: %s  , Work with DDS = %d , %n  City - %s , \n MOL: %s",getName(), getBulstat(), getDDS(),getCity(), getNameBoss() );

    }

    @Override
    public void PaidDetails() {
        System.out.println(" You have to  pay: " +Stock.getFinalPrice()*(1+((double)getDDS())/100) +" BGN");
        System.out.printf("You selected:The stock wil be payed with : %s", getPayDetails());}


    @Override
    public int numFact() {
        int number =0;
        return ++number;
            }




}


