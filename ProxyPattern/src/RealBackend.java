import org.json.JSONObject;

public class RealBackend implements Backend {

    @Override
    public JSONObject getData(String query) {
        // fetch data from backend
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("data", "some data");
        return jsonObject;
    }
}
