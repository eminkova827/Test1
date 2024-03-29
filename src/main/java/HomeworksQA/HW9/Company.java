package HomeworksQA.HW9;

import HomeworksQA.HW9.Date.DateValidator;
import HomeworksQA.HW9.Date.DateValidatorUsingDateFormat;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import static java.lang.String.valueOf;

public class Company extends Date{
    DateValidator  validator = new DateValidatorUsingDateFormat("dd/MM/yyyy");
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
        if (validator.isValid(startDate)){
            this.startDate = startDate;
        } else {this.startDate = "00.00.0000";
            System.out.println("No correct format or Empty start date at Company.Date format is: dd/MM/yyyy .");
        }
    }

    public String getBulstat() {
        return bulstat;
    }

    protected void setBulstat(String bulstat) {
        if( !(bulstat.length() == 0 || bulstat.length()!=10)){
            this.bulstat = bulstat;
        }else { System.out.println("Incorrect BULSTAT - (EIK) !!!.");}}

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

    public void printCompany() throws IllegalStateException {
        try {
            if (!getStartDate().equals("00.00.0000"))
                System.out.printf(" Company name - %s %n date of foundation is - %S  %n  BULSTAT BG: %s  , Work with DDS = %d %%, %n  City - %s ", getName(), getStartDate(), getBulstat(), getDDS(), getCity());
        } catch (Exception e) {
            System.out.println("No correct format or Empty start date at Company.Date format must be: dd/MM/yyyy .");
          }
            }
}
