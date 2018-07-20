package tk.winten.app.network;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import tk.winten.app.model.RootPosts;

public interface API {
    @GET("wp/v2/posts?per_page=100")
    Call<List<RootPosts>> getPosts();
}
