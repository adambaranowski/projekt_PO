import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static String fileName = "test.txt";
    public static Long productId = (long)1234;

    public static void removeProductById(Long productId) throws IOException
    {
        FileOutputStream fileOutputStream = new FileOutputStream(fileName, true);
        FileReader fileReader = new FileReader(fileName);
        PrintWriter printWriter = new PrintWriter(fileOutputStream);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        List<String[] > fileInList= new ArrayList<String[] >();
        String line = bufferedReader.readLine();



        while (line!=null){
            fileInList.add(line.split("#"));
            line=bufferedReader.readLine();
        }


        /*
        for (String[] s: fileInList
             ) {
            for (String ss: s
                 ) {
                System.out.println(ss);
            }


        }

        */


        printWriter.close();
        fileOutputStream.close();
    }

    public static void main(String[] args) throws IOException {
        removeProductById(productId);

    }
}
