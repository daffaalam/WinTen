package tk.winten.app.model.post;

import com.google.gson.annotations.SerializedName;

public class WpAttachmentItem {

    @SerializedName("href")
    private String href;

    public void setHref(String href) {
        this.href = href;
    }

    public String getHref() {
        return href;
    }
}