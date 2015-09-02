package asset;

/**
 * Created by anthonyhowell on 8/31/15.
 */
public class AssetFileSize {

    private Long size;

    public Long getInKilobytes() {
        return size; // convert to kilobytes
    }

    public Long getInMegabytes() {
        return size; // convert to megabytes
    }

    public Long getInGigabytes() {
        return size; // convert to gigabytes
    }

    public Long getInTerabytes() {
        return size;  // convert to terabytes
    }

    public Long getInPetabytes() {
        return size; // convert to petabytes
    }

    public String getInHumanReadableFormat() {
        return "{SIZE} mb"; // convert to the most appropriate measurement in string form
    }

}
