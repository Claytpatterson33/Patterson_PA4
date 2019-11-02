import java.util.HashMap;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;


public class DuplicateCounter
{
    public HashMap <String, Integer> wordCounter;

    public static int count = 0;

    public static  String copy;

    public void count(String dataFile)throws FileNotFoundException
    {
        wordCounter = new HashMap<>();

        Scanner scan = new Scanner(new File(dataFile));

        while(scan.hasNext()){

            copy = scan.next();

            if(!wordCounter.containsKey(copy)) {
                wordCounter.put(copy, 1);
            }

            else
                {
                count = wordCounter.get(copy);

                wordCounter.put(copy, count++);
            }

        }
    }
    public void write (String filename)throws IOException {

        FileWriter fw;

        PrintWriter pw;

        fw = new FileWriter(new File(filename));

        pw = new PrintWriter(fw);

        for(String ctr : wordCounter.keySet())
        {
            pw.println(ctr + " - " + wordCounter.get(ctr));
        }
        pw.flush();
    }
}