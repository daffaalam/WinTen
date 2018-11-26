package tk.winten.app.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;

import tk.winten.app.R;
import tk.winten.app.model.post.RootPosts;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.HomeHolder> {

    Context context;
    List<RootPosts> rootPostsList;

    public HomeAdapter(Context context, List<RootPosts> rootPostsList) {
        this.context = context;
        this.rootPostsList = rootPostsList;
    }

    @NonNull
    @Override
    public HomeHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new HomeHolder(LayoutInflater.from(context).inflate(R.layout.item_home, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull final HomeHolder holder, final int position) {
        holder.tvHomeAdapterTitle.setText(Html.fromHtml(rootPostsList.get(position).getTitle().getRendered()));
        try {
            holder.tvHomeAdapterSub.setText(new SimpleDateFormat("EEEE, dd MMMM yyyy", Locale.US).format(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US).parse(rootPostsList.get(position).getDate())));
        } catch (ParseException e) {
            holder.tvHomeAdapterSub.setText("");
        }
    }

    @Override
    public int getItemCount() {
        return rootPostsList.size();
    }

    class HomeHolder extends RecyclerView.ViewHolder {

        ImageView ivHomeAdapter;
        TextView tvHomeAdapterTitle, tvHomeAdapterSub;

        HomeHolder(View itemView) {
            super(itemView);
            ivHomeAdapter = itemView.findViewById(R.id.ivItemHome);
            tvHomeAdapterTitle = itemView.findViewById(R.id.tvItemHomeTitle);
            tvHomeAdapterSub = itemView.findViewById(R.id.tvItemHomeSub);
        }
    }
}
