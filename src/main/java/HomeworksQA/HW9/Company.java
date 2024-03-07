package HomeworksQA.HW9;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import static java.lang.String.valueOf;

public class Company {

    private static String name;
   private String startDate;

    private String bulstat;
    private String city;
    private static int DDS ;

    public static int getDDS() {
        //if(DDS == 20|| DDS==9 || DDS==0 ){
        if(DDS == 20|| DDS==9  ){
        return DDS;
    }else System.out.println("DDS=99999999 %% not correct. \nRead the lay and enter the DDS..!!!");
        return  DDS=99999999 ;

    }


    public void setDDS(int DDS) {
        if(DDS == 20|| DDS==9 || DDS==0 ){
        this.DDS = DDS;
    }else {
            System.out.println("DDS not correct. \nRead the lay and enter the correct DDS..!!!");
        }}

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
          if (!startDate.isEmpty()){
              this.startDate = startDate;
            } else {
                System.out.println("Empty start date at Company.");
            }
        }


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

    public Company(String name, String startDate, String bulstat, String city, int DDS) {
        setName(name);
        setStartDate(startDate);
        setBulstat(bulstat);
        setCity(city);
        setDDS(DDS);
    }

    //method

    public void printCompanyData(){
        System.out.printf(" Company name - %s %n date of foundation is - %S  %n  BULSTAT BG: %s  %n  City - %s ",getName(), getStartDate(), getBulstat(), getCity() );
    }

    public void printCompany(){
        System.out.printf(" Company name - %s %n date of foundation is - %S  %n  BULSTAT BG: %s  , Work with DDS = %d %%, %n  City - %s ",getName(), getStartDate(), getBulstat(), getDDS(),getCity() );
    }

}
