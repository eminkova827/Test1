package exceptions;

public class CookieMonsterSadException extends Exception {
    public CookieMonsterSadException(String message, int cookiesCount){//proper custem exception

        super(message+".    !!!You cannot divide " + cookiesCount+" cookies by 0"+
                "\n Sorry!!!");
    }
}
