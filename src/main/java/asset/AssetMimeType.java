package asset;

/**
 * Created by anthonyhowell on 8/31/15.
 */
public enum AssetMimeType {

    GIF("image/gif"),

    GZ("application/x-gzip"),

    GZIP("application/x-gzip"),

    JPEG("image/jpeg"),

    JPG("image/jpeg"),

    PNG("image/png");

    // ...etc...

    private String label;

    AssetMimeType(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

}