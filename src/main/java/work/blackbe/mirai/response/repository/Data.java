package work.blackbe.mirai.response.repository;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Data {
    @SerializedName("repositories_num")
    public Integer repositoriesNumber;
    @SerializedName("repositories_list")
    public List<Repository> repositoriesList;
}
