package InterPolyMorthy;

import java.util.Date;

public class Client {

   private String typeDocument = "FACTURA";
   private Date dateOfCreation ;//=  "25.02.2024";
    enum formatFactura {
        STANDART,
        NO_DDS,
        NULL_BASE,
        WHAT_DDS
    }

    enum payDetails {
        CARD,
        BANK,
        CASH
    }

   //private  String productName;// = "apple"; //for example;
    private double priceForOne;// = 11;

   private int DDS ;//= 20;
   private  int quantity;// = 2;


// sett+get



}
