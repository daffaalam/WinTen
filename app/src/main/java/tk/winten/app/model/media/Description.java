package tk.winten.app.model.media;

import com.google.gson.annotations.SerializedName;

public class Description {

    @SerializedName("rendered")
    private String rendered;

    public void setRendered(String rendered) {
        this.rendered = rendered;
    }

    public String getRendered() {
        return rendered;
    }
}