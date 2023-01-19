package work.blackbe.mirai.utils;

import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.BasicHttpClientResponseHandler;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.ClassicHttpResponse;
import org.apache.hc.core5.http.HttpEntity;
import org.apache.hc.core5.http.io.HttpClientResponseHandler;
import org.apache.hc.core5.http.io.entity.EntityUtils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Network {
    public static String sendGetRequest(String url, HashMap<String, Object> map) {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        String response = null;
        HttpGet httpGet = new HttpGet(url);

        map.forEach(httpGet::setHeader);

        try {
            BasicHttpClientResponseHandler handler = new BasicHttpClientResponseHandler();
            response = httpClient.execute(httpGet, handler);
            httpClient.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return response;
    }
}
