package api;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;


public class DiscordClient {

    private final CloseableHttpClient client;
    private String webHookUrl;

    public DiscordClient() {
        this("");
    }
    public DiscordClient(String webhookURL) {
        this.client = HttpClients.createDefault();
        this.webHookUrl = webhookURL;
    }

    public void setWebHookUrl(String webHookUrl) {
        this.webHookUrl = webHookUrl;
    }

    private boolean isGoodResponse(CloseableHttpResponse response) {
        int responseCode = response.getStatusLine().getStatusCode();
        return responseCode == Utility.SUCESS_CODE || responseCode == Utility.SUCESS_CODE_CREATED || responseCode == Utility.SUCCESS_CODE_NO_CONTENT;
    }

    public void postRequest(String payload) throws Exception {
        HttpPost post = new HttpPost(webHookUrl);
        StringEntity requestEntity = new StringEntity(payload, ContentType.APPLICATION_JSON);
        post.setEntity(requestEntity);
        CloseableHttpResponse response = client.execute(post);

        if(isGoodResponse(response)) {
            System.out.println("Good Response");
        } else {
            throw new Exception("Bad Request got Status Code: " + response.getStatusLine().getStatusCode());
        }
    }

}
