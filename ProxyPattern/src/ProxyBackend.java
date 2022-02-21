import org.json.JSONObject;

public class ProxyBackend implements Backend {
    private RealBackend realBackend;

    public ProxyBackend() {
        realBackend = new RealBackend();
    }

    @Override
    public JSONObject getData(String query) {

        JSONObject jsonData = findInRecentCache(query);

        // data was not found in cache
        if(jsonData == null) {
            jsonData = realBackend.getData(query);
            saveToCache(jsonData);
        }

        return jsonData;
    }

    private JSONObject findInRecentCache(String apiEndPointUrl) {
        // search if the data was saved to cache recently
        return new JSONObject().put("data", "some data");
    }

    private void saveToCache(JSONObject jsonData) {
        // save data to cache
    }
}
