package tk.winten.app.model.post;

import com.google.gson.annotations.SerializedName;

public class PredecessorVersionItem {

    @SerializedName("id")
    private int id;

    @SerializedName("href")
    private String href;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getHref() {
        return href;
    }
}