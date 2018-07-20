package tk.winten.app.adapter;

import android.annotation.SuppressLint;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import tk.winten.app.R;

public class PagesAdapter extends RecyclerView.Adapter<PagesAdapter.ViewHolder> {

    private ArrayList<Integer> pages_adapter;

    public PagesAdapter(ArrayList<Integer> pages_adapter) {
        this.pages_adapter = pages_adapter;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.pages, viewGroup, false);
        return new ViewHolder(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, @SuppressLint("RecyclerView") final int i) {
        viewHolder.pages_adapter.setText(pages_adapter.get(i) + 1 + "");
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), pages_adapter.get(i) + 1 + "", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return pages_adapter.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        TextView pages_adapter;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            pages_adapter = itemView.findViewById(R.id.pages_item);
        }
    }
}
