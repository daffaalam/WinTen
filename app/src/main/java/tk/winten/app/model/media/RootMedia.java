package tk.winten.app.model.media;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RootMedia {

    @SerializedName("date")
    private String date;

    @SerializedName("template")
    private String template;

    @SerializedName("_links")
    private Links links;

    @SerializedName("link")
    private String link;

    @SerializedName("description")
    private Description description;

    @SerializedName("caption")
    private Caption caption;

    @SerializedName("type")
    private String type;

    @SerializedName("title")
    private Title title;

    @SerializedName("media_details")
    private MediaDetails mediaDetails;

    @SerializedName("source_url")
    private String sourceUrl;

    @SerializedName("post")
    private int post;

    @SerializedName("alt_text")
    private String altText;

    @SerializedName("media_type")
    private String mediaType;

    @SerializedName("modified")
    private String modified;

    @SerializedName("id")
    private int id;

    @SerializedName("date_gmt")
    private String dateGmt;

    @SerializedName("slug")
    private String slug;

    @SerializedName("modified_gmt")
    private String modifiedGmt;

    @SerializedName("author")
    private int author;

    @SerializedName("comment_status")
    private String commentStatus;

    @SerializedName("ping_status")
    private String pingStatus;

    @SerializedName("mime_type")
    private String mimeType;

    @SerializedName("meta")
    private List<Object> meta;

    @SerializedName("guid")
    private Guid guid;

    @SerializedName("status")
    private String status;

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public String getTemplate() {
        return template;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public Links getLinks() {
        return links;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getLink() {
        return link;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    public Description getDescription() {
        return description;
    }

    public void setCaption(Caption caption) {
        this.caption = caption;
    }

    public Caption getCaption() {
        return caption;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public Title getTitle() {
        return title;
    }

    public void setMediaDetails(MediaDetails mediaDetails) {
        this.mediaDetails = mediaDetails;
    }

    public MediaDetails getMediaDetails() {
        return mediaDetails;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setPost(int post) {
        this.post = post;
    }

    public int getPost() {
        return post;
    }

    public void setAltText(String altText) {
        this.altText = altText;
    }

    public String getAltText() {
        return altText;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    public String getMediaType() {
        return mediaType;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public String getModified() {
        return modified;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setDateGmt(String dateGmt) {
        this.dateGmt = dateGmt;
    }

    public String getDateGmt() {
        return dateGmt;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getSlug() {
        return slug;
    }

    public void setModifiedGmt(String modifiedGmt) {
        this.modifiedGmt = modifiedGmt;
    }

    public String getModifiedGmt() {
        return modifiedGmt;
    }

    public void setAuthor(int author) {
        this.author = author;
    }

    public int getAuthor() {
        return author;
    }

    public void setCommentStatus(String commentStatus) {
        this.commentStatus = commentStatus;
    }

    public String getCommentStatus() {
        return commentStatus;
    }

    public void setPingStatus(String pingStatus) {
        this.pingStatus = pingStatus;
    }

    public String getPingStatus() {
        return pingStatus;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMeta(List<Object> meta) {
        this.meta = meta;
    }

    public List<Object> getMeta() {
        return meta;
    }

    public void setGuid(Guid guid) {
        this.guid = guid;
    }

    public Guid getGuid() {
        return guid;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}