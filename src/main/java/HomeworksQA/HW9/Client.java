package HomeworksQA.HW9;

import java.util.Objects;

public class Client {

    private String clientName;

    private String clientMOL;

    private String bulstat;
    private String city;



    // private String payDetails;
   enum payDetails {
       CARD,
       BANK,
       CASH
   }
   private static String payDetails;

    public static String getPayDetails() {
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

    public String getBulstat() {
        return bulstat;
    }

    protected void setBulstat(String bulstat) {
        if( !(bulstat.length() == 0 || bulstat.length()!=10)){
            this.bulstat = bulstat;
        }else { System.out.println("Incorect BULSTAT - (EIK) !!!.");}}

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if (!city.isEmpty()){
            this.city = city;
        }else {
            System.out.println("Enter city: --");
        }}



    public Client(String clientName, String clientMOL, String bulstat, String city, String payDetails) {

        setClientName(clientName);
        setClientMOL(clientMOL);
       setBulstat(bulstat);
        setCity(city);
        this.payDetails = payDetails;
    }


    public void dataForClient() {


    if ((payDetails.equals("cash") ||  payDetails.equals("bank") || payDetails.equals("card"))){

        System.out.printf("Client Company name is: %s  , BULSTAT is BG %s %n client's MOL names is: %s %n The stock wil be payed with : %s", getClientName(),getBulstat(), getClientMOL(),this.payDetails);}
          else{
        System.out.println("Incorrect payment method!!!");
    }}





}
