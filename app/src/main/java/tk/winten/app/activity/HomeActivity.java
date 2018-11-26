package tk.winten.app.activity;

import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import tk.winten.app.R;
import tk.winten.app.adapter.HomeAdapter;
import tk.winten.app.model.post.RootPosts;
import tk.winten.app.network.EndPoints;
import tk.winten.app.network.RestAPI;
import tk.winten.app.tool.Functions;

public class HomeActivity extends Functions implements SwipeRefreshLayout.OnRefreshListener {

    SwipeRefreshLayout srlHome;
    RecyclerView rvHome;
    Integer page;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        srlHome = findViewById(R.id.srlHome);
        rvHome = findViewById(R.id.rvHome);
        page = 1;
        srlHome.setRefreshing(true);
        loadPosts(page);
    }

    public void loadPosts(Integer halaman) {
        RestAPI.getRetrofit().create(EndPoints.class).readPosts(halaman).enqueue(new Callback<List<RootPosts>>() {
            @Override
            public void onResponse(Call<List<RootPosts>> call, Response<List<RootPosts>> response) {
                srlHome.setRefreshing(false);
                if (response.body() != null) {
                    rvHome.setLayoutManager(new LinearLayoutManager(HomeActivity.this));
                    rvHome.setAdapter(new HomeAdapter(HomeActivity.this, response.body()));
                }
            }

            @Override
            public void onFailure(Call<List<RootPosts>> call, Throwable t) {
                srlHome.setRefreshing(false);
                myToast(t.getMessage());
            }
        });
    }

    @Override
    public void onRefresh() {
        loadPosts(page);
    }
}
