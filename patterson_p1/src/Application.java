import java.io.FileNotFoundException;
public class Application {

    public static void main(String[] args)throws FileNotFoundException{

        DuplicateRemover file_D = new DuplicateRemover();

        file_D.remove("problem1.txt");

        file_D.write("unique_words.txt");
    }
}