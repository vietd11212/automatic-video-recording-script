import java.io.*;
import java.net.*;
import java.util.List;

public class Inteaction {
    private List<String> cookies;
    private HttpURLConnection httpConnection;

    // show data from index.html
    public static String showData(){
        URL url;
        BufferedReader urlInput;
        String result = "";
        try{
            // create URL
            url = new URL("file:///C:/Users/vietd/OneDrive/Desktop/index.html");
            try{
                // open Stream
                urlInput = new BufferedReader(new InputStreamReader(url.openStream()));
                // read text
                String line = "";
                while((line = urlInput.readLine()) != null) result +=  "\n" + line;

                //close Stream
                urlInput.close();
            }catch (IOException e) {
                e.printStackTrace();
            }
        }catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return result;
    }

    protected static String showData(String urlAdress) {
        String result = "";
        try {
            // call url-link
            URL url = new URL(""+ urlAdress);
            try {
                //open Stream input
                BufferedReader urlInput = new BufferedReader(new InputStreamReader(url.openStream())) ;
                // read text
                String line = "";
               while((line = urlInput.readLine()) != null) result += line + "\n";
                // close Stream input
                urlInput.close();
           }catch (IOException e){
               e.printStackTrace();
           }
        }catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void main(String[] args){
        String getDataFromURL = "";
        System.out.println(getDataFromURL = showData("https://moodle.rwth-aachen.de"));

    }


}
