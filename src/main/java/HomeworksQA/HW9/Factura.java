package HomeworksQA.HW9;

import java.util.LinkedList;

public interface Factura {
    LinkedList<Integer> Invoices = new LinkedList<>();


    void dataForClient ();
    void printDataForClient();
    void dataStock();

    void dataSeller();

    void PaidDetails();

    String numInvoice();
void printInvoice();


}
