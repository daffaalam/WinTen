package tk.winten.app.model.media;

import com.google.gson.annotations.SerializedName;

public class AuthorItem {

    @SerializedName("attributes")
    private Attributes attributes;

    @SerializedName("href")
    private String href;

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getHref() {
        return href;
    }
}