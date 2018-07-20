package tk.winten.app.adapter;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;

import java.util.ArrayList;

import tk.winten.app.ContentActivity;
import tk.winten.app.R;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {

    private ArrayList<String> title_adapter;
    private ArrayList<String> excerpt_adapter;
    private ArrayList<String> content_adapter;
    private ArrayList<String> url_adapter;

    public MainAdapter(ArrayList<String> title_adapter, ArrayList<String> excerpt_adapter, ArrayList<String> content_adapter, ArrayList<String> url_adapter) {
        this.title_adapter = title_adapter;
        this.excerpt_adapter = excerpt_adapter;
        this.content_adapter = content_adapter;
        this.url_adapter = url_adapter;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, @SuppressLint("RecyclerView") final int i) {
        viewHolder.title_adapter.setText(title_adapter.get(i));
//        viewHolder.excerpt_adapter.setBackgroundColor(Color.TRANSPARENT);
//        viewHolder.excerpt_adapter.loadData(excerpt_adapter.get(i), "text/html", "utf-8");
//        viewHolder.excerpt_adapter.getSettings().setDefaultFontSize(14);
        viewHolder.card_adapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.getContext().startActivity(new Intent(view.getContext(), ContentActivity.class)
                        .putExtra("JUDUL", title_adapter.get(i))
                        .putExtra("KONTEN", content_adapter.get(i))
                        .putExtra("URL", url_adapter.get(i))
                );
            }
        });
    }

    @Override
    public int getItemCount() {
        return title_adapter.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        CardView card_adapter;
        TextView title_adapter;
//        WebView excerpt_adapter;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            card_adapter = itemView.findViewById(R.id.card_item);
            title_adapter = itemView.findViewById(R.id.title_item);
//            excerpt_adapter = itemView.findViewById(R.id.excerpt_item);
        }
    }
}
