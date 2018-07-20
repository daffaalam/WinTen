package tk.winten.app;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import tk.winten.app.adapter.PagesAdapter;
import tk.winten.app.model.RootPosts;
import tk.winten.app.network.API;
import tk.winten.app.network.Client;

public class MainActivity extends AppCompatActivity {

    //    RecyclerView rvitem_main;
    RecyclerView rvpages_main;
    //    ArrayList<String> title_main;
//    ArrayList<String> excerpt_main;
    ArrayList<Integer> pages_main;
    API api;
    Call<List<RootPosts>> rootPosts;
    ProgressDialog progdia_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progdia_main = new ProgressDialog(this);
        progdia_main.show();
        progdia_main.setMessage("loading...");
//        rvitem_main = findViewById(R.id.rvitem_main);
//        rvitem_main.setHasFixedSize(true);
//        rvitem_main.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        rvpages_main = findViewById(R.id.rvpages_main);
        rvpages_main.setHasFixedSize(true);
        rvpages_main.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
//        title_main = new ArrayList<>();
//        excerpt_main = new ArrayList<>();
        pages_main = new ArrayList<>();
        api = Client.getInstance();
        rootPosts = api.getPosts();
        rootPosts.enqueue(new Callback<List<RootPosts>>() {
            @Override
            public void onResponse(Call<List<RootPosts>> call, Response<List<RootPosts>> response) {
                progdia_main.dismiss();
                if (response.isSuccessful()) {
//                    for (int i = 0; i < Objects.requireNonNull(response.body()).size(); i++) {
//                        title_main.add(Objects.requireNonNull(response.body()).get(i).getTitle().getRendered());
//                        excerpt_main.add(Objects.requireNonNull(response.body()).get(i).getExcerpt().getRendered());
//                        rvitem_main.setAdapter(new MainAdapter(title_main, excerpt_main));
//                    }
                    for (int i = 0; i < Integer.parseInt(response.headers().get("X-WP-TotalPages")); i++) {
                        pages_main.add(i);
                        rvpages_main.setAdapter(new PagesAdapter(pages_main));
                    }
                } else {
//                    rvitem_main.setVisibility(View.GONE);
                    new AlertDialog.Builder(getApplicationContext()).setMessage(response.toString()).show();
                }
            }

            @Override
            public void onFailure(Call<List<RootPosts>> call, Throwable t) {
//                rvitem_main.setVisibility(View.GONE);
                progdia_main.dismiss();
                Toast.makeText(MainActivity.this, t.toString(), Toast.LENGTH_LONG).show();
                Log.v("LOG", t.toString());
            }
        });
        fragment(new Posts());
    }

    public void fragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame_main, fragment);
        fragmentTransaction.commit();
    }
}
