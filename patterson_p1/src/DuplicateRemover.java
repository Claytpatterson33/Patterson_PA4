import java.util.Scanner;
import java.io.File;
import java.util.HashSet;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
public class DuplicateRemover {

    HashSet<String> uniqueWords;

    public void remove(String dataFile)throws FileNotFoundException{


        uniqueWords = new HashSet<>();

        Scanner new_scan = new Scanner(new File(dataFile));

        while (new_scan.hasNext())
        {
            uniqueWords.add(new_scan.next());

            String cpy_file = new_scan.next();

            System.out.printf("%s\n", cpy_file);
        }

        new_scan.close();
    }

    public void write(String outputFile)throws FileNotFoundException
    {

        PrintWriter print_file = new PrintWriter(new File(outputFile));

        for (String string: uniqueWords)
        {
            print_file.println(string);
        }

        print_file.flush();
    }
}