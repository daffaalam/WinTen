package tk.winten.app;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import tk.winten.app.adapter.MainAdapter;
import tk.winten.app.model.RootPosts;
import tk.winten.app.network.API;
import tk.winten.app.network.Client;

public class Posts extends Fragment {

    RecyclerView rvitem_main;
    API api;
    Call<List<RootPosts>> rootPosts;
    ArrayList<String> title_main;
    ArrayList<String> excerpt_main;
    ArrayList<String> content_main;
    ArrayList<String> url_main;

    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle savedInstanceState) {
        final View view = layoutInflater.inflate(R.layout.posts, viewGroup, false);

        rvitem_main = view.findViewById(R.id.rvitem_main);
        rvitem_main.setHasFixedSize(true);
        rvitem_main.setLayoutManager(new LinearLayoutManager(getContext()));
        title_main = new ArrayList<>();
        excerpt_main = new ArrayList<>();
        content_main = new ArrayList<>();
        url_main = new ArrayList<>();
        api = Client.getInstance();
        rootPosts = api.getPosts();
        rootPosts.enqueue(new Callback<List<RootPosts>>() {
            @Override
            public void onResponse(Call<List<RootPosts>> call, Response<List<RootPosts>> response) {
                if (response.isSuccessful()) {
                    for (int i = 0; i < Objects.requireNonNull(response.body()).size(); i++) {
                        title_main.add(Objects.requireNonNull(response.body()).get(i).getTitle().getRendered());
                        excerpt_main.add(Objects.requireNonNull(response.body()).get(i).getExcerpt().getRendered());
                        content_main.add(Objects.requireNonNull(response.body()).get(i).getContent().getRendered());
                        url_main.add(Objects.requireNonNull(response.body()).get(i).getLink());
                        rvitem_main.setAdapter(new MainAdapter(title_main, excerpt_main, content_main, url_main));
                    }
                    
                } else {
                    rvitem_main.setVisibility(View.GONE);
                    new AlertDialog.Builder(Objects.requireNonNull(view.getContext())).setMessage(response.toString()).show();
                }
            }

            @Override
            public void onFailure(Call<List<RootPosts>> call, Throwable t) {
                rvitem_main.setVisibility(View.GONE);
                Toast.makeText(view.getContext(), t.toString(), Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }
}
