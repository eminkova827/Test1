package HomeworksQA.HW6;
import java.util.Scanner;
public class Password {



    private String password;

    public String getPassword() {
        return this.password;
    }



    // constructor
    public Password(String password) {
        this.password = password;
    }

    // validation for pass
    public void countPass(String abc) {
        if (password.length() < 8) {
            System.out.println("No enouph length of password. It mast be min 8 symbols");
        } else {
            return;

        }
    }
    // from net

    public boolean checkPass() {

        // 8 СЃРёРјРІРѕР»Р°: СЃРёРјРІРѕР», С‡РёСЃР»Рѕ Рё Р±СѓРєРІРё
        int countWords = password.split("\\s").length; // broi wywedenite dumi
        System.out.println("number of words in abc: " + countWords);
        if (countWords > 1) {
            System.out.printf("Password must contain only 1 word!!!You entered %d words => %s as pasword", countWords,
                    password);
        } else {
            if (password.length() < 8) {
                System.out.println("QA-Incorrect password. It must be min 8 chracters");
                return false;
            } else {
                char c;
                int count = 0;
                int countLett = 0;
                int countSymb = 0;
                for (int i = 0; i < password.length(); i++) {
                    c = password.charAt(i);
                    if (Character.isLetter(c)) {
                        countLett++;
                    }
                    if (c == '!' || c == '@' || c == '#' || c == '$' || c == '%' || c == '&' || c == '*') { // check
                        // symbols
                        countSymb++;
                    }
                    if (Character.isDigit(c)) {
                        count++;
                    }
                }
                System.out.printf("count = %d , countLett = %d, countSymb = %d", count, countLett, countSymb);
                if (count < 1 || count > 1 || countLett > 6 || countSymb < 1 || countSymb > 1) {
                    // return false;
                    System.out.println("\nQA-Incorrect password. It must contains 1 symbol, 1 number and 6 letters");

                } else {
                    System.out.printf("\nQA-Valid password:%s It contains 1 symbol, 1 number and 6 letters",
                            password);
                }
            }
        }

        return false;
    }


    /*public static void askPassword(){
        Scanner input = new Scanner(System.in);

        for (int i = 1; i < 4; i++) {
            System.out.println("Enter word for pass.");
            Password password1 = new Password(input.next());
        }
    }*/

}
//// @nnamar1a - false
// @nnamar1 - ok







    //end

