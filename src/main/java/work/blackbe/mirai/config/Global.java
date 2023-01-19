package work.blackbe.mirai.config;

import com.google.gson.Gson;
import work.blackbe.mirai.response.Response;
import work.blackbe.mirai.response.repository.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Global {
    public static final String ADDRESS = "https://api.blackbe.work/openapi/v3/";

    public static final String API_PRIVATE_REPOSITORIES_LIST = "https://api.blackbe.work/openapi/v3/private/repositories/list";

    public static final Map<String, work.blackbe.mirai.response.repository.Response> REPOSITORIES_RESPONSE_LIST = new HashMap<>();
    public static final Gson GSON = new Gson();

    public static final Map<Long, Response> RESPONSE_TEMP = new HashMap<>();

    public static final int TIME_OVERDUE = 86400;
}
