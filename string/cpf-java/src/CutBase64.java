import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class CutBase64 {
    public static void main(String[] args) throws IOException {
        String base64 = Files.readString(Path.of("C:\\template\\contractbase64pdf.txt"), StandardCharsets.UTF_8);
        int chunkSize = 500;
        StringBuilder pdfbase64 = new StringBuilder();

        for (int i = 0; i < base64.length(); i += chunkSize) {
            String chunk = base64.substring(i, Math.min(i + chunkSize, base64.length()));
            pdfbase64.append(chunk);
            System.out.println("pdfbase64.append(\"" + chunk + "\");");
        }

        System.out.println();
        System.out.println(pdfbase64);
    }
}
