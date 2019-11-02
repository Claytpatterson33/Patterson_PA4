import java.io.IOException;

public class Application {
    public static void main(String args[])throws IOException {
        DuplicateCounter count = new DuplicateCounter();

        count.count("problem2.txt");

        count.write(" unique_word_counts.txt");

    }
}
