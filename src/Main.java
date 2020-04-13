import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main {
    public static void main(String args) throws IOException {
        HttpURLConnection con = (HttpURLConnection) new URL("moodle.rwth-aachen.de").openConnection();
        con.setRequestMethod("GET");
        con.addRequestProperty("Cookie","registration=MoodleSession;profile-data=ab233c03868502eaefef92161204945e");
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();
    }
}
