package tk.winten.app.network;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import tk.winten.app.model.media.RootMedia;
import tk.winten.app.model.post.RootPosts;

public interface EndPoints {

    @GET("wp/v2/posts")
    Call<List<RootPosts>> readPosts(
            @Query("page") Integer halaman
    );

    @GET("wp/v2/media/{id}")
    Call<RootMedia> readMedia(
            @Path("id") Integer id
    );
}
