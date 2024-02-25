package InterPolyMorthy;

import java.util.Objects;
import java.util.Scanner;

public abstract class  Company implements Factura{

    private static String name;
    private String startDate;
    //private long bulstat;
    private String bulstat;
    private String city;




    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if (!city.isEmpty()){
        this.city = city;
    }else {
            System.out.println("Enter city: --");
        }}




    public static String getName() {
        return name;
    }

    public void setName(String name) {
        if ( ! name.isEmpty()){
        this.name = name;
    }else{
            System.out.println("Empty name at Company.");}}

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        if ( ! startDate.isEmpty()){
            this.startDate = startDate;
        }else{
            System.out.println("Empty start date at Company.");}}

   /* public long getBulstat() {
        return bulstat;
    }

    protected void setBulstat(int bulstat) {
        if ( String.valueOf(bulstat).length() == 5 ){
        this.bulstat = bulstat;
    } else {
            System.out.println("Incorect BULSTAT - (EIK).");
        }}*/

    public String getBulstat() {
        return bulstat;
    }

    protected void setBulstat(String bulstat) {
        if( !(bulstat.length() == 0 || bulstat.length()!=10)){
        this.bulstat = bulstat;
    }else { System.out.println("Incorect BULSTAT - (EIK) !!!.");}}

    //constructor
    public Company(String name, String startDate, String bulstat, String city) {
        setName(name);
        setStartDate(startDate);
        setBulstat(bulstat);
        setCity(city);
    }

    //method

    public void printCompanyData(){
        System.out.printf(" Company name - %s %n date of foundation is - %S  %n  A: %s  %n  City - %s ",getName(), getStartDate(), getBulstat(), getCity() );
    }



}



