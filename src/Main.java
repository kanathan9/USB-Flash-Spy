import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLParameters;
import java.io.*;
import java.net.*;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.time.Duration;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public class Main {
    public static void main(String[] args) throws URISyntaxException {

//        Valid for old versions of Java (<7)
//        try {
//            FileReader fileReader = new FileReader("Files/filetocopy.txt");
//            BufferedReader bufRead = new BufferedReader(fileReader);
//            FileWriter fileWriter = new FileWriter("Files/copiedfile.txt");
//
//            while(true){
//                String line = bufRead.readLine();
//                if(line == null)break;
//                fileWriter.write(line);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        Path sourceFile = Paths.get("Files","filetocopy.txt");
//        Path targetFile = Paths.get("Files","copiedfile2.txt");
//
//        try {
//            Files.copy(sourceFile, targetFile, StandardCopyOption.REPLACE_EXISTING);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        HttpClient http =   HttpClient.newHttpClient();
        HttpRequest HttpReq = HttpRequest.newBuilder()
                .uri(new URI("https://www.google.com"))
                .build();
        try {
            HttpResponse<String> response = http.send(HttpReq, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
