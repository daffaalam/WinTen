package tk.winten.app.model.media;

import com.google.gson.annotations.SerializedName;

public class Attributes {

    @SerializedName("embeddable")
    private boolean embeddable;

    public void setEmbeddable(boolean embeddable) {
        this.embeddable = embeddable;
    }

    public boolean isEmbeddable() {
        return embeddable;
    }
}