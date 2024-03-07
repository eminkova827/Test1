package Date;

public class Test {
    public static void main(String[] args) {
      //  DateValidator validator = new DateValidatorUsingDateFormat("MM/dd/yyyy");
        DateValidator validator = new DateValidatorUsingDateFormat("dd/MM/yyyy");

        System.out.println(validator.isValid("02/28/2019"));
        System.out.println(validator.isValid("02/30/2019"));

        System.out.println("---------------------");
        System.out.println("02.12.2022"+validator.isValid("02/12/2022"));
        System.out.println("32.12.2022"+validator.isValid("32/12/2022"));
        System.out.println("02.13.2022"+validator.isValid("02/13/2022"));


    }


}
