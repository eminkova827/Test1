package InterPolyMorthy;

import java.text.DateFormatSymbols;
import java.util.Date;

public interface Factura {
  String typeDocument = "FACTURA";
  String dateOfCreation = "25.02.2024";
  String fprmat = "Standart";
  String productName = "apple";
  double priceForOne = 11;

  int DDS = 20;
  int quantity = 2;








   void dataForClient ();
   void printDataForClient();
   void dataStock();

  void dataSeller();

  void PaidDetails();
   int numFact();






}
