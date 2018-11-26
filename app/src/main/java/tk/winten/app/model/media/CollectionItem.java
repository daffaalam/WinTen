package tk.winten.app.model.media;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CollectionItem {

    @SerializedName("attributes")
    private List<Object> attributes;

    @SerializedName("href")
    private String href;

    public void setAttributes(List<Object> attributes) {
        this.attributes = attributes;
    }

    public List<Object> getAttributes() {
        return attributes;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getHref() {
        return href;
    }
}