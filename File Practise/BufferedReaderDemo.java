import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class BufferedReaderDemo {
    public static void main(String[] args) throws Exception {
        Reader fr = new FileReader("dir/sample.tst");
        BufferedReader br  = new BufferedReader(fr);
        while (true) {
            String s = br.readLine();
            if (s==null) break;
            System.out.println(s);
        }

        br.close();
        fr.close();
    }
}
