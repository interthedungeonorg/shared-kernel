public class ImageFormats {
    private String id;
    private String name;
    private String alternativeText;
    private String caption;
    private int width;
    private int height;
    private ImageFormat small;
    private ImageFormat medium;
    private ImageFormat thumbnail;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlternativeText() {
        return this.alternativeText;
    }

    public void setAlternativeText(String alternativeText) {
        this.alternativeText = alternativeText;
    }

    public String getCaption() {
        return this.caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public ImageFormat getSmall() {
        return this.small;
    }

    public void setSmall(ImageFormat small) {
        this.small = small;
    }

    public ImageFormat getMedium() {
        return this.medium;
    }

    public void setMedium(ImageFormat medium) {
        this.medium = medium;
    }

    public ImageFormat getThumbnail() {
        return this.thumbnail;
    }

    public void setThumbnail(ImageFormat thumbnail) {
        this.thumbnail = thumbnail;
    }
}
