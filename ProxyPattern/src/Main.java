import org.json.JSONObject;

public class Main {

    public static void main(String[] args) {

        Backend backend = new ProxyBackend();

        JSONObject jsonData = backend.getData("some-query");
        System.out.println("Fetched data: "+jsonData.toString());
    }
}
