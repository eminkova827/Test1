package exceptions;

import java.io.*;

public class ReadFile {
    public static void read(String fullPathName) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(fullPathName);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));

        String tmp = null;
        while ((tmp = bufferedReader.readLine()) !=null){
            System.out.println(tmp);
        }

        bufferedReader.close();//to be closed!!!!
        fileInputStream.close();// to be closed !!!
    }
}
