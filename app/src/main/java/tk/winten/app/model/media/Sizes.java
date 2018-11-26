package tk.winten.app.model.media;

import com.google.gson.annotations.SerializedName;

public class Sizes {

    @SerializedName("thumbnail")
    private Thumbnail thumbnail;

    @SerializedName("large")
    private Large large;

    @SerializedName("et-builder-portfolio-image-single")
    private EtBuilderPortfolioImageSingle etBuilderPortfolioImageSingle;

    @SerializedName("et-builder-gallery-image-portrait")
    private EtBuilderGalleryImagePortrait etBuilderGalleryImagePortrait;

    @SerializedName("extra-image-square-small")
    private ExtraImageSquareSmall extraImageSquareSmall;

    @SerializedName("et-builder-post-main-image")
    private EtBuilderPostMainImage etBuilderPostMainImage;

    @SerializedName("extra-image-huge")
    private ExtraImageHuge extraImageHuge;

    @SerializedName("medium")
    private Medium medium;

    @SerializedName("extra-image-small")
    private ExtraImageSmall extraImageSmall;

    @SerializedName("extra-image-square-medium")
    private ExtraImageSquareMedium extraImageSquareMedium;

    @SerializedName("extra-image-medium")
    private ExtraImageMedium extraImageMedium;

    @SerializedName("et-builder-portfolio-image")
    private EtBuilderPortfolioImage etBuilderPortfolioImage;

    @SerializedName("et-builder-post-main-image-fullwidth")
    private EtBuilderPostMainImageFullwidth etBuilderPostMainImageFullwidth;

    @SerializedName("extra-image-single-post")
    private ExtraImageSinglePost extraImageSinglePost;

    @SerializedName("medium_large")
    private MediumLarge mediumLarge;

    @SerializedName("full")
    private Full full;

    public void setThumbnail(Thumbnail thumbnail) {
        this.thumbnail = thumbnail;
    }

    public Thumbnail getThumbnail() {
        return thumbnail;
    }

    public void setLarge(Large large) {
        this.large = large;
    }

    public Large getLarge() {
        return large;
    }

    public void setEtBuilderPortfolioImageSingle(EtBuilderPortfolioImageSingle etBuilderPortfolioImageSingle) {
        this.etBuilderPortfolioImageSingle = etBuilderPortfolioImageSingle;
    }

    public EtBuilderPortfolioImageSingle getEtBuilderPortfolioImageSingle() {
        return etBuilderPortfolioImageSingle;
    }

    public void setEtBuilderGalleryImagePortrait(EtBuilderGalleryImagePortrait etBuilderGalleryImagePortrait) {
        this.etBuilderGalleryImagePortrait = etBuilderGalleryImagePortrait;
    }

    public EtBuilderGalleryImagePortrait getEtBuilderGalleryImagePortrait() {
        return etBuilderGalleryImagePortrait;
    }

    public void setExtraImageSquareSmall(ExtraImageSquareSmall extraImageSquareSmall) {
        this.extraImageSquareSmall = extraImageSquareSmall;
    }

    public ExtraImageSquareSmall getExtraImageSquareSmall() {
        return extraImageSquareSmall;
    }

    public void setEtBuilderPostMainImage(EtBuilderPostMainImage etBuilderPostMainImage) {
        this.etBuilderPostMainImage = etBuilderPostMainImage;
    }

    public EtBuilderPostMainImage getEtBuilderPostMainImage() {
        return etBuilderPostMainImage;
    }

    public void setExtraImageHuge(ExtraImageHuge extraImageHuge) {
        this.extraImageHuge = extraImageHuge;
    }

    public ExtraImageHuge getExtraImageHuge() {
        return extraImageHuge;
    }

    public void setMedium(Medium medium) {
        this.medium = medium;
    }

    public Medium getMedium() {
        return medium;
    }

    public void setExtraImageSmall(ExtraImageSmall extraImageSmall) {
        this.extraImageSmall = extraImageSmall;
    }

    public ExtraImageSmall getExtraImageSmall() {
        return extraImageSmall;
    }

    public void setExtraImageSquareMedium(ExtraImageSquareMedium extraImageSquareMedium) {
        this.extraImageSquareMedium = extraImageSquareMedium;
    }

    public ExtraImageSquareMedium getExtraImageSquareMedium() {
        return extraImageSquareMedium;
    }

    public void setExtraImageMedium(ExtraImageMedium extraImageMedium) {
        this.extraImageMedium = extraImageMedium;
    }

    public ExtraImageMedium getExtraImageMedium() {
        return extraImageMedium;
    }

    public void setEtBuilderPortfolioImage(EtBuilderPortfolioImage etBuilderPortfolioImage) {
        this.etBuilderPortfolioImage = etBuilderPortfolioImage;
    }

    public EtBuilderPortfolioImage getEtBuilderPortfolioImage() {
        return etBuilderPortfolioImage;
    }

    public void setEtBuilderPostMainImageFullwidth(EtBuilderPostMainImageFullwidth etBuilderPostMainImageFullwidth) {
        this.etBuilderPostMainImageFullwidth = etBuilderPostMainImageFullwidth;
    }

    public EtBuilderPostMainImageFullwidth getEtBuilderPostMainImageFullwidth() {
        return etBuilderPostMainImageFullwidth;
    }

    public void setExtraImageSinglePost(ExtraImageSinglePost extraImageSinglePost) {
        this.extraImageSinglePost = extraImageSinglePost;
    }

    public ExtraImageSinglePost getExtraImageSinglePost() {
        return extraImageSinglePost;
    }

    public void setMediumLarge(MediumLarge mediumLarge) {
        this.mediumLarge = mediumLarge;
    }

    public MediumLarge getMediumLarge() {
        return mediumLarge;
    }

    public void setFull(Full full) {
        this.full = full;
    }

    public Full getFull() {
        return full;
    }
}