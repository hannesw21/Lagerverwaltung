package daoservice;
 
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import de.sbs.jsonhelper.JSONHelper;
 
public class DAOHttpService  {
    public String adresse = "https://jsonplaceholder.typicode.com/posts";
    public static String useService(String adresse) {
        try {
            URI uri = new URI(adresse);
            URL url = uri.toURL();
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
            if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                StringBuilder response = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();
                return response.toString();
            }
 
        }
 
        catch (Exception e) {
            e.printStackTrace();
        }
 
        return null;
 
    }
    public static String getJSONOffline(){
        return JSONHelper.getJSONOffline();
    }
}



    

