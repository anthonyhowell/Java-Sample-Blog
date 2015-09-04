package shortcode;

/**
 * Created by anthonyhowell on 9/2/15.
 */
public interface ShortCodeHandler {

    /**
     * Returns a text fragment to replace the short code
     * @param shortCode
     * @return
     */
    public String handle(ShortCode shortCode);

}
