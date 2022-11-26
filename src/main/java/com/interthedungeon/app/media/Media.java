public class Media {
    private String id;
    private String name;
    private String alternativeText;
    private String caption;
    private int width;
    private int height;
    private String hash;
    private String ext;
    private String mime;
    private double size;
    private String url;
    private String previewUrl;
    private String provider;
    private String provider_metadata;
    private ImageFormats formats;

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

    public String getHash() {
        return this.hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getExt() {
        return this.ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    public String getMime() {
        return this.mime;
    }

    public void setMime(String mime) {
        this.mime = mime;
    }

    public double getSize() {
        return this.size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPreviewUrl() {
        return this.previewUrl;
    }

    public void setPreviewUrl(String previewUrl) {
        this.previewUrl = previewUrl;
    }

    public String getProvider() {
        return this.provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getProvider_metadata() {
        return this.provider_metadata;
    }

    public void setProvider_metadata(String provider_metadata) {
        this.provider_metadata = provider_metadata;
    }

    public ImageFormats getFormats() {
        return this.formats;
    }

    public void setFormats(ImageFormats formats) {
        this.formats = formats;
    }
}
