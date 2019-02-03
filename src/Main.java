import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import AFComposer.*;
public class Main {

    public static void main(String[] args) {
        File inFile = null;
        if (0 < args.length) {
            inFile = new File(args[0]);
            try {
                AfComposer afc = new AfComposer(new FileInputStream(args[0]));
                System.out.println(afc.parse());
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
