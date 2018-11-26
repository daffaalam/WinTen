package tk.winten.app.model.post;

import com.google.gson.annotations.SerializedName;

public class Guid {

    @SerializedName("rendered")
    private String rendered;

    public void setRendered(String rendered) {
        this.rendered = rendered;
    }

    public String getRendered() {
        return rendered;
    }
}