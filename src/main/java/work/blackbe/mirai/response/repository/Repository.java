package work.blackbe.mirai.response.repository;

import com.google.gson.annotations.SerializedName;

public class Repository {
    public String uuid;
    public String name;
    public int type;
    @SerializedName("list_num")
    public int listNumber;
    public String server;
    @SerializedName("server_type")
    public String serverType;
}
