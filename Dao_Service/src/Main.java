import daoservice.DAOHttpService;
import daoservice.DAOJasonService;

public class Main {
    public static void main (String[] args) {
String json = DAOHttpService.getJSONOffline();
System.out.println(json);
DAOJasonService.deserialize(json);
    }
    }

