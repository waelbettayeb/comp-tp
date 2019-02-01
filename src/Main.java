import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {
        File inFile = null;
        if (0 < args.length) {
            inFile = new File(args[0]);
            try {
                String content = readFile(args[0], Charset.defaultCharset());
                System.out.println(content);


            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.err.println("Invalid arguments count:" + args.length);
        }
    }
    static String readFile(String path, Charset encoding) throws IOException {
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        return new String(encoded, encoding);
    }
}
